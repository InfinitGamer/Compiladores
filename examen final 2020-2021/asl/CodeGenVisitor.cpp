//////////////////////////////////////////////////////////////////////
//
//    CodeGenVisitor - Walk the parser tree to do
//                     the generation of code
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

#include "CodeGenVisitor.h"
#include "antlr4-runtime.h"

#include "../common/TypesMgr.h"
#include "../common/SymTable.h"
#include "../common/TreeDecoration.h"
#include "../common/code.h"

#include <string>
#include <cstddef>    // std::size_t

// uncomment the following line to enable debugging messages with DEBUG*
//#define DEBUG_BUILD
#include "../common/debug.h"

// using namespace std;


// Constructor
CodeGenVisitor::CodeGenVisitor(TypesMgr       & Types,
                               SymTable       & Symbols,
                               TreeDecoration & Decorations) :
  Types{Types},
  Symbols{Symbols},
  Decorations{Decorations} {
}

// Accessor/Mutator to the attribute currFunctionType
TypesMgr::TypeId CodeGenVisitor::getCurrentFunctionTy() const {
  return currFunctionType;
}

void CodeGenVisitor::setCurrentFunctionTy(TypesMgr::TypeId type) {
  currFunctionType = type;
}

// Methods to visit each kind of node:
//
antlrcpp::Any CodeGenVisitor::visitProgram(AslParser::ProgramContext *ctx) {
  DEBUG_ENTER();
  code my_code;
  SymTable::ScopeId sc = getScopeDecor(ctx);
  Symbols.pushThisScope(sc);
  for (auto ctxFunc : ctx->function()) { 
    subroutine subr = visit(ctxFunc);
    my_code.add_subroutine(subr);
  }
  Symbols.popScope();
  DEBUG_EXIT();
  return my_code;
}

