
// Generated from Asl.g4 by ANTLR 4.7.2


#include "AslVisitor.h"

#include "AslParser.h"


using namespace antlrcpp;
using namespace antlr4;

AslParser::AslParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

AslParser::~AslParser() {
  delete _interpreter;
}

std::string AslParser::getGrammarFileName() const {
  return "Asl.g4";
}

const std::vector<std::string>& AslParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& AslParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- ProgramContext ------------------------------------------------------------------

AslParser::ProgramContext::ProgramContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::ProgramContext::EOF() {
  return getToken(AslParser::EOF, 0);
}

std::vector<AslParser::FunctionContext *> AslParser::ProgramContext::function() {
  return getRuleContexts<AslParser::FunctionContext>();
}

AslParser::FunctionContext* AslParser::ProgramContext::function(size_t i) {
  return getRuleContext<AslParser::FunctionContext>(i);
}


size_t AslParser::ProgramContext::getRuleIndex() const {
  return AslParser::RuleProgram;
}

antlrcpp::Any AslParser::ProgramContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitProgram(this);
  else
    return visitor->visitChildren(this);
}

AslParser::ProgramContext* AslParser::program() {
  ProgramContext *_localctx = _tracker.createInstance<ProgramContext>(_ctx, getState());
  enterRule(_localctx, 0, AslParser::RuleProgram);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(25); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(24);
      function();
      setState(27); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == AslParser::FUNC);
    setState(29);
    match(AslParser::EOF);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionContext ------------------------------------------------------------------

AslParser::FunctionContext::FunctionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::FunctionContext::FUNC() {
  return getToken(AslParser::FUNC, 0);
}

tree::TerminalNode* AslParser::FunctionContext::ID() {
  return getToken(AslParser::ID, 0);
}

tree::TerminalNode* AslParser::FunctionContext::PAREOP() {
  return getToken(AslParser::PAREOP, 0);
}

tree::TerminalNode* AslParser::FunctionContext::PARECL() {
  return getToken(AslParser::PARECL, 0);
}

AslParser::DeclarationsContext* AslParser::FunctionContext::declarations() {
  return getRuleContext<AslParser::DeclarationsContext>(0);
}

AslParser::StatementsContext* AslParser::FunctionContext::statements() {
  return getRuleContext<AslParser::StatementsContext>(0);
}

tree::TerminalNode* AslParser::FunctionContext::ENDFUNC() {
  return getToken(AslParser::ENDFUNC, 0);
}

std::vector<AslParser::ParamContext *> AslParser::FunctionContext::param() {
  return getRuleContexts<AslParser::ParamContext>();
}

AslParser::ParamContext* AslParser::FunctionContext::param(size_t i) {
  return getRuleContext<AslParser::ParamContext>(i);
}

AslParser::BasicContext* AslParser::FunctionContext::basic() {
  return getRuleContext<AslParser::BasicContext>(0);
}


size_t AslParser::FunctionContext::getRuleIndex() const {
  return AslParser::RuleFunction;
}

antlrcpp::Any AslParser::FunctionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitFunction(this);
  else
    return visitor->visitChildren(this);
}

AslParser::FunctionContext* AslParser::function() {
  FunctionContext *_localctx = _tracker.createInstance<FunctionContext>(_ctx, getState());
  enterRule(_localctx, 2, AslParser::RuleFunction);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(31);
    match(AslParser::FUNC);
    setState(32);
    match(AslParser::ID);
    setState(33);
    match(AslParser::PAREOP);
    setState(42);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == AslParser::ID) {
      setState(34);
      param();
      setState(39);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == AslParser::T__0) {
        setState(35);
        match(AslParser::T__0);
        setState(36);
        param();
        setState(41);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
    }
    setState(44);
    match(AslParser::PARECL);
    setState(47);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == AslParser::T__1) {
      setState(45);
      match(AslParser::T__1);
      setState(46);
      dynamic_cast<FunctionContext *>(_localctx)->basic_type = basic();
    }
    setState(49);
    declarations();
    setState(50);
    statements();
    setState(51);
    match(AslParser::ENDFUNC);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclarationsContext ------------------------------------------------------------------

AslParser::DeclarationsContext::DeclarationsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<AslParser::Variable_declContext *> AslParser::DeclarationsContext::variable_decl() {
  return getRuleContexts<AslParser::Variable_declContext>();
}

AslParser::Variable_declContext* AslParser::DeclarationsContext::variable_decl(size_t i) {
  return getRuleContext<AslParser::Variable_declContext>(i);
}


size_t AslParser::DeclarationsContext::getRuleIndex() const {
  return AslParser::RuleDeclarations;
}

antlrcpp::Any AslParser::DeclarationsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitDeclarations(this);
  else
    return visitor->visitChildren(this);
}

AslParser::DeclarationsContext* AslParser::declarations() {
  DeclarationsContext *_localctx = _tracker.createInstance<DeclarationsContext>(_ctx, getState());
  enterRule(_localctx, 4, AslParser::RuleDeclarations);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(56);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == AslParser::VAR) {
      setState(53);
      variable_decl();
      setState(58);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Variable_declContext ------------------------------------------------------------------

AslParser::Variable_declContext::Variable_declContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::Variable_declContext::VAR() {
  return getToken(AslParser::VAR, 0);
}

std::vector<tree::TerminalNode *> AslParser::Variable_declContext::ID() {
  return getTokens(AslParser::ID);
}

tree::TerminalNode* AslParser::Variable_declContext::ID(size_t i) {
  return getToken(AslParser::ID, i);
}

AslParser::TypeContext* AslParser::Variable_declContext::type() {
  return getRuleContext<AslParser::TypeContext>(0);
}


size_t AslParser::Variable_declContext::getRuleIndex() const {
  return AslParser::RuleVariable_decl;
}

antlrcpp::Any AslParser::Variable_declContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitVariable_decl(this);
  else
    return visitor->visitChildren(this);
}

AslParser::Variable_declContext* AslParser::variable_decl() {
  Variable_declContext *_localctx = _tracker.createInstance<Variable_declContext>(_ctx, getState());
  enterRule(_localctx, 6, AslParser::RuleVariable_decl);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(59);
    match(AslParser::VAR);
    setState(60);
    match(AslParser::ID);
    setState(65);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == AslParser::T__0) {
      setState(61);
      match(AslParser::T__0);
      setState(62);
      match(AslParser::ID);
      setState(67);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(68);
    match(AslParser::T__1);
    setState(69);
    type();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParamContext ------------------------------------------------------------------

AslParser::ParamContext::ParamContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::ParamContext::ID() {
  return getToken(AslParser::ID, 0);
}

AslParser::TypeContext* AslParser::ParamContext::type() {
  return getRuleContext<AslParser::TypeContext>(0);
}


size_t AslParser::ParamContext::getRuleIndex() const {
  return AslParser::RuleParam;
}

antlrcpp::Any AslParser::ParamContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitParam(this);
  else
    return visitor->visitChildren(this);
}

