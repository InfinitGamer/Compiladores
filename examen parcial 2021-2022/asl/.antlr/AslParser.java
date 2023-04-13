// Generated from /home/jeremy/Escritorio/simulacro/practica/asl/Asl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PAREOP=13, PARECL=14, CLAUOP=15, CLAUCL=16, 
		LT=17, LE=18, GT=19, GE=20, ASSIGN=21, EQUAL=22, NOTEQUAL=23, NOT=24, 
		AND=25, OR=26, PLUS=27, MINUS=28, MUL=29, DIV=30, MOD=31, VAR=32, INT=33, 
		BOOL=34, CHAR=35, FLOAT=36, IF=37, THEN=38, ELSE=39, ENDIF=40, WHILE=41, 
		DO=42, ENDWHILE=43, FUNC=44, RETURN=45, ENDFUNC=46, READ=47, WRITE=48, 
		BOOLVAL=49, INTVAL=50, CHARVAL=51, FLOATVAL=52, ID=53, STRING=54, COMMENT=55, 
		WS=56;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declarations = 2, RULE_variable_decl = 3, 
		RULE_param = 4, RULE_type = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_left_expr = 8, RULE_expr = 9, RULE_ident = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declarations", "variable_decl", "param", "type", 
			"statements", "statement", "left_expr", "expr", "ident"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'array'", "'of'", "'struct'", "'{'", "'}'", "';'", 
			"'?'", "'for'", "'in'", "'.'", "'('", "')'", "'['", "']'", "'<'", "'<='", 
			"'>'", "'>='", "'='", "'=='", "'!='", "'not'", "'and'", "'or'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'var'", "'int'", "'bool'", "'char'", "'float'", 
			"'if'", "'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", 
			"'func'", "'return'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PAREOP", "PARECL", "CLAUOP", "CLAUCL", "LT", "LE", "GT", "GE", 
			"ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", 
			"ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", 
			"WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", "ID", "STRING", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AslParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				function();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
			setState(27);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext basic_type;
		public TerminalNode FUNC() { return getToken(AslParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDFUNC() { return getToken(AslParser.ENDFUNC, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(FUNC);
			setState(30);
			match(ID);
			setState(31);
			match(PAREOP);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(32);
				param();
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(33);
					match(T__0);
					setState(34);
					param();
					}
					}
					setState(39);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(42);
			match(PARECL);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(43);
				match(T__1);
				setState(44);
				((FunctionContext)_localctx).basic_type = type();
				}
			}

			setState(47);
			declarations();
			setState(48);
			statements();
			setState(49);
			match(ENDFUNC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(51);
				variable_decl();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AslParser.VAR, 0); }
		public List<TerminalNode> ID() { return getTokens(AslParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AslParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VAR);
			setState(58);
			match(ID);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(59);
				match(T__0);
				setState(60);
				match(ID);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(T__1);
			setState(67);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__1);
			setState(71);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(AslParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(AslParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(AslParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(AslParser.CHAR, 0); }
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public TerminalNode INTVAL() { return getToken(AslParser.INTVAL, 0); }
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public TerminalNode INT() { return getToken(AslParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(AslParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(AslParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(AslParser.CHAR, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class StructTypeContext extends TypeContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case CHAR:
			case FLOAT:
				_localctx = new BasicTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__2);
				setState(75);
				match(CLAUOP);
				setState(76);
				match(INTVAL);
				setState(77);
				match(CLAUCL);
				setState(78);
				match(T__3);
				setState(79);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__4:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				match(T__4);
				setState(81);
				match(T__5);
				setState(82);
				param();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(83);
					match(T__0);
					setState(84);
					param();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(94);
				statement();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcCallContext extends StatementContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public ProcCallContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WriteExprContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(AslParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteExprContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(AslParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(AslParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(AslParser.ENDWHILE, 0); }
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(AslParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AslParser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(AslParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(AslParser.ELSE, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReadStmtContext extends StatementContext {
		public TerminalNode READ() { return getToken(AslParser.READ, 0); }
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public ReadStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class NewAssignContext extends StatementContext {
		public ExprContext cond;
		public ExprContext expr1;
		public ExprContext expr2;
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AslParser.ASSIGN, 0); }
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NewAssignContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStmtContext extends StatementContext {
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AslParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WriteStringContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(AslParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(AslParser.STRING, 0); }
		public WriteStringContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(AslParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class MethodCallContext extends StatementContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MethodCallContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				left_expr();
				setState(101);
				match(ASSIGN);
				setState(102);
				expr(0);
				setState(103);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new NewAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				left_expr();
				setState(106);
				match(ASSIGN);
				setState(107);
				match(CLAUOP);
				setState(108);
				((NewAssignContext)_localctx).cond = expr(0);
				setState(109);
				match(T__8);
				setState(110);
				((NewAssignContext)_localctx).expr1 = expr(0);
				setState(111);
				match(T__1);
				setState(112);
				((NewAssignContext)_localctx).expr2 = expr(0);
				setState(113);
				match(T__9);
				setState(114);
				ident();
				setState(115);
				match(T__10);
				setState(116);
				ident();
				setState(117);
				match(CLAUCL);
				setState(118);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(IF);
				setState(121);
				expr(0);
				setState(122);
				match(THEN);
				setState(123);
				statements();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(124);
					match(ELSE);
					setState(125);
					statements();
					}
				}

				setState(128);
				match(ENDIF);
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(WHILE);
				setState(131);
				expr(0);
				setState(132);
				match(DO);
				setState(133);
				statements();
				setState(134);
				match(ENDWHILE);
				}
				break;
			case 5:
				_localctx = new ProcCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				ident();
				setState(137);
				match(PAREOP);
				setState(138);
				match(PARECL);
				setState(139);
				match(T__7);
				}
				break;
			case 6:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(READ);
				setState(142);
				left_expr();
				setState(143);
				match(T__7);
				}
				break;
			case 7:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(WRITE);
				setState(146);
				expr(0);
				setState(147);
				match(T__7);
				}
				break;
			case 8:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				match(WRITE);
				setState(150);
				match(STRING);
				setState(151);
				match(T__7);
				}
				break;
			case 9:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(152);
				match(ID);
				setState(153);
				match(PAREOP);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL) | (1L << ID))) != 0)) {
					{
					setState(154);
					expr(0);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(155);
						match(T__0);
						setState(156);
						expr(0);
						}
						}
						setState(161);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(164);
				match(PARECL);
				setState(165);
				match(T__7);
				}
				break;
			case 10:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(166);
				match(RETURN);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL) | (1L << ID))) != 0)) {
					{
					setState(167);
					expr(0);
					}
				}

				setState(170);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_exprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public Left_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_expr; }
	}

	public final Left_exprContext left_expr() throws RecognitionException {
		Left_exprContext _localctx = new Left_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_left_expr);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(173);
					ident();
					setState(174);
					match(CLAUOP);
					setState(175);
					expr(0);
					setState(176);
					match(CLAUCL);
					}
					break;
				case 2:
					{
					setState(178);
					ident();
					setState(179);
					match(T__11);
					setState(180);
					match(ID);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				ident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(AslParser.OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class StructAccessContext extends ExprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public StructAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(AslParser.AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdentContext extends ExprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprIdentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AslParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AslParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AslParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(AslParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AslParser.MINUS, 0); }
		public ArithmeticContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AslParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(AslParser.NOTEQUAL, 0); }
		public TerminalNode GT() { return getToken(AslParser.GT, 0); }
		public TerminalNode GE() { return getToken(AslParser.GE, 0); }
		public TerminalNode LT() { return getToken(AslParser.LT, 0); }
		public TerminalNode LE() { return getToken(AslParser.LE, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AslParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(AslParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(AslParser.NOT, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayIndexContext extends ExprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public ArrayIndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ValueContext extends ExprContext {
		public TerminalNode INTVAL() { return getToken(AslParser.INTVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(AslParser.BOOLVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(AslParser.FLOATVAL, 0); }
		public TerminalNode CHARVAL() { return getToken(AslParser.CHARVAL, 0); }
		public ValueContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(188);
					((UnaryContext)_localctx).op = match(MINUS);
					}
					break;
				case PLUS:
					{
					setState(189);
					((UnaryContext)_localctx).op = match(PLUS);
					}
					break;
				case NOT:
					{
					setState(190);
					((UnaryContext)_localctx).op = match(NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
				expr(12);
				}
				break;
			case 2:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				ident();
				setState(195);
				match(CLAUOP);
				setState(196);
				expr(0);
				setState(197);
				match(CLAUCL);
				}
				break;
			case 3:
				{
				_localctx = new StructAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				ident();
				setState(200);
				match(T__11);
				setState(201);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(PAREOP);
				setState(204);
				expr(0);
				setState(205);
				match(PARECL);
				}
				break;
			case 5:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				_localctx = new ExprIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				ident();
				}
				break;
			case 7:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(ID);
				setState(210);
				match(PAREOP);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL) | (1L << ID))) != 0)) {
					{
					setState(211);
					expr(0);
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(212);
						match(T__0);
						setState(213);
						expr(0);
						}
						}
						setState(218);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(221);
				match(PARECL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(228);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(225);
							((ArithmeticContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(226);
							((ArithmeticContext)_localctx).op = match(DIV);
							}
							break;
						case MOD:
							{
							setState(227);
							((ArithmeticContext)_localctx).op = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(230);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(232);
							((ArithmeticContext)_localctx).op = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(233);
							((ArithmeticContext)_localctx).op = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(236);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(237);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(238);
							((RelationalContext)_localctx).op = match(EQUAL);
							}
							break;
						case NOTEQUAL:
							{
							setState(239);
							((RelationalContext)_localctx).op = match(NOTEQUAL);
							}
							break;
						case GT:
							{
							setState(240);
							((RelationalContext)_localctx).op = match(GT);
							}
							break;
						case GE:
							{
							setState(241);
							((RelationalContext)_localctx).op = match(GE);
							}
							break;
						case LT:
							{
							setState(242);
							((RelationalContext)_localctx).op = match(LT);
							}
							break;
						case LE:
							{
							setState(243);
							((RelationalContext)_localctx).op = match(LE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(246);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(248);
						((AndContext)_localctx).op = match(AND);
						}
						setState(249);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(250);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(251);
						((OrContext)_localctx).op = match(OR);
						}
						setState(252);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0107\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3&\n\3\f\3\16\3)\13\3\5\3+\n\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3\3\3"+
		"\3\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\5\7_\n\7\3\b\7\bb\n\b\f\b\16"+
		"\be\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3\13\t\5\t"+
		"\u00a5\n\t\3\t\3\t\3\t\3\t\5\t\u00ab\n\t\3\t\5\t\u00ae\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b9\n\n\3\n\5\n\u00bc\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00c2\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d9\n\13"+
		"\f\13\16\13\u00dc\13\13\5\13\u00de\n\13\3\13\5\13\u00e1\n\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00e7\n\13\3\13\3\13\3\13\3\13\5\13\u00ed\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f7\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0100\n\13\f\13\16\13\u0103\13\13\3\f\3\f\3\f\2\3"+
		"\24\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2#&\3\2\63\66\2\u012b\2\31\3\2"+
		"\2\2\4\37\3\2\2\2\68\3\2\2\2\b;\3\2\2\2\nG\3\2\2\2\f^\3\2\2\2\16c\3\2"+
		"\2\2\20\u00ad\3\2\2\2\22\u00bb\3\2\2\2\24\u00e0\3\2\2\2\26\u0104\3\2\2"+
		"\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2"+
		"\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7.\2\2 !\7\67\2\2!*\7"+
		"\17\2\2\"\'\5\n\6\2#$\7\3\2\2$&\5\n\6\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*\"\3\2\2\2*+\3\2\2\2+,\3\2\2\2,/\7\20"+
		"\2\2-.\7\4\2\2.\60\5\f\7\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\5"+
		"\6\4\2\62\63\5\16\b\2\63\64\7\60\2\2\64\5\3\2\2\2\65\67\5\b\5\2\66\65"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;<\7\""+
		"\2\2<A\7\67\2\2=>\7\3\2\2>@\7\67\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\4\2\2EF\5\f\7\2F\t\3\2\2\2GH\7\67\2\2H"+
		"I\7\4\2\2IJ\5\f\7\2J\13\3\2\2\2K_\t\2\2\2LM\7\5\2\2MN\7\21\2\2NO\7\64"+
		"\2\2OP\7\22\2\2PQ\7\6\2\2Q_\t\2\2\2RS\7\7\2\2ST\7\b\2\2TY\5\n\6\2UV\7"+
		"\3\2\2VX\5\n\6\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y"+
		"\3\2\2\2\\]\7\t\2\2]_\3\2\2\2^K\3\2\2\2^L\3\2\2\2^R\3\2\2\2_\r\3\2\2\2"+
		"`b\5\20\t\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\17\3\2\2\2ec\3\2"+
		"\2\2fg\5\22\n\2gh\7\27\2\2hi\5\24\13\2ij\7\n\2\2j\u00ae\3\2\2\2kl\5\22"+
		"\n\2lm\7\27\2\2mn\7\21\2\2no\5\24\13\2op\7\13\2\2pq\5\24\13\2qr\7\4\2"+
		"\2rs\5\24\13\2st\7\f\2\2tu\5\26\f\2uv\7\r\2\2vw\5\26\f\2wx\7\22\2\2xy"+
		"\7\n\2\2y\u00ae\3\2\2\2z{\7\'\2\2{|\5\24\13\2|}\7(\2\2}\u0080\5\16\b\2"+
		"~\177\7)\2\2\177\u0081\5\16\b\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7*\2\2\u0083\u00ae\3\2\2\2\u0084\u0085\7+\2"+
		"\2\u0085\u0086\5\24\13\2\u0086\u0087\7,\2\2\u0087\u0088\5\16\b\2\u0088"+
		"\u0089\7-\2\2\u0089\u00ae\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\17"+
		"\2\2\u008c\u008d\7\20\2\2\u008d\u008e\7\n\2\2\u008e\u00ae\3\2\2\2\u008f"+
		"\u0090\7\61\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\n\2\2\u0092\u00ae\3"+
		"\2\2\2\u0093\u0094\7\62\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7\n\2\2"+
		"\u0096\u00ae\3\2\2\2\u0097\u0098\7\62\2\2\u0098\u0099\78\2\2\u0099\u00ae"+
		"\7\n\2\2\u009a\u009b\7\67\2\2\u009b\u00a4\7\17\2\2\u009c\u00a1\5\24\13"+
		"\2\u009d\u009e\7\3\2\2\u009e\u00a0\5\24\13\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u009c\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00ae\7\n\2\2\u00a8\u00aa\7"+
		"/\2\2\u00a9\u00ab\5\24\13\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\7\n\2\2\u00adf\3\2\2\2\u00adk\3\2\2\2\u00ad"+
		"z\3\2\2\2\u00ad\u0084\3\2\2\2\u00ad\u008a\3\2\2\2\u00ad\u008f\3\2\2\2"+
		"\u00ad\u0093\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u009a\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\21\2\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b3\7\22\2\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5"+
		"\5\26\f\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\7\67\2\2\u00b7\u00b9\3\2\2"+
		"\2\u00b8\u00af\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc"+
		"\5\26\f\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\23\3\2\2\2\u00bd"+
		"\u00c1\b\13\1\2\u00be\u00c2\7\36\2\2\u00bf\u00c2\7\35\2\2\u00c0\u00c2"+
		"\7\32\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c3\u00e1\5\24\13\16\u00c4\u00c5\5\26\f\2\u00c5"+
		"\u00c6\7\21\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\22\2\2\u00c8\u00e1"+
		"\3\2\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\16\2\2\u00cb\u00cc\7\67\2"+
		"\2\u00cc\u00e1\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\5\24\13\2\u00cf"+
		"\u00d0\7\20\2\2\u00d0\u00e1\3\2\2\2\u00d1\u00e1\t\3\2\2\u00d2\u00e1\5"+
		"\26\f\2\u00d3\u00d4\7\67\2\2\u00d4\u00dd\7\17\2\2\u00d5\u00da\5\24\13"+
		"\2\u00d6\u00d7\7\3\2\2\u00d7\u00d9\5\24\13\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e1\7\20\2\2\u00e0\u00bd\3\2\2\2\u00e0\u00c4\3"+
		"\2\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00cd\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0"+
		"\u00d2\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e1\u0101\3\2\2\2\u00e2\u00e6\f\n"+
		"\2\2\u00e3\u00e7\7\37\2\2\u00e4\u00e7\7 \2\2\u00e5\u00e7\7!\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u0100\5\24\13\13\u00e9\u00ec\f\t\2\2\u00ea\u00ed\7\35\2\2\u00eb"+
		"\u00ed\7\36\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u0100\5\24\13\n\u00ef\u00f6\f\b\2\2\u00f0\u00f7\7\30\2\2"+
		"\u00f1\u00f7\7\31\2\2\u00f2\u00f7\7\25\2\2\u00f3\u00f7\7\26\2\2\u00f4"+
		"\u00f7\7\23\2\2\u00f5\u00f7\7\24\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3"+
		"\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0100\5\24\13\t\u00f9\u00fa\f"+
		"\7\2\2\u00fa\u00fb\7\33\2\2\u00fb\u0100\5\24\13\b\u00fc\u00fd\f\6\2\2"+
		"\u00fd\u00fe\7\34\2\2\u00fe\u0100\5\24\13\7\u00ff\u00e2\3\2\2\2\u00ff"+
		"\u00e9\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f9\3\2\2\2\u00ff\u00fc\3\2"+
		"\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\25\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\7\67\2\2\u0105\27\3\2\2\2"+
		"\33\33\'*/8AY^c\u0080\u00a1\u00a4\u00aa\u00ad\u00b8\u00bb\u00c1\u00da"+
		"\u00dd\u00e0\u00e6\u00ec\u00f6\u00ff\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}