antlrcpp::Any CodeGenVisitor::visitMethodCall(AslParser::MethodCallContext *ctx){
  DEBUG_ENTER();
  TypesMgr::TypeId t = Symbols.getGlobalFunctionType(ctx->ID()->getText());
  auto typesParams = Types.getFuncParamsTypes(t);
  instructionList code;
  code = instruction::PUSH();
  for(int i = 0; i < (int)ctx->expr().size(); i++){  
    CodeAttribs     && codAtsE1 = visit(ctx->expr(i));
    std::string           addr1 = codAtsE1.addr;
    // std::string           offs1 = codAtsE1.offs;
    instructionList &     code1 = codAtsE1.code;
    code = code || code1;
    std::string temp = addr1;
    TypesMgr::TypeId tfunc = typesParams[i];
    TypesMgr::TypeId tvar = getTypeDecor(ctx->expr(i));
    if(Types.isFloatTy(tfunc) and Types.isIntegerTy(tvar)){
      temp = '%'+codeCounters.newTEMP();
      code = code||instruction::FLOAT(temp,addr1);
    }
    else if(not Types.isPrimitiveTy(tfunc) and Symbols.isLocalVarClass(addr1)){
      temp = '%'+codeCounters.newTEMP();
      code = code||instruction::ALOAD(temp,addr1);
    }
    code = code || instruction::PUSH(temp);
  }
  std::string functionName = ctx->ID()->getText();
  code = code || instruction::CALL(functionName);
  for (int i = 0; i < (int)ctx->expr().size(); i++){
    code = code || instruction::POP();
  }
  code = code || instruction::POP();
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitFunctionCall(AslParser::FunctionCallContext *ctx){
  DEBUG_ENTER();
  TypesMgr::TypeId t = Symbols.getGlobalFunctionType(ctx->ID()->getText());
  auto typesParams = Types.getFuncParamsTypes(t);
  instructionList code;
  code = instruction::PUSH();
  for(int i = 0; i < (int)ctx->expr().size(); i++){  
    CodeAttribs     && codAtsE1 = visit(ctx->expr(i));
    std::string           addr1 = codAtsE1.addr;
    // std::string           offs1 = codAtsE1.offs;
    instructionList &     code1 = codAtsE1.code;
    code = code || code1;
    std::string temp = addr1;
    TypesMgr::TypeId tfunc = typesParams[i];
    TypesMgr::TypeId tvar = getTypeDecor(ctx->expr(i));
    if(Types.isFloatTy(tfunc) and Types.isIntegerTy(tvar)){
      temp = '%'+codeCounters.newTEMP();
      code = code||instruction::FLOAT(temp,addr1);
    }
    //cuando sea una array y sea una variable creada dentro del scope
    //entonces hay que hacer pasar referencia.
    else if(not Types.isPrimitiveTy(tfunc) and Symbols.isLocalVarClass(addr1)){
      temp = '%'+codeCounters.newTEMP();
      code = code||instruction::ALOAD(temp,addr1);
    }
    code = code || instruction::PUSH(temp);
  }
  std::string functionName = ctx->ID()->getText();
  code = code || instruction::CALL(functionName);
  for (int i = 0; i < (int)ctx->expr().size(); i++){
    code = code || instruction::POP();
  }
  std::string temp = "%"+codeCounters.newTEMP();
  code = code || instruction::POP(temp);
  DEBUG_EXIT();
  return CodeAttribs(temp, "", code);
}

antlrcpp::Any CodeGenVisitor::visitFunction(AslParser::FunctionContext *ctx) {
  DEBUG_ENTER();
  SymTable::ScopeId sc = getScopeDecor(ctx);
  Symbols.pushThisScope(sc);
  subroutine subr(ctx->ID()->getText());
  codeCounters.reset();
  if(ctx->basic_type){
    std::string name = "_result";
    TypesMgr::TypeId tResult = getTypeDecor(ctx->basic_type);
    std::string type = Types.to_string(tResult);
    subr.add_param(name, type, Types.isArrayTy(tResult));
  }
  for (int i = 0; i < (int)ctx->param().size(); i++){
    std::string name = ctx->param(i)->ID()->getText();
    TypesMgr::TypeId tParam = getTypeDecor(ctx->param(i)->type());
    std::string type = Types.to_string_basic(getBasicType(tParam));
    subr.add_param(name, type, Types.isArrayTy(tParam));
  }
  std::vector<var> && lvars = visit(ctx->declarations());
  for (auto & onevar : lvars) {
    subr.add_var(onevar);
  }
  instructionList && code = visit(ctx->statements());
  code = code || instruction(instruction::RETURN());
  subr.set_instructions(code);
  Symbols.popScope();
  DEBUG_EXIT();
  return subr;
}

antlrcpp::Any CodeGenVisitor::visitReturn(AslParser::ReturnContext *ctx){
  DEBUG_ENTER();
  instructionList code;
  if(ctx->expr()){
    CodeAttribs     && codAtsE1 = visit(ctx->expr());
    std::string           addr1 = codAtsE1.addr;
    // std::string           offs1 = codAtsE1.offs;
    instructionList &     code1 = codAtsE1.code;
    std::string temp = addr1;
    TypesMgr::TypeId tret = getTypeDecor(ctx);
    TypesMgr::TypeId tret2 = getTypeDecor(ctx->expr());
    code = code1;
    if(Types.isFloatTy(tret) and Types.isIntegerTy(tret2)){
      temp = "%"+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp,addr1);
    }
    code = code || instruction::LOAD("_result", temp);
  }
  code = code || instruction::RETURN();
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitDeclarations(AslParser::DeclarationsContext *ctx) {
  DEBUG_ENTER();
  std::vector<var> lvars;
  for (auto & varDeclCtx : ctx->variable_decl()) {
    std::vector<var> auxVars = visit(varDeclCtx);
    for(var& onevar : auxVars){
      lvars.push_back(onevar);
    }
  }
  DEBUG_EXIT();
  return lvars;
}

antlrcpp::Any CodeGenVisitor::visitVariable_decl(AslParser::Variable_declContext *ctx) {
  DEBUG_ENTER();
  TypesMgr::TypeId   t1 = getTypeDecor(ctx->type());
  std::size_t      size = getSize(t1);
  std::vector<var> lvars;
  for(auto& varID : ctx->ID()){
    lvars.push_back(var{varID->getText(), Types.to_string_basic(getBasicType(t1)), size});
  }
  DEBUG_EXIT();
  return lvars;
}

antlrcpp::Any CodeGenVisitor::visitStatements(AslParser::StatementsContext *ctx) {
  DEBUG_ENTER();
  instructionList code;
  for (auto stCtx : ctx->statement()) {
    instructionList && codeS = visit(stCtx);
    code = code || codeS;
  }
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitAssignStmt(AslParser::AssignStmtContext *ctx) {
  DEBUG_ENTER();
  instructionList code;
  CodeAttribs     && codAtsE1 = visit(ctx->left_expr());
  std::string           addr1 = codAtsE1.addr;
  std::string           offs1 = codAtsE1.offs;
  instructionList &     code1 = codAtsE1.code;
  TypesMgr::TypeId tid1 = getTypeDecor(ctx->left_expr());
  CodeAttribs     && codAtsE2 = visit(ctx->expr());
  std::string           addr2 = codAtsE2.addr;
  std::string           offs2 = codAtsE2.offs;
  instructionList &     code2 = codAtsE2.code;
  TypesMgr::TypeId tid2 = getTypeDecor(ctx->expr());
  std::string temp = addr2;
  code = code1 || code2;
  if(Types.isArrayTy(tid1) && Types.isArrayTy(tid2)){
    std::string temp1 = addr1;
    std::string temp2 = addr2;
    if(Symbols.isParameterClass(temp1)){
        temp1 = '%'+codeCounters.newTEMP();
        code = code || instruction::LOAD(temp1, addr1);
    }
    if(Symbols.isParameterClass(temp2)){
        temp2 = '%'+codeCounters.newTEMP();
        code = code || instruction::LOAD(temp2, addr1);
    }
    
    std::string temp3 = '%'+codeCounters.newTEMP();
    std::string temp4 = '%'+codeCounters.newTEMP();
    std::string temp5 = '%'+codeCounters.newTEMP();
    std::string temp6 = '%'+codeCounters.newTEMP();
    std::string temp7 = '%'+codeCounters.newTEMP();
    std::string temp8 = '%'+codeCounters.newTEMP();
    std::string temp9 = '%'+codeCounters.newTEMP();
    std::string label = codeCounters.newLabelWHILE();
    std::string labelBegin = "while"+label;
    std::string labelEnd = "endwhile"+label;
    code = code || instruction::ILOAD(temp3, "0");
    code = code || instruction::ILOAD(temp7, "1");
    if(offs1 != ""){
    	code = code || instruction::ADD(temp8, temp3, offs1);
    }
    else{
    	code = code || instruction::LOAD(temp8, temp3);
    }
    if(offs2 != ""){
    	code = code || instruction::ADD(temp9, temp3, offs2);
    }
    else{
    	code = code || instruction::LOAD(temp9, temp3);
    }
    int sizeArray = getSize(tid1);
    code = code || instruction::ILOAD(temp4, std::to_string(sizeArray));
    code = code || instruction::LABEL(labelBegin);
    code = code || instruction::LT(temp5, temp3, temp4);
    code = code || instruction::FJUMP(temp5, labelEnd);
    code = code || instruction::LOADX(temp6,temp2,temp9);
    code = code || instruction::XLOAD(temp1,temp8,temp6);
    code = code || instruction::ADD(temp3,temp3,temp7);
    code = code || instruction::ADD(temp8,temp8,temp7);
    code = code || instruction::ADD(temp9,temp9,temp7);
    code = code || instruction::UJUMP(labelBegin);
    code = code || instruction::LABEL(labelEnd);
  }
  else{
    if(Types.isFloatTy(tid1) and Types.isIntegerTy(tid2)){
      temp = '%'+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp, addr2);
    }
    if(offs1 != ""){
      std::string temp2 = addr1;
      if(Symbols.isParameterClass(temp2)){
        temp2 = '%'+codeCounters.newTEMP();
        code = code || instruction::LOAD(temp2,addr1);
      }
      code = code || instruction::XLOAD(temp2, offs1, temp);
    }
    else{
      code = code || instruction::LOAD(addr1, temp);
    }
  }
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitArrayIndex(AslParser::ArrayIndexContext *ctx){
  DEBUG_ENTER();
    CodeAttribs codAts = visit(ctx->left_expr());
    std::string         addr1 = codAts.addr;
    instructionList  &  code1 = codAts.code;
    std::string     &    offset1 = codAts.offs;
    CodeAttribs codAts1 = visit(ctx->expr());
    std::string         addr2 = codAts1.addr;
    instructionList     code2 = codAts1.code;
    
    int size = getSize(getTypeDecor(ctx));
    std::string temp1 =  '%' + codeCounters.newTEMP(); 
    code1 = code1 || code2 || instruction::ILOAD(temp1, std::to_string(size));

    std::string zero = '%' + codeCounters.newTEMP(); 
    std::string number = '%' + codeCounters.newTEMP();
    TypesMgr::TypeId t = getTypeDecor(ctx->left_expr());
    unsigned int n = Types.getArraySize(t);
    code1 = code1 || instruction::ILOAD(zero,"0");
    code1 = code1 || instruction::ILOAD(number,std::to_string(n));

    std::string cond = '%' + codeCounters.newTEMP(); 
    std::string cond2 = '%' + codeCounters.newTEMP();
    std::string cond3 = '%' + codeCounters.newTEMP();
    code1 = code1  ||instruction::LT(cond, addr2, zero);
    code1 = code1  ||instruction::LE(cond2, number, addr2);
    code1 = code1  ||instruction::OR(cond3, cond, cond2);

    std::string label = codeCounters.newLabelIF();
    std::string labelEndIf = "endif"+label;
    code1 = code1 || instruction::FJUMP(cond3, labelEndIf) || instruction::HALT(code::INDEX_OUT_OF_RANGE)
                  || instruction::LABEL(labelEndIf);

    std::string temp2 =  '%' + codeCounters.newTEMP();
    code1 = code1 || instruction::MUL(temp2, addr2, temp1);
    if(offset1 == ""){
      offset1 = temp2;
    }
    else{
      std::string temp3 =  '%' + codeCounters.newTEMP();
      code1 = code1 || instruction::ADD(temp3, temp2, offset1);
      offset1 = temp3;
    }
    std::string temp5 = addr1;
    if(Symbols.isParameterClass(temp5)){
      temp5 = '%'+codeCounters.newTEMP();
      code1 = code1 || instruction::LOAD(temp5,addr1);
    }
    if(Types.isPrimitiveTy(getTypeDecor(ctx))){
    	std::string temp4 =  '%' + codeCounters.newTEMP();
	code1 = code1 || instruction::LOADX(temp4, temp5, offset1);
	codAts.addr = temp4;
	codAts.offs = "";
    }
    else{
    	codAts.addr = temp5;
    	codAts.offs = offset1;
    }
    
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitIfStmt(AslParser::IfStmtContext *ctx) {
  DEBUG_ENTER();
  instructionList code;
  CodeAttribs     && codAtsE = visit(ctx->expr());
  std::string          addr1 = codAtsE.addr;
  instructionList &    code1 = codAtsE.code;
  instructionList &&   code2 = visit(ctx->statements(0));
  std::string label = codeCounters.newLabelIF();
  std::string labelElse = "else"+label;
  std::string labelEndIf = "endif"+label;
  if(ctx->ELSE()){
    instructionList &&   code3 = visit(ctx->statements(1));
    code = code1 || instruction::FJUMP(addr1, labelElse) ||
           code2 || instruction::UJUMP(labelEndIf) || instruction::LABEL(labelElse) ||
           code3 || instruction::LABEL(labelEndIf);
  }
  else{
    code = code1 || instruction::FJUMP(addr1, labelEndIf) ||
          code2 || instruction::LABEL(labelEndIf);
  }
  DEBUG_EXIT();
  return code;
}


antlrcpp::Any CodeGenVisitor::visitReadStmt(AslParser::ReadStmtContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs     && codAtsE = visit(ctx->left_expr());
  std::string          addr1 = codAtsE.addr;
  std::string          offs1 = codAtsE.offs;
  instructionList &    code1 = codAtsE.code;
  instructionList &     code = code1;
  std::string temp = addr1;
  if(offs1 != "") temp = '%'+codeCounters.newTEMP();

  TypesMgr::TypeId tid1 = getTypeDecor(ctx->left_expr());
  if(Types.isFloatTy(tid1)) code = code || instruction::READF(temp);
  else if(Types.isCharacterTy(tid1)) code = code || instruction::READC(temp);
  else code = code || instruction::READI(temp);
  if(offs1 != ""){
    std::string temp2 = addr1;
    if(Symbols.isParameterClass(temp2)){
      temp2 = '%'+codeCounters.newTEMP();
      code = code || instruction::LOAD(temp2,addr1);
    }
    code = code || instruction::XLOAD(temp2,offs1,temp);
  } 
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitWriteExpr(AslParser::WriteExprContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr());
  std::string         addr1 = codAt1.addr;
  // std::string         offs1 = codAt1.offs;
  instructionList &   code1 = codAt1.code;
  instructionList &    code = code1;
  TypesMgr::TypeId tid1 = getTypeDecor(ctx->expr());
  if(Types.isIntegerTy(tid1)){
    code = code1 || instruction::WRITEI(addr1);
  }
  else if(Types.isFloatTy(tid1)){
    code = code1 || instruction::WRITEF(addr1);
  }
  else if(Types.isCharacterTy(tid1)){
    code = code1 || instruction::WRITEC(addr1);
  }
  else if(Types.isBooleanTy(tid1)){
    code = code1 || instruction::WRITEI(addr1);
  }
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitWriteString(AslParser::WriteStringContext *ctx) {
  DEBUG_ENTER();
  instructionList code;
  std::string s = ctx->STRING()->getText();
  code = code || instruction::WRITES(s);
  DEBUG_EXIT();
  return code;
}

antlrcpp::Any CodeGenVisitor::visitLeft_expr(AslParser::Left_exprContext *ctx) {
  DEBUG_ENTER();
   CodeAttribs codAts("","",instructionList());
  if(ctx->PAREOP()){
    codAts = visit(ctx->left_expr());
  }
  else if(ctx->expr()){
    codAts = visit(ctx->left_expr());
    std::string         addr1 = codAts.addr;
    instructionList  &  code1 = codAts.code;
    std::string     &    offset1 = codAts.offs;
    CodeAttribs codAts1 = visit(ctx->expr());
    std::string         addr2 = codAts1.addr;
    instructionList     code2 = codAts1.code;
    
    int size = getSize(getTypeDecor(ctx));
    std::string temp1 =  '%' + codeCounters.newTEMP(); 
    code1 = code1 || code2 || instruction::ILOAD(temp1, std::to_string(size));

    std::string zero = '%' + codeCounters.newTEMP(); 
    std::string number = '%' + codeCounters.newTEMP();
    TypesMgr::TypeId t = getTypeDecor(ctx->left_expr());
    unsigned int n = Types.getArraySize(t);
    code1 = code1 || instruction::ILOAD(zero,"0");
    code1 = code1 || instruction::ILOAD(number,std::to_string(n));

    std::string cond = '%' + codeCounters.newTEMP(); 
    std::string cond2 = '%' + codeCounters.newTEMP();
    std::string cond3 = '%' + codeCounters.newTEMP();
    code1 = code1  ||instruction::LT(cond, addr2, zero);
    code1 = code1  ||instruction::LE(cond2, number, addr2);
    code1 = code1  ||instruction::OR(cond3, cond, cond2);

    std::string label = codeCounters.newLabelIF();
    std::string labelEndIf = "endif"+label;
    code1 = code1 || instruction::FJUMP(cond3, labelEndIf) || instruction::HALT(code::INDEX_OUT_OF_RANGE)
                  || instruction::LABEL(labelEndIf);

    std::string temp2 =  '%' + codeCounters.newTEMP();
    code1 = code1 || instruction::MUL(temp2, addr2, temp1);
    if(offset1 == ""){
      offset1 = temp2;
    }
    else{
      std::string temp3 =  '%' + codeCounters.newTEMP();
      code1 = code1 || instruction::ADD(temp3, temp2, offset1);
      offset1 = temp3;
    }


  }
  else{
    codAts = visit(ctx->ident());
  }
 
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitArithmetic(AslParser::ArithmeticContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr(0));
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  CodeAttribs     && codAt2 = visit(ctx->expr(1));
  std::string         addr2 = codAt2.addr;
  instructionList &   code2 = codAt2.code;
  instructionList &&   code = code1 || code2;
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(0));
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr(1));
  TypesMgr::TypeId  t = getTypeDecor(ctx);
  std::string temp = "%"+codeCounters.newTEMP();
  std::string temp1 = addr1;
  std::string temp2 = addr2;

  if(Types.isFloatTy(t)){
    if(Types.isIntegerTy(t1)){
      temp1 = "%"+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp1, addr1);
    }
    if(Types.isIntegerTy(t2)){
      temp2 = "%"+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp2, addr2);
    }
    if (ctx->MUL())
      code = code || instruction::FMUL(temp, temp1, temp2);
    else if (ctx->DIV())
      code = code || instruction::FDIV(temp, temp1, temp2);
    else if(ctx->PLUS())
      code = code || instruction::FADD(temp, temp1, temp2);
    else if (ctx->MINUS())
      code = code || instruction::FSUB(temp, temp1, temp2);
  }
  else{
    if (ctx->MUL())
      code = code || instruction::MUL(temp, addr1, addr2);
    else if (ctx->DIV())
      code = code || instruction::DIV(temp, addr1, addr2);
    else if(ctx->PLUS())
      code = code || instruction::ADD(temp, addr1, addr2);
    else if (ctx->MINUS())
      code = code || instruction::SUB(temp, addr1, addr2);
    else if (ctx->MOD()){
      code = code || instruction::DIV(temp, addr1, addr2); 
      code = code || instruction::MUL(temp, addr2, temp); 
      code = code || instruction::SUB(temp, addr1, temp);
    }
  }
  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitRelational(AslParser::RelationalContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr(0));
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  CodeAttribs     && codAt2 = visit(ctx->expr(1));
  std::string         addr2 = codAt2.addr;
  instructionList &   code2 = codAt2.code;
  instructionList &&   code = code1 || code2;
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr(0));
  TypesMgr::TypeId t2 = getTypeDecor(ctx->expr(1));
  
  std::string temp = "%"+codeCounters.newTEMP();
  std::string temp1 = addr1;
  std::string temp2 = addr2;

  if(Types.isFloatTy(t1) or Types.isFloatTy(t2)){
    if(Types.isIntegerTy(t1)){
      temp1 = "%"+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp1, addr1);
    }
    if(Types.isIntegerTy(t2)){
      temp2 = "%"+codeCounters.newTEMP();
      code = code || instruction::FLOAT(temp2, addr2);
    }
    if (ctx->EQUAL())
      code = code || instruction::FEQ(temp, temp1, temp2);
    else if (ctx->NOTEQUAL()){
      code = code || instruction::FEQ(temp, temp1, temp2);
      code = code || instruction::NOT(temp, temp);
    }
    else if(ctx->GT())
      code = code || instruction::FLT(temp, temp2, temp1);
    else if (ctx->GE())
      code = code || instruction::FLE(temp, temp2, temp1);
    else if(ctx->LT())
      code = code || instruction::FLT(temp, temp1, temp2);
    else if (ctx->LE())
      code = code || instruction::FLE(temp, temp1, temp2);
  }
  else{
    if (ctx->EQUAL())
      code = code || instruction::EQ(temp, addr1, addr2);
    else if (ctx->NOTEQUAL()){
      code = code || instruction::EQ(temp, addr1, addr2);
      code = code || instruction::NOT(temp, temp);
    }
    else if(ctx->GT())
      code = code || instruction::LT(temp, addr2, addr1);
    else if (ctx->GE())
      code = code || instruction::LE(temp, addr2, addr1);
    else if(ctx->LT())
      code = code || instruction::LT(temp, addr1, addr2);
    else if (ctx->LE())
      code = code || instruction::LE(temp, addr1, addr2);
  }
  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitAnd(AslParser::AndContext *ctx){
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr(0));
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  CodeAttribs     && codAt2 = visit(ctx->expr(1));
  std::string         addr2 = codAt2.addr;
  instructionList &   code2 = codAt2.code;
  instructionList &&   code = code1 || code2;
  std::string temp = "%"+codeCounters.newTEMP();
  code = code || instruction::AND(temp, addr1, addr2);
  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitOr(AslParser::OrContext *ctx){
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr(0));
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  CodeAttribs     && codAt2 = visit(ctx->expr(1));
  std::string         addr2 = codAt2.addr;
  instructionList &   code2 = codAt2.code;
  instructionList &&   code = code1 || code2;
  std::string temp = "%"+codeCounters.newTEMP();
  code = code || instruction::OR(temp, addr1, addr2);
  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitWhileStmt(AslParser::WhileStmtContext *ctx){
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr());
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  instructionList && code2 = visit(ctx->statements());
  std::string label = codeCounters.newLabelWHILE();
  std::string labelBegin = "while"+label;
  std::string labelEnd = "endwhile"+label;

  instructionList code = instruction::LABEL(labelBegin) || code1 || instruction::FJUMP(addr1, labelEnd) ||
                  code2 || instruction::UJUMP(labelBegin) || instruction::LABEL(labelEnd);
  DEBUG_EXIT();
  return code;
}


