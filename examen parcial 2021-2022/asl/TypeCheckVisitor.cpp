//////////////////////////////////////////////////////////////////////
//
//    TypeCheckVisitor - Walk the parser tree to do the semantic
//                       typecheck for the Asl programming language
//
//    Copyright (C) 2017-2023  Universitat Politecnica de Catalunya
//
//    This library is free software; you can redistribute it and/or
//    modify it under the terms of the GNU General Public License
//    as published by the Free Software Foundation; either version 3
//    of the License, or (at your option) any later version.
//
//    This library is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Affero General Public License for more details.
//
//    You should have received a copy of the GNU Affero General Public
//    License along with this library; if not, write to the Free Software
//    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
//
//    contact: José Miguel Rivero (rivero@cs.upc.edu)
//             Computer Science Department
//             Universitat Politecnica de Catalunya
//             despatx Omega.110 - Campus Nord UPC
//             08034 Barcelona.  SPAIN
//
//////////////////////////////////////////////////////////////////////

#include "TypeCheckVisitor.h"
#include "antlr4-runtime.h"

#include "../common/TypesMgr.h"
#include "../common/SymTable.h"
#include "../common/TreeDecoration.h"
#include "../common/SemErrors.h"

#include <iostream>
#include <string>

// uncomment the following line to enable debugging messages with DEBUG*
//#define DEBUG_BUILD
#include "../common/debug.h"

// using namespace std;


// Constructor
TypeCheckVisitor::TypeCheckVisitor(TypesMgr       & Types,
                                   SymTable       & Symbols,
                                   TreeDecoration & Decorations,
                                   SemErrors      & Errors) :
  Types{Types},
  Symbols{Symbols},
  Decorations{Decorations},
  Errors{Errors} {
}

// Accessor/Mutator to the attribute currFunctionType
TypesMgr::TypeId TypeCheckVisitor::getCurrentFunctionTy() const {
  return currFunctionType;
}

void TypeCheckVisitor::setCurrentFunctionTy(TypesMgr::TypeId type) {
  currFunctionType = type;
}