AslParser::ParamContext* AslParser::param() {
  ParamContext *_localctx = _tracker.createInstance<ParamContext>(_ctx, getState());
  enterRule(_localctx, 8, AslParser::RuleParam);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(71);
    match(AslParser::ID);
    setState(72);
    match(AslParser::T__1);
    setState(73);
    type();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeContext ------------------------------------------------------------------

AslParser::TypeContext::TypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t AslParser::TypeContext::getRuleIndex() const {
  return AslParser::RuleType;
}

void AslParser::TypeContext::copyFrom(TypeContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- BasicTypeContext ------------------------------------------------------------------

AslParser::BasicContext* AslParser::BasicTypeContext::basic() {
  return getRuleContext<AslParser::BasicContext>(0);
}

AslParser::BasicTypeContext::BasicTypeContext(TypeContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::BasicTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitBasicType(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ArrayTypeContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::ArrayTypeContext::CLAUOP() {
  return getToken(AslParser::CLAUOP, 0);
}

tree::TerminalNode* AslParser::ArrayTypeContext::INTVAL() {
  return getToken(AslParser::INTVAL, 0);
}

tree::TerminalNode* AslParser::ArrayTypeContext::CLAUCL() {
  return getToken(AslParser::CLAUCL, 0);
}

AslParser::BasicContext* AslParser::ArrayTypeContext::basic() {
  return getRuleContext<AslParser::BasicContext>(0);
}

AslParser::ArrayTypeContext::ArrayTypeContext(TypeContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ArrayTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitArrayType(this);
  else
    return visitor->visitChildren(this);
}
//----------------- MatrixTypeContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::MatrixTypeContext::CLAUOP() {
  return getToken(AslParser::CLAUOP, 0);
}

std::vector<tree::TerminalNode *> AslParser::MatrixTypeContext::INTVAL() {
  return getTokens(AslParser::INTVAL);
}

tree::TerminalNode* AslParser::MatrixTypeContext::INTVAL(size_t i) {
  return getToken(AslParser::INTVAL, i);
}

tree::TerminalNode* AslParser::MatrixTypeContext::CLAUCL() {
  return getToken(AslParser::CLAUCL, 0);
}

AslParser::BasicContext* AslParser::MatrixTypeContext::basic() {
  return getRuleContext<AslParser::BasicContext>(0);
}

AslParser::MatrixTypeContext::MatrixTypeContext(TypeContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::MatrixTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitMatrixType(this);
  else
    return visitor->visitChildren(this);
}
AslParser::TypeContext* AslParser::type() {
  TypeContext *_localctx = _tracker.createInstance<TypeContext>(_ctx, getState());
  enterRule(_localctx, 10, AslParser::RuleType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(90);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case AslParser::BASIC_TYPE: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<AslParser::BasicTypeContext>(_localctx));
        enterOuterAlt(_localctx, 1);
        setState(75);
        basic();
        break;
      }

      case AslParser::T__2: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<AslParser::MatrixTypeContext>(_localctx));
        enterOuterAlt(_localctx, 2);
        setState(76);
        match(AslParser::T__2);
        setState(77);
        match(AslParser::CLAUOP);
        setState(78);
        match(AslParser::INTVAL);
        setState(79);
        match(AslParser::T__0);
        setState(80);
        match(AslParser::INTVAL);
        setState(81);
        match(AslParser::CLAUCL);
        setState(82);
        match(AslParser::T__3);
        setState(83);
        dynamic_cast<MatrixTypeContext *>(_localctx)->t = basic();
        break;
      }

      case AslParser::T__4: {
        _localctx = dynamic_cast<TypeContext *>(_tracker.createInstance<AslParser::ArrayTypeContext>(_localctx));
        enterOuterAlt(_localctx, 3);
        setState(84);
        match(AslParser::T__4);
        setState(85);
        match(AslParser::CLAUOP);
        setState(86);
        match(AslParser::INTVAL);
        setState(87);
        match(AslParser::CLAUCL);
        setState(88);
        match(AslParser::T__3);
        setState(89);
        dynamic_cast<ArrayTypeContext *>(_localctx)->t = basic();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BasicContext ------------------------------------------------------------------

AslParser::BasicContext::BasicContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::BasicContext::BASIC_TYPE() {
  return getToken(AslParser::BASIC_TYPE, 0);
}


size_t AslParser::BasicContext::getRuleIndex() const {
  return AslParser::RuleBasic;
}

antlrcpp::Any AslParser::BasicContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitBasic(this);
  else
    return visitor->visitChildren(this);
}

AslParser::BasicContext* AslParser::basic() {
  BasicContext *_localctx = _tracker.createInstance<BasicContext>(_ctx, getState());
  enterRule(_localctx, 12, AslParser::RuleBasic);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(92);
    match(AslParser::BASIC_TYPE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementsContext ------------------------------------------------------------------

AslParser::StatementsContext::StatementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<AslParser::StatementContext *> AslParser::StatementsContext::statement() {
  return getRuleContexts<AslParser::StatementContext>();
}

AslParser::StatementContext* AslParser::StatementsContext::statement(size_t i) {
  return getRuleContext<AslParser::StatementContext>(i);
}


size_t AslParser::StatementsContext::getRuleIndex() const {
  return AslParser::RuleStatements;
}

antlrcpp::Any AslParser::StatementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitStatements(this);
  else
    return visitor->visitChildren(this);
}

AslParser::StatementsContext* AslParser::statements() {
  StatementsContext *_localctx = _tracker.createInstance<StatementsContext>(_ctx, getState());
  enterRule(_localctx, 14, AslParser::RuleStatements);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(97);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << AslParser::PAREOP)
      | (1ULL << AslParser::IF)
      | (1ULL << AslParser::WHILE)
      | (1ULL << AslParser::RETURN)
      | (1ULL << AslParser::READ)
      | (1ULL << AslParser::WRITE)
      | (1ULL << AslParser::ID))) != 0)) {
      setState(94);
      statement();
      setState(99);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

AslParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t AslParser::StatementContext::getRuleIndex() const {
  return AslParser::RuleStatement;
}

void AslParser::StatementContext::copyFrom(StatementContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- WriteExprContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::WriteExprContext::WRITE() {
  return getToken(AslParser::WRITE, 0);
}

AslParser::ExprContext* AslParser::WriteExprContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

AslParser::WriteExprContext::WriteExprContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::WriteExprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitWriteExpr(this);
  else
    return visitor->visitChildren(this);
}
//----------------- WhileStmtContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::WhileStmtContext::WHILE() {
  return getToken(AslParser::WHILE, 0);
}

AslParser::ExprContext* AslParser::WhileStmtContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::WhileStmtContext::DO() {
  return getToken(AslParser::DO, 0);
}

AslParser::StatementsContext* AslParser::WhileStmtContext::statements() {
  return getRuleContext<AslParser::StatementsContext>(0);
}

tree::TerminalNode* AslParser::WhileStmtContext::ENDWHILE() {
  return getToken(AslParser::ENDWHILE, 0);
}

AslParser::WhileStmtContext::WhileStmtContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::WhileStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitWhileStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- IfStmtContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::IfStmtContext::IF() {
  return getToken(AslParser::IF, 0);
}

AslParser::ExprContext* AslParser::IfStmtContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::IfStmtContext::THEN() {
  return getToken(AslParser::THEN, 0);
}

std::vector<AslParser::StatementsContext *> AslParser::IfStmtContext::statements() {
  return getRuleContexts<AslParser::StatementsContext>();
}

AslParser::StatementsContext* AslParser::IfStmtContext::statements(size_t i) {
  return getRuleContext<AslParser::StatementsContext>(i);
}

tree::TerminalNode* AslParser::IfStmtContext::ENDIF() {
  return getToken(AslParser::ENDIF, 0);
}

tree::TerminalNode* AslParser::IfStmtContext::ELSE() {
  return getToken(AslParser::ELSE, 0);
}

AslParser::IfStmtContext::IfStmtContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::IfStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitIfStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReadStmtContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::ReadStmtContext::READ() {
  return getToken(AslParser::READ, 0);
}

AslParser::Left_exprContext* AslParser::ReadStmtContext::left_expr() {
  return getRuleContext<AslParser::Left_exprContext>(0);
}

AslParser::ReadStmtContext::ReadStmtContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ReadStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitReadStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- AssignStmtContext ------------------------------------------------------------------

AslParser::Left_exprContext* AslParser::AssignStmtContext::left_expr() {
  return getRuleContext<AslParser::Left_exprContext>(0);
}

tree::TerminalNode* AslParser::AssignStmtContext::ASSIGN() {
  return getToken(AslParser::ASSIGN, 0);
}

AslParser::ExprContext* AslParser::AssignStmtContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

AslParser::AssignStmtContext::AssignStmtContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::AssignStmtContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitAssignStmt(this);
  else
    return visitor->visitChildren(this);
}
//----------------- WriteStringContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::WriteStringContext::WRITE() {
  return getToken(AslParser::WRITE, 0);
}