antlrcpp::Any CodeGenVisitor::visitMap(AslParser::MapContext *ctx){
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->in);
  std::string         addr1 = codAt1.addr;
  TypesMgr::TypeId tin = getTypeDecor(ctx->in);
  TypesMgr::TypeId telem1 = Types.getArrayElemType(tin);

  CodeAttribs     && codAt2 = visit(ctx->out);
  std::string         addr2 = codAt2.addr;
  TypesMgr::TypeId tout = getTypeDecor(ctx->out);
  TypesMgr::TypeId telem2 = Types.getArrayElemType(tout);

  CodeAttribs     && codAt3 = visit(ctx->func);
  std::string         addr3 = codAt3.addr;
  TypesMgr::TypeId tfunc = getTypeDecor(ctx->func);
  TypesMgr::TypeId tret = Types.getFuncReturnType(tfunc);
  TypesMgr::TypeId tparam = Types.getParameterType(tfunc,0);


  instructionList c;

  std::string label = codeCounters.newLabelWHILE();
  std::string labelBegin = "while"+label;
  std::string labelEnd = "endwhile"+label;

  std::string counter ="%"+codeCounters.newTEMP();
  c = c || instruction::ILOAD(counter, "0");
  std::string one ="%"+codeCounters.newTEMP();
  c = c || instruction::ILOAD(one, "1");
  std::string limit ="%"+codeCounters.newTEMP();
  unsigned int lim = Types.getArraySize(tin);
  c = c || instruction::ILOAD(limit, std::to_string(lim));
  std::string array1 = addr1;
  std::string array2 = addr2;
  if(Symbols.isParameterClass(array1)){
    array1 = "%"+codeCounters.newTEMP();
    c = c|| instruction::LOAD(array1, addr1);
  }
  if(Symbols.isParameterClass(array2)){
    array2 = "%"+codeCounters.newTEMP();
    c = c|| instruction::LOAD(array2, addr2);
  }

  c = c || instruction::LABEL(labelBegin);
  std::string cond ="%"+codeCounters.newTEMP();
  c = c || instruction::LT(cond,counter, limit );
  c = c || instruction::FJUMP(cond,labelEnd);
  std::string temp ="%"+codeCounters.newTEMP();
  c = c || instruction::LOADX(temp, array1, counter);
  if(Types.isIntegerTy(telem1) and Types.isFloatTy(tparam)){
    c = c || instruction::FLOAT(temp, temp);
  }
  c = c || instruction::PUSH();
  c = c || instruction::PUSH(temp);
  c = c || instruction::CALL(addr3);
  c = c || instruction::POP();
  c = c || instruction::POP(temp);
  if(Types.isIntegerTy(tret) and Types.isFloatTy(telem2)){
    c = c || instruction::FLOAT(temp, temp);
  }
  c = c ||instruction::XLOAD(array2,counter,temp);

  c = c ||instruction::ADD(counter, counter, one);
  c = c || instruction::UJUMP(labelBegin);
  c = c || instruction::LABEL(labelEnd);


  DEBUG_EXIT();
  return c;
}
antlrcpp::Any CodeGenVisitor::visitPotencia(AslParser::PotenciaContext *ctx){
DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr(0));
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;

  CodeAttribs     && codAt2 = visit(ctx->expr(1));
  std::string         addr2 = codAt2.addr;
  instructionList &   code2 = codAt2.code;

  code1 = code1 || code2;
  TypesMgr::TypeId t1 = getTypeDecor(ctx-> expr(0));
  std::string result =  "%"+codeCounters.newTEMP();
  code1 = code1 || instruction::FLOAD(result, "1.0");
  std::string var = "%"+codeCounters.newTEMP();
  if(Types.isIntegerTy(t1)){
    code1 = code1  || instruction::FLOAT(var, addr1);
  }
  else{
    code1 = code1  || instruction::LOAD(var, addr1);
  }
  std::string zero = "%"+codeCounters.newTEMP();
  code1 = code1 || instruction::ILOAD(zero, "0");
  std::string one = "%"+codeCounters.newTEMP();
  code1 = code1 || instruction::ILOAD(one, "1");
  std::string counter = "%"+codeCounters.newTEMP();
  code1 = code1 || instruction::LOAD(counter, addr2);


  
  std::string label = codeCounters.newLabelWHILE();
  std::string labelBegin = "while"+label;
  std::string labelEnd = "endwhile"+label;

  code1 = code1 || instruction::LABEL(labelBegin);
  std::string temp =  "%"+codeCounters.newTEMP();
  code1 = code1 || instruction::LT(temp, zero, counter);
  code1 = code1 || instruction::FJUMP(temp, labelEnd);
  code1 = code1 || instruction::FMUL(result,result, var);
  code1 = code1 || instruction::SUB(counter, counter, one);
  code1 = code1 || instruction::UJUMP(labelBegin);
  code1 = code1 || instruction::LABEL(labelEnd);
  codAt1.addr = result;