// Methods to visit each kind of node:
//
antlrcpp::Any TypeCheckVisitor::visitProgram(AslParser::ProgramContext *ctx) {
  DEBUG_ENTER();
  SymTable::ScopeId sc = getScopeDecor(ctx);
  Symbols.pushThisScope(sc);
  for (auto ctxFunc : ctx->function()) { 
    visit(ctxFunc);
  }
  if (Symbols.noMainProperlyDeclared())
    Errors.noMainProperlyDeclared(ctx);
  Symbols.popScope();
  Errors.print();
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitFunction(AslParser::FunctionContext *ctx) {
  DEBUG_ENTER();
  SymTable::ScopeId sc = getScopeDecor(ctx);
  TypesMgr::TypeId ty = Types.createVoidTy();
  if(ctx ->basic_type){
    visit(ctx ->basic_type);
    ty = getTypeDecor(ctx->basic_type);
  }
  
  setCurrentFunctionTy(ty);
  Symbols.pushThisScope(sc);
  // Symbols.print();
  visit(ctx->statements());
  Symbols.popScope();
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitStructAccess(AslParser::StructAccessContext *ctx){
  DEBUG_ENTER();
  visit(ctx->ident());
  TypesMgr::TypeId tf = Types.createErrorTy();
  TypesMgr::TypeId t = getTypeDecor(ctx->ident());
  if(not Types.isErrorTy(t)){
    if(not Types.isStructTy(t)){
    Errors.structAccessWithNonStruct(ctx);
    }
    else{
      std::string id = ctx->ID()->getText();
      if(not Types.existStructField(t,id)){
        Errors.structAccessWithNonExistentField(ctx);
      }
      else tf = Types.getStructFieldTy(t, id);
    }
  }
  putTypeDecor(ctx, tf);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitFunctionCall(AslParser::FunctionCallContext *ctx){
  DEBUG_ENTER();
  TypesMgr::TypeId tRet = Types.createErrorTy();
  for(auto expr : ctx->expr()){
        visit(expr);
  }
  if(not Symbols.isFunctionClass(ctx->ID()->getText())){
    if(not Symbols.findInCurrentScope(ctx->ID()->getText())){
      Errors.undeclaredIdent(ctx->ID());
    }
    else{
      Errors.isNotCallable(ctx);
    }
  }
  else{
    TypesMgr::TypeId t1 = Symbols.getGlobalFunctionType(ctx->ID()->getText());
    TypesMgr::TypeId tAux = Types.getFuncReturnType(t1);
    if(Types.isVoidTy(tAux)){
      Errors.isNotFunction(ctx);
    }
    else{
      tRet = tAux;
    }
    std::vector<TypesMgr::TypeId> lParamsTy = Types.getFuncParamsTypes(t1);
    
    if(lParamsTy.size() != ctx->expr().size()){
      Errors.numberOfParameters(ctx);
    }
    else{
      for(int i = 0; i < lParamsTy.size(); i++){
        if(!Types.isErrorTy(getTypeDecor(ctx->expr(i))) && !Types.copyableTypes(lParamsTy[i], getTypeDecor(ctx->expr(i)))){
          Errors.incompatibleParameter(ctx->expr(i), i+1, ctx);
        }
      }
    }
  }
  putTypeDecor(ctx, tRet);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitMethodCall(AslParser::MethodCallContext *ctx){
  DEBUG_ENTER();
  for(auto expr : ctx->expr()){
        visit(expr);
  }
  TypesMgr::TypeId tRet = Types.createErrorTy();
  if(not Symbols.isFunctionClass(ctx->ID()->getText())){
    if(not Symbols.findInCurrentScope(ctx->ID()->getText())){
      Errors.undeclaredIdent(ctx->ID());
    }
    else{
      Errors.isNotCallable(ctx);
    }
  }
  else{
    TypesMgr::TypeId t1 = Symbols.getGlobalFunctionType(ctx->ID()->getText());
    tRet = Types.getFuncReturnType(t1);
    std::vector<TypesMgr::TypeId> lParamsTy = Types.getFuncParamsTypes(t1);
    if(lParamsTy.size() != ctx->expr().size()){
      Errors.numberOfParameters(ctx);
    }
    else{
      for(int i = 0; i < lParamsTy.size(); i++){
        if(!Types.isErrorTy(getTypeDecor(ctx->expr(i))) && !Types.copyableTypes(lParamsTy[i], getTypeDecor(ctx->expr(i)))){
          Errors.incompatibleParameter(ctx->expr(i), i+1, ctx);
        }
      }
    }
  }
  putTypeDecor(ctx, tRet);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitReturn(AslParser::ReturnContext *ctx){
  DEBUG_ENTER();
  TypesMgr::TypeId tRet = Types.createVoidTy();
  if(ctx->expr()){
    visit(ctx->expr());
    tRet = getTypeDecor(ctx->expr());
  }
 
  if(not Types.copyableTypes(getCurrentFunctionTy(), tRet)){
    Errors.incompatibleReturn(ctx->RETURN());
  }
  putTypeDecor(ctx, tRet);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

// antlrcpp::Any TypeCheckVisitor::visitDeclarations(AslParser::DeclarationsContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any TypeCheckVisitor::visitVariable_decl(AslParser::Variable_declContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

// antlrcpp::Any TypeCheckVisitor::visitType(AslParser::TypeContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

antlrcpp::Any TypeCheckVisitor::visitStatements(AslParser::StatementsContext *ctx) {
  DEBUG_ENTER();
  visitChildren(ctx);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitAssignStmt(AslParser::AssignStmtContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->left_expr());
  visit(ctx->expr());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->left_expr());
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr());
  if ((not Types.isErrorTy(t1)) and (not Types.isErrorTy(t2)) and
      ((not Types.copyableTypes(t1, t2))))
    Errors.incompatibleAssignment(ctx->ASSIGN());
  if ((not Types.isErrorTy(t1)) and (not getIsLValueDecor(ctx->left_expr())))
    Errors.nonReferenceableLeftExpr(ctx->left_expr());
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitNewAssign(AslParser::NewAssignContext *ctx){
  DEBUG_ENTER();
  visit(ctx->left_expr());
  visit(ctx->ident(0));
  visit(ctx->ident(1));
  TypesMgr::TypeId left = getTypeDecor(ctx->left_expr());
  TypesMgr::TypeId array_og = getTypeDecor(ctx->ident(1));
  TypesMgr::TypeId varControl = getTypeDecor(ctx->ident(0));


  TypesMgr::TypeId left_ty = Types.getArrayElemType(left);
  TypesMgr::TypeId array_og_ty = Types.getArrayElemType(array_og);
  
  if((not Types.isErrorTy(varControl)) and (not Types.isErrorTy(array_og_ty)) and(not Types.copyableTypes(varControl, array_og_ty))){
    Errors.mapWithIncompatibleControlVar(ctx);
  }
  if((not Types.isErrorTy(left_ty)) and (not Types.isErrorTy(array_og_ty)) and (not Types.isArrayTy(left) or not Types.isArrayTy(array_og))){
    Errors.mapWithNonArraysOrDifferentSizes(ctx);
  }
  if(Types.isArrayTy(left) and Types.isArrayTy(array_og)){
    unsigned int size1 = Types.getArraySize(left);
    unsigned int size2 = Types.getArraySize(array_og);
    if(size1 != size2){
      Errors.mapWithNonArraysOrDifferentSizes(ctx);
    }
  }
  
  visit(ctx->cond);
  visit(ctx->expr1);
  visit(ctx->expr2);
  TypesMgr::TypeId tcond = getTypeDecor(ctx->cond);
  if((not Types.isErrorTy(tcond)) and (not Types.isBooleanTy(tcond))){
    Errors.mapWithNonBooleanCondition(ctx);
  }
  TypesMgr::TypeId texpr1 = getTypeDecor(ctx->expr1);
  TypesMgr::TypeId texpr2 = getTypeDecor(ctx->expr2);
  if((not Types.isErrorTy(texpr1)) and (not Types.copyableTypes(left_ty, texpr1))){
    Errors.mapWithIncompatibleValues(ctx);
  }
  if((not Types.isErrorTy(texpr2)) and (not Types.copyableTypes(left_ty, texpr2))){
    Errors.mapWithIncompatibleValues(ctx);
  }
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitArrayIndex(AslParser::ArrayIndexContext *ctx){
  DEBUG_ENTER();
  visit(ctx->ident());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->ident());
  
  bool b = getIsLValueDecor(ctx->ident());
  
  
  bool array_check = Types.isArrayTy(t1);
  if(not Types.isErrorTy(t1) and not Types.isArrayTy(t1)){
    Errors.nonArrayInArrayAccess(ctx);
    b = false; // no sabemos que es
    array_check = false;
    t1 = Types.createErrorTy();
  }
  visit(ctx->expr());
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr());
  if(not Types.isErrorTy(t2) and not Types.isIntegerTy(t2)){
    Errors.nonIntegerIndexInArrayAccess(ctx->expr());
  }
  if (array_check) t1 = Types.getArrayElemType(t1);//si la array existe, entonces damos el tipo basico que le corresponde
  
  putTypeDecor(ctx, t1);
  putIsLValueDecor(ctx, b);
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any TypeCheckVisitor::visitIfStmt(AslParser::IfStmtContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->expr());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr());
  if ((not Types.isErrorTy(t1)) and (not Types.isBooleanTy(t1)))
    Errors.booleanRequired(ctx);
  visit(ctx->statements(0));
  if(ctx->statements().size() > 1) visit(ctx->statements(1));
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitWhileStmt(AslParser::WhileStmtContext *ctx){
  DEBUG_ENTER();
  visit(ctx->expr());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr());
  if ((not Types.isErrorTy(t1)) and (not Types.isBooleanTy(t1)))
    Errors.booleanRequired(ctx);
  visit(ctx->statements());
  DEBUG_EXIT();
  return 0;
}


antlrcpp::Any TypeCheckVisitor::visitProcCall(AslParser::ProcCallContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->ident());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->ident());
  if (Types.isErrorTy(t1)) {
    ;
  } else if (not Types.isFunctionTy(t1)) {
    Errors.isNotCallable(ctx->ident());
  }
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitReadStmt(AslParser::ReadStmtContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->left_expr());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->left_expr());
  if ((not Types.isErrorTy(t1)) and (not Types.isPrimitiveTy(t1)) and
      (not Types.isFunctionTy(t1)))
    Errors.readWriteRequireBasic(ctx);
  if ((not Types.isErrorTy(t1)) and (not getIsLValueDecor(ctx->left_expr())))
    Errors.nonReferenceableExpression(ctx);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitWriteExpr(AslParser::WriteExprContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->expr());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr());
  if ((not Types.isErrorTy(t1)) and (not Types.isPrimitiveTy(t1)))
    Errors.readWriteRequireBasic(ctx);
  DEBUG_EXIT();
  return 0;
}