tree::TerminalNode* AslParser::WriteStringContext::STRING() {
  return getToken(AslParser::STRING, 0);
}

AslParser::WriteStringContext::WriteStringContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::WriteStringContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitWriteString(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ReturnContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::ReturnContext::RETURN() {
  return getToken(AslParser::RETURN, 0);
}

AslParser::ExprContext* AslParser::ReturnContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

AslParser::ReturnContext::ReturnContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ReturnContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitReturn(this);
  else
    return visitor->visitChildren(this);
}
//----------------- MethodCallContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::MethodCallContext::ID() {
  return getToken(AslParser::ID, 0);
}

tree::TerminalNode* AslParser::MethodCallContext::PAREOP() {
  return getToken(AslParser::PAREOP, 0);
}

tree::TerminalNode* AslParser::MethodCallContext::PARECL() {
  return getToken(AslParser::PARECL, 0);
}

std::vector<AslParser::ExprContext *> AslParser::MethodCallContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::MethodCallContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

AslParser::MethodCallContext::MethodCallContext(StatementContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::MethodCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitMethodCall(this);
  else
    return visitor->visitChildren(this);
}
AslParser::StatementContext* AslParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 16, AslParser::RuleStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(151);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx)) {
    case 1: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::AssignStmtContext>(_localctx));
      enterOuterAlt(_localctx, 1);
      setState(100);
      left_expr(0);
      setState(101);
      match(AslParser::ASSIGN);
      setState(102);
      expr(0);
      setState(103);
      match(AslParser::T__5);
      break;
    }

    case 2: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::IfStmtContext>(_localctx));
      enterOuterAlt(_localctx, 2);
      setState(105);
      match(AslParser::IF);
      setState(106);
      expr(0);
      setState(107);
      match(AslParser::THEN);
      setState(108);
      statements();
      setState(111);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == AslParser::ELSE) {
        setState(109);
        match(AslParser::ELSE);
        setState(110);
        statements();
      }
      setState(113);
      match(AslParser::ENDIF);
      break;
    }

    case 3: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::WhileStmtContext>(_localctx));
      enterOuterAlt(_localctx, 3);
      setState(115);
      match(AslParser::WHILE);
      setState(116);
      expr(0);
      setState(117);
      match(AslParser::DO);
      setState(118);
      statements();
      setState(119);
      match(AslParser::ENDWHILE);
      break;
    }

    case 4: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::ReadStmtContext>(_localctx));
      enterOuterAlt(_localctx, 4);
      setState(121);
      match(AslParser::READ);
      setState(122);
      left_expr(0);
      setState(123);
      match(AslParser::T__5);
      break;
    }

    case 5: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::WriteExprContext>(_localctx));
      enterOuterAlt(_localctx, 5);
      setState(125);
      match(AslParser::WRITE);
      setState(126);
      expr(0);
      setState(127);
      match(AslParser::T__5);
      break;
    }

    case 6: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::WriteStringContext>(_localctx));
      enterOuterAlt(_localctx, 6);
      setState(129);
      match(AslParser::WRITE);
      setState(130);
      match(AslParser::STRING);
      setState(131);
      match(AslParser::T__5);
      break;
    }

    case 7: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::MethodCallContext>(_localctx));
      enterOuterAlt(_localctx, 7);
      setState(132);
      match(AslParser::ID);
      setState(133);
      match(AslParser::PAREOP);
      setState(142);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << AslParser::PAREOP)
        | (1ULL << AslParser::NOT)
        | (1ULL << AslParser::PLUS)
        | (1ULL << AslParser::MINUS)
        | (1ULL << AslParser::BOOLVAL)
        | (1ULL << AslParser::INTVAL)
        | (1ULL << AslParser::FLOATVAL)
        | (1ULL << AslParser::CHARVAL)
        | (1ULL << AslParser::ID))) != 0)) {
        setState(134);
        expr(0);
        setState(139);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == AslParser::T__0) {
          setState(135);
          match(AslParser::T__0);
          setState(136);
          expr(0);
          setState(141);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
      }
      setState(144);
      match(AslParser::PARECL);
      setState(145);
      match(AslParser::T__5);
      break;
    }

    case 8: {
      _localctx = dynamic_cast<StatementContext *>(_tracker.createInstance<AslParser::ReturnContext>(_localctx));
      enterOuterAlt(_localctx, 8);
      setState(146);
      match(AslParser::RETURN);
      setState(148);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << AslParser::PAREOP)
        | (1ULL << AslParser::NOT)
        | (1ULL << AslParser::PLUS)
        | (1ULL << AslParser::MINUS)
        | (1ULL << AslParser::BOOLVAL)
        | (1ULL << AslParser::INTVAL)
        | (1ULL << AslParser::FLOATVAL)
        | (1ULL << AslParser::CHARVAL)
        | (1ULL << AslParser::ID))) != 0)) {
        setState(147);
        expr(0);
      }
      setState(150);
      match(AslParser::T__5);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- Left_exprContext ------------------------------------------------------------------

AslParser::Left_exprContext::Left_exprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::Left_exprContext::PAREOP() {
  return getToken(AslParser::PAREOP, 0);
}

AslParser::Left_exprContext* AslParser::Left_exprContext::left_expr() {
  return getRuleContext<AslParser::Left_exprContext>(0);
}

tree::TerminalNode* AslParser::Left_exprContext::PARECL() {
  return getToken(AslParser::PARECL, 0);
}

AslParser::IdentContext* AslParser::Left_exprContext::ident() {
  return getRuleContext<AslParser::IdentContext>(0);
}

tree::TerminalNode* AslParser::Left_exprContext::CLAUOP() {
  return getToken(AslParser::CLAUOP, 0);
}

std::vector<AslParser::ExprContext *> AslParser::Left_exprContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::Left_exprContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::Left_exprContext::CLAUCL() {
  return getToken(AslParser::CLAUCL, 0);
}


size_t AslParser::Left_exprContext::getRuleIndex() const {
  return AslParser::RuleLeft_expr;
}

antlrcpp::Any AslParser::Left_exprContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitLeft_expr(this);
  else
    return visitor->visitChildren(this);
}


AslParser::Left_exprContext* AslParser::left_expr() {
   return left_expr(0);
}

AslParser::Left_exprContext* AslParser::left_expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  AslParser::Left_exprContext *_localctx = _tracker.createInstance<Left_exprContext>(_ctx, parentState);
  AslParser::Left_exprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 18;
  enterRecursionRule(_localctx, 18, AslParser::RuleLeft_expr, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(159);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case AslParser::PAREOP: {
        setState(154);
        match(AslParser::PAREOP);
        setState(155);
        left_expr(0);
        setState(156);
        match(AslParser::PARECL);
        break;
      }

      case AslParser::ID: {
        setState(158);
        ident();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    _ctx->stop = _input->LT(-1);
    setState(175);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(173);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<Left_exprContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleLeft_expr);
          setState(161);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(162);
          match(AslParser::CLAUOP);
          setState(163);
          expr(0);
          setState(164);
          match(AslParser::CLAUCL);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<Left_exprContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleLeft_expr);
          setState(166);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(167);
          match(AslParser::CLAUOP);
          setState(168);
          expr(0);
          setState(169);
          match(AslParser::T__0);
          setState(170);
          expr(0);
          setState(171);
          match(AslParser::CLAUCL);
          break;
        }

        } 
      }
      setState(177);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 15, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- ExprContext ------------------------------------------------------------------

AslParser::ExprContext::ExprContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t AslParser::ExprContext::getRuleIndex() const {
  return AslParser::RuleExpr;
}

void AslParser::ExprContext::copyFrom(ExprContext *ctx) {
  ParserRuleContext::copyFrom(ctx);
}

//----------------- OrContext ------------------------------------------------------------------

std::vector<AslParser::ExprContext *> AslParser::OrContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::OrContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::OrContext::OR() {
  return getToken(AslParser::OR, 0);
}