DEBUG_EXIT();
  return codAt1;
}
antlrcpp::Any CodeGenVisitor::visitUnary(AslParser::UnaryContext *ctx){
  DEBUG_ENTER();
  CodeAttribs     && codAt1 = visit(ctx->expr());
  std::string         addr1 = codAt1.addr;
  instructionList &   code1 = codAt1.code;
  instructionList &   code = code1;
  TypesMgr::TypeId t1 = getTypeDecor(ctx->expr());
  std::string temp = "%"+codeCounters.newTEMP();
  if(ctx->NOT()){
    code = code || instruction::NOT(temp, addr1);
  }
  else if(ctx->MINUS()){
    if(Types.isFloatTy(t1)){
      code = code || instruction::FNEG(temp, addr1);
    }
    else if(Types.isIntegerTy(t1)){
      code = code || instruction::NEG(temp, addr1);
    }
  }
  else if(ctx->PLUS()){
    temp = addr1;
    code = code1;
  }

  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitValue(AslParser::ValueContext *ctx) {
  DEBUG_ENTER();
  instructionList code;
  std::string temp = "%"+codeCounters.newTEMP();
  if(ctx->INTVAL()){
    code = instruction::ILOAD(temp, ctx->getText());
  }
  else if(ctx->FLOATVAL()){
    code = instruction::FLOAD(temp, ctx->getText());
  }
  else if(ctx->CHARVAL()){
    std::string auxStr = ctx->CHARVAL()->getText();
    auxStr = auxStr.substr(1, auxStr.length()-2);
    code = instruction::CHLOAD(temp, auxStr);
  }
  else if(ctx->BOOLVAL()){
    if(ctx->getText() == "true"){
      code = instruction::ILOAD(temp, "1");
    }
    else{
      code = instruction::ILOAD(temp, "0");
    }
  }
  CodeAttribs codAts(temp, "", code);
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitExprIdent(AslParser::ExprIdentContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs && codAts = visit(ctx->ident());
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitIdent(AslParser::IdentContext *ctx) {
  DEBUG_ENTER();
  CodeAttribs codAts(ctx->ID()->getText(), "", instructionList());
  DEBUG_EXIT();
  return codAts;
}

antlrcpp::Any CodeGenVisitor::visitParenthesis(AslParser::ParenthesisContext *ctx){
  DEBUG_ENTER();
  CodeAttribs && codAts = visit(ctx->expr());
  DEBUG_EXIT();
  return codAts;
}
int CodeGenVisitor::getSize(TypesMgr::TypeId t){
  if(Types.isPrimitiveTy(t)) return 1;
  else{
    if(Types.isArrayTy(t)){
      int i = Types.getArraySize(t);
      TypesMgr::TypeId t_child = Types.getArrayElemType(t);
      return i * getSize(t_child);
    }
  }
}
TypesMgr::TypeId CodeGenVisitor::getBasicType(TypesMgr::TypeId t){
 if(Types.isPrimitiveTy(t)) return t;
 else {
  TypesMgr::TypeId t_child = Types.getArrayElemType(t);
  return getBasicType(t_child);
 }
}
// Getters for the necessary tree node atributes:
//   Scope and Type
SymTable::ScopeId CodeGenVisitor::getScopeDecor(antlr4::ParserRuleContext *ctx) const {
  return Decorations.getScope(ctx);
}
TypesMgr::TypeId CodeGenVisitor::getTypeDecor(antlr4::ParserRuleContext *ctx) const {
  return Decorations.getType(ctx);
}


// Constructors of the class CodeAttribs:
//
CodeGenVisitor::CodeAttribs::CodeAttribs(const std::string & addr,
                                         const std::string & offs,
                                         instructionList & code) :
  addr{addr}, offs{offs}, code{code} {
}

CodeGenVisitor::CodeAttribs::CodeAttribs(const std::string & addr,
                                         const std::string & offs,
                                         instructionList && code) :
  addr{addr}, offs{offs}, code{code} {
}