// antlrcpp::Any TypeCheckVisitor::visitWriteString(AslParser::WriteStringContext *ctx) {
//   DEBUG_ENTER();
//   antlrcpp::Any r = visitChildren(ctx);
//   DEBUG_EXIT();
//   return r;
// }

antlrcpp::Any TypeCheckVisitor::visitLeft_expr(AslParser::Left_exprContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->ident());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->ident());
  
  bool b = getIsLValueDecor(ctx->ident());
  
  if(ctx->expr()){
    bool array_check = Types.isArrayTy(t1);
    if(not Types.isErrorTy(t1) and not array_check){
      Errors.nonArrayInArrayAccess(ctx);
      b = false; // no sabemos que es
      array_check = false;
      t1 = Types.createErrorTy();
    }
    visit(ctx->expr());
    TypesMgr::TypeId t2 = getTypeDecor(ctx->expr());
    if(not Types.isErrorTy(t2) and not Types.isIntegerTy(t2)){
      Errors.nonIntegerIndexInArrayAccess(ctx->expr());
    }
    if (array_check) t1 = Types.getArrayElemType(t1);//si la array existe, entonces damos el tipo basico que le corresponde
  }
  if(ctx->ID() and not Types.isErrorTy(t1)){
    
    TypesMgr::TypeId tf = Types.createErrorTy();
    if(not Types.isStructTy(t1)){
      Errors.structAccessWithNonStruct(ctx);
    }
    else{
      std::string id = ctx->ID()->getText();
      if(not Types.existStructField(t1,id)){
        Errors.structAccessWithNonExistentField(ctx);
      }
      else tf = Types.getStructFieldTy(t1, id);
    }
    t1 = tf;
  }
  putTypeDecor(ctx, t1);
  putIsLValueDecor(ctx, b);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitArithmetic(AslParser::ArithmeticContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->expr(0));
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(0));
  visit(ctx->expr(1));
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr(1));
  
  TypesMgr::TypeId t;
  //caso en que los dos nodos son integer -> integer
  if((not Types.isErrorTy(t1)) and (not Types.isErrorTy(t2)) and 
     (Types.isIntegerTy(t1) and Types.isIntegerTy(t2))) t = Types.createIntegerTy();
  
  //caso donde uno de los dos nodos es un float -> float (precondicion que tanto t1 como t2 han de ser numericos)
  else if((not Types.isErrorTy(t1)) and (not Types.isErrorTy(t2)) and 
           Types.isNumericTy(t1) and Types.isNumericTy(t2)) t = Types.createFloatTy();

  //por default de error decimos que es como si fuera un nodo integer  
  else{
    if(Types.isFloatTy(t1) or Types.isFloatTy(t2))t = Types.createFloatTy();
    else t = Types.createIntegerTy();
  } 
  if (((not Types.isErrorTy(t1)) and (not Types.isNumericTy(t1))) or
      ((not Types.isErrorTy(t2)) and (not Types.isNumericTy(t2))))
    Errors.incompatibleOperator(ctx->op);
  else if(ctx->MOD()){
    if (((not Types.isErrorTy(t1)) and (not Types.isIntegerTy(t1))) or
      ((not Types.isErrorTy(t2)) and (not Types.isIntegerTy(t2))))
      Errors.incompatibleOperator(ctx->op);
    t = Types.createIntegerTy();
  }
  putTypeDecor(ctx, t);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitRelational(AslParser::RelationalContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->expr(0));
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(0));
  visit(ctx->expr(1));
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr(1));
  std::string oper = ctx->op->getText();
  if ((not Types.isErrorTy(t1)) and (not Types.isErrorTy(t2)) and
      (not Types.comparableTypes(t1, t2, oper)))
    Errors.incompatibleOperator(ctx->op);
  TypesMgr::TypeId t = Types.createBooleanTy();
  putTypeDecor(ctx, t);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitValue(AslParser::ValueContext *ctx) {
  DEBUG_ENTER();
  //comprobacion de tipos y posteriormente declaracion de tipo

  //por default decimos que el nodo es un error
  TypesMgr::TypeId t = Types.createErrorTy();
  if(ctx -> INTVAL()) t = Types.createIntegerTy();
  else if(ctx -> FLOATVAL()) t = Types.createFloatTy();
  else if(ctx -> BOOLVAL()) t = Types.createBooleanTy();
  else if (ctx -> CHARVAL())t = Types.createCharacterTy();

  putTypeDecor(ctx, t);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitExprIdent(AslParser::ExprIdentContext *ctx) {
  DEBUG_ENTER();
  visit(ctx->ident());
  TypesMgr::TypeId t1 = getTypeDecor(ctx->ident());
  putTypeDecor(ctx, t1);
  bool b = getIsLValueDecor(ctx->ident());
  putIsLValueDecor(ctx, b);
  DEBUG_EXIT();
  return 0;
}

antlrcpp::Any TypeCheckVisitor::visitIdent(AslParser::IdentContext *ctx) {
  DEBUG_ENTER();
  std::string ident = ctx->getText();
  if (Symbols.findInStack(ident) == -1) {
    Errors.undeclaredIdent(ctx->ID());
    TypesMgr::TypeId te = Types.createErrorTy();
    putTypeDecor(ctx, te);
    putIsLValueDecor(ctx, true);
  }
  else {
    TypesMgr::TypeId t1 = Symbols.getType(ident);
    putTypeDecor(ctx, t1);
    if (Symbols.isFunctionClass(ident))
      putIsLValueDecor(ctx, false);
    else
      putIsLValueDecor(ctx, true);
  }
  
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any TypeCheckVisitor::visitParenthesis(AslParser::ParenthesisContext *ctx){
  DEBUG_ENTER();
  visit(ctx->expr());

  //ponemos como tipo, el tipo que tiene la expresion dentro de los parentesis
  TypesMgr::TypeId t = getTypeDecor(ctx->expr());
  putTypeDecor(ctx, t);
  //si es una left expresion pues también lo marcamos como nodo left expresion
  bool is_value = getIsLValueDecor(ctx -> expr());
  putIsLValueDecor(ctx, is_value);
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any TypeCheckVisitor::visitUnary(AslParser::UnaryContext *ctx){
  DEBUG_ENTER();
  visit(ctx->expr());
  TypesMgr::TypeId t = getTypeDecor(ctx->expr());
  if(ctx->NOT()){
    //si es un error nuevo donde se hace not (tipo no booleano) diremos error y marcaremos este nodo como el que debería
    if(not Types.isErrorTy(t) and not Types.isBooleanTy(t)){
      Errors.incompatibleOperator(ctx->op );
      t = Types.createBooleanTy();
    }
  }
  else{
    //si es un error nuevo donde se hace (-/+) (tipo no numerico) diremos error y marcaremos este nodo como el que debería
    if(not Types.isErrorTy(t) and not Types.isNumericTy(t)){
      Errors.incompatibleOperator(ctx->op );
      if (Types.isFloatTy(t)) t = Types.createFloatTy();
      else t = Types.createIntegerTy();
    }
  }

  putTypeDecor(ctx, t);
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}
antlrcpp::Any TypeCheckVisitor::visitAnd(AslParser::AndContext *ctx){
  DEBUG_ENTER();
  visit(ctx->expr(0));
  TypesMgr::TypeId t0 = getTypeDecor(ctx->expr(0));
  visit(ctx->expr(1));
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(1));

  //si no es una expresion booleana entonces diremos que es error y lo marcaremos como toca
  if((not Types.isErrorTy(t0)) and (not Types.isErrorTy(t1)) and 
     ((not Types.isBooleanTy(t0)) or (not Types.isBooleanTy(t1)))){
      Errors.incompatibleOperator(ctx->op);
     }
  putTypeDecor(ctx, Types.createBooleanTy());
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
  }
antlrcpp::Any TypeCheckVisitor::visitOr(AslParser::OrContext *ctx){
  DEBUG_ENTER();
  visit(ctx->expr(0));
  TypesMgr::TypeId t0 = getTypeDecor(ctx->expr(0));
  visit(ctx->expr(1));
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(1));

  //si no es una expresion booleana entonces diremos que es error y lo marcaremos como toca
  if((not Types.isErrorTy(t0)) and (not Types.isErrorTy(t1)) and 
     ((not Types.isBooleanTy(t0)) or (not Types.isBooleanTy(t1)))){
      Errors.incompatibleOperator(ctx->op);
     }
  putTypeDecor(ctx, Types.createBooleanTy());
  putIsLValueDecor(ctx, false);
  DEBUG_EXIT();
  return 0;
}
// Getters for the necessary tree node atributes:
//   Scope, Type ans IsLValue
SymTable::ScopeId TypeCheckVisitor::getScopeDecor(antlr4::ParserRuleContext *ctx) {
  return Decorations.getScope(ctx);
}
TypesMgr::TypeId TypeCheckVisitor::getTypeDecor(antlr4::ParserRuleContext *ctx) {
  return Decorations.getType(ctx);
}
bool TypeCheckVisitor::getIsLValueDecor(antlr4::ParserRuleContext *ctx) {
  return Decorations.getIsLValue(ctx);
}

// Setters for the necessary tree node attributes:
//   Scope, Type ans IsLValue
void TypeCheckVisitor::putScopeDecor(antlr4::ParserRuleContext *ctx, SymTable::ScopeId s) {
  Decorations.putScope(ctx, s);
}
void TypeCheckVisitor::putTypeDecor(antlr4::ParserRuleContext *ctx, TypesMgr::TypeId t) {
  Decorations.putType(ctx, t);
}
void TypeCheckVisitor::putIsLValueDecor(antlr4::ParserRuleContext *ctx, bool b) {
  Decorations.putIsLValue(ctx, b);
}