AslParser::OrContext::OrContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::OrContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitOr(this);
  else
    return visitor->visitChildren(this);
}
//----------------- AndContext ------------------------------------------------------------------

std::vector<AslParser::ExprContext *> AslParser::AndContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::AndContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::AndContext::AND() {
  return getToken(AslParser::AND, 0);
}

AslParser::AndContext::AndContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::AndContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitAnd(this);
  else
    return visitor->visitChildren(this);
}
//----------------- FunctionCallContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::FunctionCallContext::ID() {
  return getToken(AslParser::ID, 0);
}

tree::TerminalNode* AslParser::FunctionCallContext::PAREOP() {
  return getToken(AslParser::PAREOP, 0);
}

tree::TerminalNode* AslParser::FunctionCallContext::PARECL() {
  return getToken(AslParser::PARECL, 0);
}

std::vector<AslParser::ExprContext *> AslParser::FunctionCallContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::FunctionCallContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

AslParser::FunctionCallContext::FunctionCallContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::FunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitFunctionCall(this);
  else
    return visitor->visitChildren(this);
}
//----------------- FactorialContext ------------------------------------------------------------------

AslParser::ExprContext* AslParser::FactorialContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::FactorialContext::EXCL() {
  return getToken(AslParser::EXCL, 0);
}

AslParser::FactorialContext::FactorialContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::FactorialContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitFactorial(this);
  else
    return visitor->visitChildren(this);
}
//----------------- MatrixIndexContext ------------------------------------------------------------------

AslParser::Left_exprContext* AslParser::MatrixIndexContext::left_expr() {
  return getRuleContext<AslParser::Left_exprContext>(0);
}

tree::TerminalNode* AslParser::MatrixIndexContext::CLAUOP() {
  return getToken(AslParser::CLAUOP, 0);
}

std::vector<AslParser::ExprContext *> AslParser::MatrixIndexContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::MatrixIndexContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::MatrixIndexContext::CLAUCL() {
  return getToken(AslParser::CLAUCL, 0);
}

AslParser::MatrixIndexContext::MatrixIndexContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::MatrixIndexContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitMatrixIndex(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ExprIdentContext ------------------------------------------------------------------

AslParser::IdentContext* AslParser::ExprIdentContext::ident() {
  return getRuleContext<AslParser::IdentContext>(0);
}

AslParser::ExprIdentContext::ExprIdentContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ExprIdentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitExprIdent(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ArithmeticContext ------------------------------------------------------------------

std::vector<AslParser::ExprContext *> AslParser::ArithmeticContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::ArithmeticContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::ArithmeticContext::MUL() {
  return getToken(AslParser::MUL, 0);
}

tree::TerminalNode* AslParser::ArithmeticContext::DIV() {
  return getToken(AslParser::DIV, 0);
}

tree::TerminalNode* AslParser::ArithmeticContext::MOD() {
  return getToken(AslParser::MOD, 0);
}

tree::TerminalNode* AslParser::ArithmeticContext::PLUS() {
  return getToken(AslParser::PLUS, 0);
}

tree::TerminalNode* AslParser::ArithmeticContext::MINUS() {
  return getToken(AslParser::MINUS, 0);
}

AslParser::ArithmeticContext::ArithmeticContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ArithmeticContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitArithmetic(this);
  else
    return visitor->visitChildren(this);
}
//----------------- RelationalContext ------------------------------------------------------------------

std::vector<AslParser::ExprContext *> AslParser::RelationalContext::expr() {
  return getRuleContexts<AslParser::ExprContext>();
}

AslParser::ExprContext* AslParser::RelationalContext::expr(size_t i) {
  return getRuleContext<AslParser::ExprContext>(i);
}

tree::TerminalNode* AslParser::RelationalContext::EQUAL() {
  return getToken(AslParser::EQUAL, 0);
}

tree::TerminalNode* AslParser::RelationalContext::NOTEQUAL() {
  return getToken(AslParser::NOTEQUAL, 0);
}

tree::TerminalNode* AslParser::RelationalContext::GT() {
  return getToken(AslParser::GT, 0);
}

tree::TerminalNode* AslParser::RelationalContext::GE() {
  return getToken(AslParser::GE, 0);
}

tree::TerminalNode* AslParser::RelationalContext::LT() {
  return getToken(AslParser::LT, 0);
}

tree::TerminalNode* AslParser::RelationalContext::LE() {
  return getToken(AslParser::LE, 0);
}

AslParser::RelationalContext::RelationalContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::RelationalContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitRelational(this);
  else
    return visitor->visitChildren(this);
}
//----------------- UnaryContext ------------------------------------------------------------------

AslParser::ExprContext* AslParser::UnaryContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::UnaryContext::MINUS() {
  return getToken(AslParser::MINUS, 0);
}

tree::TerminalNode* AslParser::UnaryContext::PLUS() {
  return getToken(AslParser::PLUS, 0);
}

tree::TerminalNode* AslParser::UnaryContext::NOT() {
  return getToken(AslParser::NOT, 0);
}

AslParser::UnaryContext::UnaryContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::UnaryContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitUnary(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ArrayIndexContext ------------------------------------------------------------------

AslParser::Left_exprContext* AslParser::ArrayIndexContext::left_expr() {
  return getRuleContext<AslParser::Left_exprContext>(0);
}

tree::TerminalNode* AslParser::ArrayIndexContext::CLAUOP() {
  return getToken(AslParser::CLAUOP, 0);
}

AslParser::ExprContext* AslParser::ArrayIndexContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::ArrayIndexContext::CLAUCL() {
  return getToken(AslParser::CLAUCL, 0);
}

AslParser::ArrayIndexContext::ArrayIndexContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ArrayIndexContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitArrayIndex(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ParenthesisContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::ParenthesisContext::PAREOP() {
  return getToken(AslParser::PAREOP, 0);
}

AslParser::ExprContext* AslParser::ParenthesisContext::expr() {
  return getRuleContext<AslParser::ExprContext>(0);
}

tree::TerminalNode* AslParser::ParenthesisContext::PARECL() {
  return getToken(AslParser::PARECL, 0);
}

AslParser::ParenthesisContext::ParenthesisContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ParenthesisContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitParenthesis(this);
  else
    return visitor->visitChildren(this);
}
//----------------- ValueContext ------------------------------------------------------------------

tree::TerminalNode* AslParser::ValueContext::INTVAL() {
  return getToken(AslParser::INTVAL, 0);
}

tree::TerminalNode* AslParser::ValueContext::BOOLVAL() {
  return getToken(AslParser::BOOLVAL, 0);
}

tree::TerminalNode* AslParser::ValueContext::FLOATVAL() {
  return getToken(AslParser::FLOATVAL, 0);
}

tree::TerminalNode* AslParser::ValueContext::CHARVAL() {
  return getToken(AslParser::CHARVAL, 0);
}

AslParser::ValueContext::ValueContext(ExprContext *ctx) { copyFrom(ctx); }

antlrcpp::Any AslParser::ValueContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitValue(this);
  else
    return visitor->visitChildren(this);
}

AslParser::ExprContext* AslParser::expr() {
   return expr(0);
}

AslParser::ExprContext* AslParser::expr(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  AslParser::ExprContext *_localctx = _tracker.createInstance<ExprContext>(_ctx, parentState);
  AslParser::ExprContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 20;
  enterRecursionRule(_localctx, 20, AslParser::RuleExpr, precedence);

    size_t _la = 0;

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(216);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 19, _ctx)) {
    case 1: {
      _localctx = _tracker.createInstance<UnaryContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;

      setState(182);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case AslParser::MINUS: {
          setState(179);
          dynamic_cast<UnaryContext *>(_localctx)->op = match(AslParser::MINUS);
          break;
        }

        case AslParser::PLUS: {
          setState(180);
          dynamic_cast<UnaryContext *>(_localctx)->op = match(AslParser::PLUS);
          break;
        }

        case AslParser::NOT: {
          setState(181);
          dynamic_cast<UnaryContext *>(_localctx)->op = match(AslParser::NOT);
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(184);
      expr(12);
      break;
    }

    case 2: {
      _localctx = _tracker.createInstance<MatrixIndexContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(185);
      left_expr(0);
      setState(186);
      match(AslParser::CLAUOP);
      setState(187);
      expr(0);
      setState(188);
      match(AslParser::T__0);
      setState(189);
      expr(0);
      setState(190);
      match(AslParser::CLAUCL);
      break;
    }

    case 3: {
      _localctx = _tracker.createInstance<ArrayIndexContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(192);
      left_expr(0);
      setState(193);
      match(AslParser::CLAUOP);
      setState(194);
      expr(0);
      setState(195);
      match(AslParser::CLAUCL);
      break;
    }

    case 4: {
      _localctx = _tracker.createInstance<ParenthesisContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(197);
      match(AslParser::PAREOP);
      setState(198);
      expr(0);
      setState(199);
      match(AslParser::PARECL);
      break;
    }

    case 5: {
      _localctx = _tracker.createInstance<ValueContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(201);
      _la = _input->LA(1);
      if (!((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << AslParser::BOOLVAL)
        | (1ULL << AslParser::INTVAL)
        | (1ULL << AslParser::FLOATVAL)
        | (1ULL << AslParser::CHARVAL))) != 0))) {
      _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      break;
    }

    case 6: {
      _localctx = _tracker.createInstance<FunctionCallContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(202);
      match(AslParser::ID);
      setState(203);
      match(AslParser::PAREOP);
      setState(212);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << AslParser::PAREOP)
        | (1ULL << AslParser::NOT)
        | (1ULL << AslParser::PLUS)
        | (1ULL << AslParser::MINUS)
        | (1ULL << AslParser::BOOLVAL)
        | (1ULL << AslParser::INTVAL)
        | (1ULL << AslParser::FLOATVAL)
        | (1ULL << AslParser::CHARVAL)
        | (1ULL << AslParser::ID))) != 0)) {
        setState(204);
        expr(0);
        setState(209);
        _errHandler->sync(this);
        _la = _input->LA(1);
        while (_la == AslParser::T__0) {
          setState(205);
          match(AslParser::T__0);
          setState(206);
          expr(0);
          setState(211);
          _errHandler->sync(this);
          _la = _input->LA(1);
        }
      }
      setState(214);
      match(AslParser::PARECL);
      break;
    }

    case 7: {
      _localctx = _tracker.createInstance<ExprIdentContext>(_localctx);
      _ctx = _localctx;
      previousContext = _localctx;
      setState(215);
      ident();
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(251);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(249);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx)) {
        case 1: {
          auto newContext = _tracker.createInstance<ArithmeticContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(218);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(222);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case AslParser::MUL: {
              setState(219);
              dynamic_cast<ArithmeticContext *>(_localctx)->op = match(AslParser::MUL);
              break;
            }

            case AslParser::DIV: {
              setState(220);
              dynamic_cast<ArithmeticContext *>(_localctx)->op = match(AslParser::DIV);
              break;
            }

            case AslParser::MOD: {
              setState(221);
              dynamic_cast<ArithmeticContext *>(_localctx)->op = match(AslParser::MOD);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
          setState(224);
          expr(9);
          break;
        }

        case 2: {
          auto newContext = _tracker.createInstance<ArithmeticContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(225);

          if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
          setState(228);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case AslParser::PLUS: {
              setState(226);
              dynamic_cast<ArithmeticContext *>(_localctx)->op = match(AslParser::PLUS);
              break;
            }

            case AslParser::MINUS: {
              setState(227);
              dynamic_cast<ArithmeticContext *>(_localctx)->op = match(AslParser::MINUS);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
          setState(230);
          expr(8);
          break;
        }

        case 3: {
          auto newContext = _tracker.createInstance<RelationalContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(231);

          if (!(precpred(_ctx, 6))) throw FailedPredicateException(this, "precpred(_ctx, 6)");
          setState(238);
          _errHandler->sync(this);
          switch (_input->LA(1)) {
            case AslParser::EQUAL: {
              setState(232);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::EQUAL);
              break;
            }

            case AslParser::NOTEQUAL: {
              setState(233);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::NOTEQUAL);
              break;
            }

            case AslParser::GT: {
              setState(234);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::GT);
              break;
            }

            case AslParser::GE: {
              setState(235);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::GE);
              break;
            }

            case AslParser::LT: {
              setState(236);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::LT);
              break;
            }

            case AslParser::LE: {
              setState(237);
              dynamic_cast<RelationalContext *>(_localctx)->op = match(AslParser::LE);
              break;
            }

          default:
            throw NoViableAltException(this);
          }
          setState(240);
          expr(7);
          break;
        }

        case 4: {
          auto newContext = _tracker.createInstance<AndContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(241);

          if (!(precpred(_ctx, 5))) throw FailedPredicateException(this, "precpred(_ctx, 5)");

          setState(242);
          dynamic_cast<AndContext *>(_localctx)->op = match(AslParser::AND);
          setState(243);
          expr(6);
          break;
        }

        case 5: {
          auto newContext = _tracker.createInstance<OrContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(244);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");

          setState(245);
          dynamic_cast<OrContext *>(_localctx)->op = match(AslParser::OR);
          setState(246);
          expr(5);
          break;
        }

        case 6: {
          auto newContext = _tracker.createInstance<FactorialContext>(_tracker.createInstance<ExprContext>(parentContext, parentState));
          _localctx = newContext;
          pushNewRecursionContext(newContext, startState, RuleExpr);
          setState(247);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(248);
          dynamic_cast<FactorialContext *>(_localctx)->op = match(AslParser::EXCL);
          break;
        }

        } 
      }
      setState(253);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 24, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- IdentContext ------------------------------------------------------------------

AslParser::IdentContext::IdentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* AslParser::IdentContext::ID() {
  return getToken(AslParser::ID, 0);
}


size_t AslParser::IdentContext::getRuleIndex() const {
  return AslParser::RuleIdent;
}

antlrcpp::Any AslParser::IdentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<AslVisitor*>(visitor))
    return parserVisitor->visitIdent(this);
  else
    return visitor->visitChildren(this);
}

AslParser::IdentContext* AslParser::ident() {
  IdentContext *_localctx = _tracker.createInstance<IdentContext>(_ctx, getState());
  enterRule(_localctx, 22, AslParser::RuleIdent);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(254);
    match(AslParser::ID);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool AslParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 9: return left_exprSempred(dynamic_cast<Left_exprContext *>(context), predicateIndex);
    case 10: return exprSempred(dynamic_cast<ExprContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool AslParser::left_exprSempred(Left_exprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 3);
    case 1: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

bool AslParser::exprSempred(ExprContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 2: return precpred(_ctx, 8);
    case 3: return precpred(_ctx, 7);
    case 4: return precpred(_ctx, 6);
    case 5: return precpred(_ctx, 5);
    case 6: return precpred(_ctx, 4);
    case 7: return precpred(_ctx, 13);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> AslParser::_decisionToDFA;
atn::PredictionContextCache AslParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN AslParser::_atn;
std::vector<uint16_t> AslParser::_serializedATN;

std::vector<std::string> AslParser::_ruleNames = {
  "program", "function", "declarations", "variable_decl", "param", "type", 
  "basic", "statements", "statement", "left_expr", "expr", "ident"
};

std::vector<std::string> AslParser::_literalNames = {
  "", "','", "':'", "'matrix'", "'of'", "'array'", "';'", "'!'", "'('", 
  "')'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", 
  "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'var'", 
  "", "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", "'else'", 
  "'endif'", "'while'", "'do'", "'endwhile'", "'func'", "'return'", "'endfunc'", 
  "'read'", "'write'"
};

std::vector<std::string> AslParser::_symbolicNames = {
  "", "", "", "", "", "", "", "EXCL", "PAREOP", "PARECL", "CLAUOP", "CLAUCL", 
  "LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", "OR", 
  "PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "BASIC_TYPE", "INT", "BOOL", 
  "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", 
  "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "FLOATVAL", 
  "CHARVAL", "ID", "STRING", "COMMENT", "WS"
};

dfa::Vocabulary AslParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> AslParser::_tokenNames;

AslParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x36, 0x103, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x3, 0x2, 0x6, 0x2, 
    0x1c, 0xa, 0x2, 0xd, 0x2, 0xe, 0x2, 0x1d, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x7, 0x3, 0x28, 0xa, 
    0x3, 0xc, 0x3, 0xe, 0x3, 0x2b, 0xb, 0x3, 0x5, 0x3, 0x2d, 0xa, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x32, 0xa, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x7, 0x4, 0x39, 0xa, 0x4, 0xc, 0x4, 0xe, 
    0x4, 0x3c, 0xb, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 
    0x42, 0xa, 0x5, 0xc, 0x5, 0xe, 0x5, 0x45, 0xb, 0x5, 0x3, 0x5, 0x3, 0x5, 
    0x3, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 
    0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 
    0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 
    0x5d, 0xa, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x7, 0x9, 0x62, 0xa, 0x9, 
    0xc, 0x9, 0xe, 0x9, 0x65, 0xb, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 
    0xa, 0x5, 0xa, 0x72, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x7, 0xa, 
    0x8c, 0xa, 0xa, 0xc, 0xa, 0xe, 0xa, 0x8f, 0xb, 0xa, 0x5, 0xa, 0x91, 
    0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0x97, 0xa, 
    0xa, 0x3, 0xa, 0x5, 0xa, 0x9a, 0xa, 0xa, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
    0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xa2, 0xa, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x7, 0xb, 0xb0, 0xa, 0xb, 0xc, 0xb, 
    0xe, 0xb, 0xb3, 0xb, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 
    0xc, 0xb9, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x7, 0xc, 0xd2, 0xa, 0xc, 0xc, 
    0xc, 0xe, 0xc, 0xd5, 0xb, 0xc, 0x5, 0xc, 0xd7, 0xa, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x5, 0xc, 0xdb, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x5, 0xc, 0xe1, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 
    0xc, 0xe7, 0xa, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x5, 0xc, 0xf1, 0xa, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 
    0xc, 0x7, 0xc, 0xfc, 0xa, 0xc, 0xc, 0xc, 0xe, 0xc, 0xff, 0xb, 0xc, 0x3, 
    0xd, 0x3, 0xd, 0x3, 0xd, 0x2, 0x4, 0x14, 0x16, 0xe, 0x2, 0x4, 0x6, 0x8, 
    0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x2, 0x3, 0x3, 0x2, 0x2f, 
    0x32, 0x2, 0x125, 0x2, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x4, 0x21, 0x3, 0x2, 
    0x2, 0x2, 0x6, 0x3a, 0x3, 0x2, 0x2, 0x2, 0x8, 0x3d, 0x3, 0x2, 0x2, 0x2, 
    0xa, 0x49, 0x3, 0x2, 0x2, 0x2, 0xc, 0x5c, 0x3, 0x2, 0x2, 0x2, 0xe, 0x5e, 
    0x3, 0x2, 0x2, 0x2, 0x10, 0x63, 0x3, 0x2, 0x2, 0x2, 0x12, 0x99, 0x3, 
    0x2, 0x2, 0x2, 0x14, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x16, 0xda, 0x3, 0x2, 
    0x2, 0x2, 0x18, 0x100, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x1c, 0x5, 0x4, 0x3, 
    0x2, 0x1b, 0x1a, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x1d, 0x3, 0x2, 0x2, 0x2, 
    0x1d, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x1d, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x1e, 
    0x1f, 0x3, 0x2, 0x2, 0x2, 0x1f, 0x20, 0x7, 0x2, 0x2, 0x3, 0x20, 0x3, 
    0x3, 0x2, 0x2, 0x2, 0x21, 0x22, 0x7, 0x2a, 0x2, 0x2, 0x22, 0x23, 0x7, 
    0x33, 0x2, 0x2, 0x23, 0x2c, 0x7, 0xa, 0x2, 0x2, 0x24, 0x29, 0x5, 0xa, 
    0x6, 0x2, 0x25, 0x26, 0x7, 0x3, 0x2, 0x2, 0x26, 0x28, 0x5, 0xa, 0x6, 
    0x2, 0x27, 0x25, 0x3, 0x2, 0x2, 0x2, 0x28, 0x2b, 0x3, 0x2, 0x2, 0x2, 
    0x29, 0x27, 0x3, 0x2, 0x2, 0x2, 0x29, 0x2a, 0x3, 0x2, 0x2, 0x2, 0x2a, 
    0x2d, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x29, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x24, 
    0x3, 0x2, 0x2, 0x2, 0x2c, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x2d, 0x2e, 0x3, 
    0x2, 0x2, 0x2, 0x2e, 0x31, 0x7, 0xb, 0x2, 0x2, 0x2f, 0x30, 0x7, 0x4, 
    0x2, 0x2, 0x30, 0x32, 0x5, 0xe, 0x8, 0x2, 0x31, 0x2f, 0x3, 0x2, 0x2, 
    0x2, 0x31, 0x32, 0x3, 0x2, 0x2, 0x2, 0x32, 0x33, 0x3, 0x2, 0x2, 0x2, 
    0x33, 0x34, 0x5, 0x6, 0x4, 0x2, 0x34, 0x35, 0x5, 0x10, 0x9, 0x2, 0x35, 
    0x36, 0x7, 0x2c, 0x2, 0x2, 0x36, 0x5, 0x3, 0x2, 0x2, 0x2, 0x37, 0x39, 
    0x5, 0x8, 0x5, 0x2, 0x38, 0x37, 0x3, 0x2, 0x2, 0x2, 0x39, 0x3c, 0x3, 
    0x2, 0x2, 0x2, 0x3a, 0x38, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x3b, 0x3, 0x2, 
    0x2, 0x2, 0x3b, 0x7, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x3a, 0x3, 0x2, 0x2, 
    0x2, 0x3d, 0x3e, 0x7, 0x1d, 0x2, 0x2, 0x3e, 0x43, 0x7, 0x33, 0x2, 0x2, 
    0x3f, 0x40, 0x7, 0x3, 0x2, 0x2, 0x40, 0x42, 0x7, 0x33, 0x2, 0x2, 0x41, 
    0x3f, 0x3, 0x2, 0x2, 0x2, 0x42, 0x45, 0x3, 0x2, 0x2, 0x2, 0x43, 0x41, 
    0x3, 0x2, 0x2, 0x2, 0x43, 0x44, 0x3, 0x2, 0x2, 0x2, 0x44, 0x46, 0x3, 
    0x2, 0x2, 0x2, 0x45, 0x43, 0x3, 0x2, 0x2, 0x2, 0x46, 0x47, 0x7, 0x4, 
    0x2, 0x2, 0x47, 0x48, 0x5, 0xc, 0x7, 0x2, 0x48, 0x9, 0x3, 0x2, 0x2, 
    0x2, 0x49, 0x4a, 0x7, 0x33, 0x2, 0x2, 0x4a, 0x4b, 0x7, 0x4, 0x2, 0x2, 
    0x4b, 0x4c, 0x5, 0xc, 0x7, 0x2, 0x4c, 0xb, 0x3, 0x2, 0x2, 0x2, 0x4d, 
    0x5d, 0x5, 0xe, 0x8, 0x2, 0x4e, 0x4f, 0x7, 0x5, 0x2, 0x2, 0x4f, 0x50, 
    0x7, 0xc, 0x2, 0x2, 0x50, 0x51, 0x7, 0x30, 0x2, 0x2, 0x51, 0x52, 0x7, 
    0x3, 0x2, 0x2, 0x52, 0x53, 0x7, 0x30, 0x2, 0x2, 0x53, 0x54, 0x7, 0xd, 
    0x2, 0x2, 0x54, 0x55, 0x7, 0x6, 0x2, 0x2, 0x55, 0x5d, 0x5, 0xe, 0x8, 
    0x2, 0x56, 0x57, 0x7, 0x7, 0x2, 0x2, 0x57, 0x58, 0x7, 0xc, 0x2, 0x2, 
    0x58, 0x59, 0x7, 0x30, 0x2, 0x2, 0x59, 0x5a, 0x7, 0xd, 0x2, 0x2, 0x5a, 
    0x5b, 0x7, 0x6, 0x2, 0x2, 0x5b, 0x5d, 0x5, 0xe, 0x8, 0x2, 0x5c, 0x4d, 
    0x3, 0x2, 0x2, 0x2, 0x5c, 0x4e, 0x3, 0x2, 0x2, 0x2, 0x5c, 0x56, 0x3, 
    0x2, 0x2, 0x2, 0x5d, 0xd, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x5f, 0x7, 0x1e, 
    0x2, 0x2, 0x5f, 0xf, 0x3, 0x2, 0x2, 0x2, 0x60, 0x62, 0x5, 0x12, 0xa, 
    0x2, 0x61, 0x60, 0x3, 0x2, 0x2, 0x2, 0x62, 0x65, 0x3, 0x2, 0x2, 0x2, 
    0x63, 0x61, 0x3, 0x2, 0x2, 0x2, 0x63, 0x64, 0x3, 0x2, 0x2, 0x2, 0x64, 
    0x11, 0x3, 0x2, 0x2, 0x2, 0x65, 0x63, 0x3, 0x2, 0x2, 0x2, 0x66, 0x67, 
    0x5, 0x14, 0xb, 0x2, 0x67, 0x68, 0x7, 0x12, 0x2, 0x2, 0x68, 0x69, 0x5, 
    0x16, 0xc, 0x2, 0x69, 0x6a, 0x7, 0x8, 0x2, 0x2, 0x6a, 0x9a, 0x3, 0x2, 
    0x2, 0x2, 0x6b, 0x6c, 0x7, 0x23, 0x2, 0x2, 0x6c, 0x6d, 0x5, 0x16, 0xc, 
    0x2, 0x6d, 0x6e, 0x7, 0x24, 0x2, 0x2, 0x6e, 0x71, 0x5, 0x10, 0x9, 0x2, 
    0x6f, 0x70, 0x7, 0x25, 0x2, 0x2, 0x70, 0x72, 0x5, 0x10, 0x9, 0x2, 0x71, 
    0x6f, 0x3, 0x2, 0x2, 0x2, 0x71, 0x72, 0x3, 0x2, 0x2, 0x2, 0x72, 0x73, 
    0x3, 0x2, 0x2, 0x2, 0x73, 0x74, 0x7, 0x26, 0x2, 0x2, 0x74, 0x9a, 0x3, 
    0x2, 0x2, 0x2, 0x75, 0x76, 0x7, 0x27, 0x2, 0x2, 0x76, 0x77, 0x5, 0x16, 
    0xc, 0x2, 0x77, 0x78, 0x7, 0x28, 0x2, 0x2, 0x78, 0x79, 0x5, 0x10, 0x9, 
    0x2, 0x79, 0x7a, 0x7, 0x29, 0x2, 0x2, 0x7a, 0x9a, 0x3, 0x2, 0x2, 0x2, 
    0x7b, 0x7c, 0x7, 0x2d, 0x2, 0x2, 0x7c, 0x7d, 0x5, 0x14, 0xb, 0x2, 0x7d, 
    0x7e, 0x7, 0x8, 0x2, 0x2, 0x7e, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x80, 
    0x7, 0x2e, 0x2, 0x2, 0x80, 0x81, 0x5, 0x16, 0xc, 0x2, 0x81, 0x82, 0x7, 
    0x8, 0x2, 0x2, 0x82, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x83, 0x84, 0x7, 0x2e, 
    0x2, 0x2, 0x84, 0x85, 0x7, 0x34, 0x2, 0x2, 0x85, 0x9a, 0x7, 0x8, 0x2, 
    0x2, 0x86, 0x87, 0x7, 0x33, 0x2, 0x2, 0x87, 0x90, 0x7, 0xa, 0x2, 0x2, 
    0x88, 0x8d, 0x5, 0x16, 0xc, 0x2, 0x89, 0x8a, 0x7, 0x3, 0x2, 0x2, 0x8a, 
    0x8c, 0x5, 0x16, 0xc, 0x2, 0x8b, 0x89, 0x3, 0x2, 0x2, 0x2, 0x8c, 0x8f, 
    0x3, 0x2, 0x2, 0x2, 0x8d, 0x8b, 0x3, 0x2, 0x2, 0x2, 0x8d, 0x8e, 0x3, 
    0x2, 0x2, 0x2, 0x8e, 0x91, 0x3, 0x2, 0x2, 0x2, 0x8f, 0x8d, 0x3, 0x2, 
    0x2, 0x2, 0x90, 0x88, 0x3, 0x2, 0x2, 0x2, 0x90, 0x91, 0x3, 0x2, 0x2, 
    0x2, 0x91, 0x92, 0x3, 0x2, 0x2, 0x2, 0x92, 0x93, 0x7, 0xb, 0x2, 0x2, 
    0x93, 0x9a, 0x7, 0x8, 0x2, 0x2, 0x94, 0x96, 0x7, 0x2b, 0x2, 0x2, 0x95, 
    0x97, 0x5, 0x16, 0xc, 0x2, 0x96, 0x95, 0x3, 0x2, 0x2, 0x2, 0x96, 0x97, 
    0x3, 0x2, 0x2, 0x2, 0x97, 0x98, 0x3, 0x2, 0x2, 0x2, 0x98, 0x9a, 0x7, 
    0x8, 0x2, 0x2, 0x99, 0x66, 0x3, 0x2, 0x2, 0x2, 0x99, 0x6b, 0x3, 0x2, 
    0x2, 0x2, 0x99, 0x75, 0x3, 0x2, 0x2, 0x2, 0x99, 0x7b, 0x3, 0x2, 0x2, 
    0x2, 0x99, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x99, 0x83, 0x3, 0x2, 0x2, 0x2, 
    0x99, 0x86, 0x3, 0x2, 0x2, 0x2, 0x99, 0x94, 0x3, 0x2, 0x2, 0x2, 0x9a, 
    0x13, 0x3, 0x2, 0x2, 0x2, 0x9b, 0x9c, 0x8, 0xb, 0x1, 0x2, 0x9c, 0x9d, 
    0x7, 0xa, 0x2, 0x2, 0x9d, 0x9e, 0x5, 0x14, 0xb, 0x2, 0x9e, 0x9f, 0x7, 
    0xb, 0x2, 0x2, 0x9f, 0xa2, 0x3, 0x2, 0x2, 0x2, 0xa0, 0xa2, 0x5, 0x18, 
    0xd, 0x2, 0xa1, 0x9b, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa0, 0x3, 0x2, 0x2, 
    0x2, 0xa2, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xa3, 0xa4, 0xc, 0x5, 0x2, 0x2, 
    0xa4, 0xa5, 0x7, 0xc, 0x2, 0x2, 0xa5, 0xa6, 0x5, 0x16, 0xc, 0x2, 0xa6, 
    0xa7, 0x7, 0xd, 0x2, 0x2, 0xa7, 0xb0, 0x3, 0x2, 0x2, 0x2, 0xa8, 0xa9, 
    0xc, 0x4, 0x2, 0x2, 0xa9, 0xaa, 0x7, 0xc, 0x2, 0x2, 0xaa, 0xab, 0x5, 
    0x16, 0xc, 0x2, 0xab, 0xac, 0x7, 0x3, 0x2, 0x2, 0xac, 0xad, 0x5, 0x16, 
    0xc, 0x2, 0xad, 0xae, 0x7, 0xd, 0x2, 0x2, 0xae, 0xb0, 0x3, 0x2, 0x2, 
    0x2, 0xaf, 0xa3, 0x3, 0x2, 0x2, 0x2, 0xaf, 0xa8, 0x3, 0x2, 0x2, 0x2, 
    0xb0, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xb1, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xb1, 
    0xb2, 0x3, 0x2, 0x2, 0x2, 0xb2, 0x15, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xb1, 
    0x3, 0x2, 0x2, 0x2, 0xb4, 0xb8, 0x8, 0xc, 0x1, 0x2, 0xb5, 0xb9, 0x7, 
    0x19, 0x2, 0x2, 0xb6, 0xb9, 0x7, 0x18, 0x2, 0x2, 0xb7, 0xb9, 0x7, 0x15, 
    0x2, 0x2, 0xb8, 0xb5, 0x3, 0x2, 0x2, 0x2, 0xb8, 0xb6, 0x3, 0x2, 0x2, 
    0x2, 0xb8, 0xb7, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xba, 0x3, 0x2, 0x2, 0x2, 
    0xba, 0xdb, 0x5, 0x16, 0xc, 0xe, 0xbb, 0xbc, 0x5, 0x14, 0xb, 0x2, 0xbc, 
    0xbd, 0x7, 0xc, 0x2, 0x2, 0xbd, 0xbe, 0x5, 0x16, 0xc, 0x2, 0xbe, 0xbf, 
    0x7, 0x3, 0x2, 0x2, 0xbf, 0xc0, 0x5, 0x16, 0xc, 0x2, 0xc0, 0xc1, 0x7, 
    0xd, 0x2, 0x2, 0xc1, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xc2, 0xc3, 0x5, 0x14, 
    0xb, 0x2, 0xc3, 0xc4, 0x7, 0xc, 0x2, 0x2, 0xc4, 0xc5, 0x5, 0x16, 0xc, 
    0x2, 0xc5, 0xc6, 0x7, 0xd, 0x2, 0x2, 0xc6, 0xdb, 0x3, 0x2, 0x2, 0x2, 
    0xc7, 0xc8, 0x7, 0xa, 0x2, 0x2, 0xc8, 0xc9, 0x5, 0x16, 0xc, 0x2, 0xc9, 
    0xca, 0x7, 0xb, 0x2, 0x2, 0xca, 0xdb, 0x3, 0x2, 0x2, 0x2, 0xcb, 0xdb, 
    0x9, 0x2, 0x2, 0x2, 0xcc, 0xcd, 0x7, 0x33, 0x2, 0x2, 0xcd, 0xd6, 0x7, 
    0xa, 0x2, 0x2, 0xce, 0xd3, 0x5, 0x16, 0xc, 0x2, 0xcf, 0xd0, 0x7, 0x3, 
    0x2, 0x2, 0xd0, 0xd2, 0x5, 0x16, 0xc, 0x2, 0xd1, 0xcf, 0x3, 0x2, 0x2, 
    0x2, 0xd2, 0xd5, 0x3, 0x2, 0x2, 0x2, 0xd3, 0xd1, 0x3, 0x2, 0x2, 0x2, 
    0xd3, 0xd4, 0x3, 0x2, 0x2, 0x2, 0xd4, 0xd7, 0x3, 0x2, 0x2, 0x2, 0xd5, 
    0xd3, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xd7, 
    0x3, 0x2, 0x2, 0x2, 0xd7, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xd8, 0xdb, 0x7, 
    0xb, 0x2, 0x2, 0xd9, 0xdb, 0x5, 0x18, 0xd, 0x2, 0xda, 0xb4, 0x3, 0x2, 
    0x2, 0x2, 0xda, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xda, 0xc2, 0x3, 0x2, 0x2, 
    0x2, 0xda, 0xc7, 0x3, 0x2, 0x2, 0x2, 0xda, 0xcb, 0x3, 0x2, 0x2, 0x2, 
    0xda, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xda, 0xd9, 0x3, 0x2, 0x2, 0x2, 0xdb, 
    0xfd, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xe0, 0xc, 0xa, 0x2, 0x2, 0xdd, 0xe1, 
    0x7, 0x1a, 0x2, 0x2, 0xde, 0xe1, 0x7, 0x1b, 0x2, 0x2, 0xdf, 0xe1, 0x7, 
    0x1c, 0x2, 0x2, 0xe0, 0xdd, 0x3, 0x2, 0x2, 0x2, 0xe0, 0xde, 0x3, 0x2, 
    0x2, 0x2, 0xe0, 0xdf, 0x3, 0x2, 0x2, 0x2, 0xe1, 0xe2, 0x3, 0x2, 0x2, 
    0x2, 0xe2, 0xfc, 0x5, 0x16, 0xc, 0xb, 0xe3, 0xe6, 0xc, 0x9, 0x2, 0x2, 
    0xe4, 0xe7, 0x7, 0x18, 0x2, 0x2, 0xe5, 0xe7, 0x7, 0x19, 0x2, 0x2, 0xe6, 
    0xe4, 0x3, 0x2, 0x2, 0x2, 0xe6, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xe8, 
    0x3, 0x2, 0x2, 0x2, 0xe8, 0xfc, 0x5, 0x16, 0xc, 0xa, 0xe9, 0xf0, 0xc, 
    0x8, 0x2, 0x2, 0xea, 0xf1, 0x7, 0x13, 0x2, 0x2, 0xeb, 0xf1, 0x7, 0x14, 
    0x2, 0x2, 0xec, 0xf1, 0x7, 0x10, 0x2, 0x2, 0xed, 0xf1, 0x7, 0x11, 0x2, 
    0x2, 0xee, 0xf1, 0x7, 0xe, 0x2, 0x2, 0xef, 0xf1, 0x7, 0xf, 0x2, 0x2, 
    0xf0, 0xea, 0x3, 0x2, 0x2, 0x2, 0xf0, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xf0, 
    0xec, 0x3, 0x2, 0x2, 0x2, 0xf0, 0xed, 0x3, 0x2, 0x2, 0x2, 0xf0, 0xee, 
    0x3, 0x2, 0x2, 0x2, 0xf0, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xf2, 0x3, 
    0x2, 0x2, 0x2, 0xf2, 0xfc, 0x5, 0x16, 0xc, 0x9, 0xf3, 0xf4, 0xc, 0x7, 
    0x2, 0x2, 0xf4, 0xf5, 0x7, 0x16, 0x2, 0x2, 0xf5, 0xfc, 0x5, 0x16, 0xc, 
    0x8, 0xf6, 0xf7, 0xc, 0x6, 0x2, 0x2, 0xf7, 0xf8, 0x7, 0x17, 0x2, 0x2, 
    0xf8, 0xfc, 0x5, 0x16, 0xc, 0x7, 0xf9, 0xfa, 0xc, 0xf, 0x2, 0x2, 0xfa, 
    0xfc, 0x7, 0x9, 0x2, 0x2, 0xfb, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xe3, 
    0x3, 0x2, 0x2, 0x2, 0xfb, 0xe9, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xf3, 0x3, 
    0x2, 0x2, 0x2, 0xfb, 0xf6, 0x3, 0x2, 0x2, 0x2, 0xfb, 0xf9, 0x3, 0x2, 
    0x2, 0x2, 0xfc, 0xff, 0x3, 0x2, 0x2, 0x2, 0xfd, 0xfb, 0x3, 0x2, 0x2, 
    0x2, 0xfd, 0xfe, 0x3, 0x2, 0x2, 0x2, 0xfe, 0x17, 0x3, 0x2, 0x2, 0x2, 
    0xff, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x100, 0x101, 0x7, 0x33, 0x2, 0x2, 0x101, 
    0x19, 0x3, 0x2, 0x2, 0x2, 0x1b, 0x1d, 0x29, 0x2c, 0x31, 0x3a, 0x43, 
    0x5c, 0x63, 0x71, 0x8d, 0x90, 0x96, 0x99, 0xa1, 0xaf, 0xb1, 0xb8, 0xd3, 
    0xd6, 0xda, 0xe0, 0xe6, 0xf0, 0xfb, 0xfd, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

AslParser::Initializer AslParser::_init;
