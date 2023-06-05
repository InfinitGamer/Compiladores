// Generated from /home/jeremy/Escritorio/Compiladores/examen/asl/Asl.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PAREOP=6, PARECL=7, CLAUOP=8, 
		CLAUCL=9, LT=10, LE=11, GT=12, GE=13, ASSIGN=14, EQUAL=15, NOTEQUAL=16, 
		NOT=17, AND=18, OR=19, PLUS=20, MINUS=21, EXP=22, MUL=23, DIV=24, MOD=25, 
		VAR=26, BASIC_TYPE=27, MAP=28, INTO=29, USING=30, INT=31, BOOL=32, CHAR=33, 
		FLOAT=34, IF=35, THEN=36, ELSE=37, ENDIF=38, WHILE=39, DO=40, ENDWHILE=41, 
		FUNC=42, RETURN=43, ENDFUNC=44, READ=45, WRITE=46, BOOLVAL=47, INTVAL=48, 
		FLOATVAL=49, CHARVAL=50, ID=51, STRING=52, COMMENT=53, WS=54;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declarations = 2, RULE_variable_decl = 3, 
		RULE_param = 4, RULE_type = 5, RULE_basic = 6, RULE_statements = 7, RULE_statement = 8, 
		RULE_left_expr = 9, RULE_expr = 10, RULE_ident = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declarations", "variable_decl", "param", "type", 
			"basic", "statements", "statement", "left_expr", "expr", "ident"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'array'", "'of'", "';'", "'('", "')'", "'['", "']'", 
			"'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'not'", "'and'", 
			"'or'", "'+'", "'-'", "'**'", "'*'", "'/'", "'%'", "'var'", null, "'map'", 
			"'into'", "'using'", "'int'", "'bool'", "'char'", "'float'", "'if'", 
			"'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", "'func'", 
			"'return'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PAREOP", "PARECL", "CLAUOP", "CLAUCL", 
			"LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", 
			"OR", "PLUS", "MINUS", "EXP", "MUL", "DIV", "MOD", "VAR", "BASIC_TYPE", 
			"MAP", "INTO", "USING", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", 
			"ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", 
			"READ", "WRITE", "BOOLVAL", "INTVAL", "FLOATVAL", "CHARVAL", "ID", "STRING", 
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				function();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
			setState(29);
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
		public BasicContext basic_type;
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
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
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
			setState(31);
			match(FUNC);
			setState(32);
			match(ID);
			setState(33);
			match(PAREOP);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(34);
				param();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(35);
					match(T__0);
					setState(36);
					param();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(44);
			match(PARECL);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(45);
				match(T__1);
				setState(46);
				((FunctionContext)_localctx).basic_type = basic();
				}
			}

			setState(49);
			declarations();
			setState(50);
			statements();
			setState(51);
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
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(53);
				variable_decl();
				}
				}
				setState(58);
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
			setState(59);
			match(VAR);
			setState(60);
			match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(61);
				match(T__0);
				setState(62);
				match(ID);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(T__1);
			setState(69);
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
			setState(71);
			match(ID);
			setState(72);
			match(T__1);
			setState(73);
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
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayTypeContext extends TypeContext {
		public BasicContext t;
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public TerminalNode INTVAL() { return getToken(AslParser.INTVAL, 0); }
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public BasicContext basic() {
			return getRuleContext(BasicContext.class,0);
		}
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_TYPE:
				_localctx = new BasicTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				basic();
				}
				break;
			case T__2:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__2);
				setState(77);
				match(CLAUOP);
				setState(78);
				match(INTVAL);
				setState(79);
				match(CLAUCL);
				setState(80);
				match(T__3);
				setState(81);
				((ArrayTypeContext)_localctx).t = basic();
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

	public static class BasicContext extends ParserRuleContext {
		public TerminalNode BASIC_TYPE() { return getToken(AslParser.BASIC_TYPE, 0); }
		public BasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic; }
	}

	public final BasicContext basic() throws RecognitionException {
		BasicContext _localctx = new BasicContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(BASIC_TYPE);
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
		enterRule(_localctx, 14, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << MAP) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(86);
				statement();
				}
				}
				setState(91);
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
	public static class MapContext extends StatementContext {
		public Left_exprContext in;
		public Left_exprContext out;
		public IdentContext func;
		public TerminalNode MAP() { return getToken(AslParser.MAP, 0); }
		public TerminalNode INTO() { return getToken(AslParser.INTO, 0); }
		public TerminalNode USING() { return getToken(AslParser.USING, 0); }
		public List<Left_exprContext> left_expr() {
			return getRuleContexts(Left_exprContext.class);
		}
		public Left_exprContext left_expr(int i) {
			return getRuleContext(Left_exprContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MapContext(StatementContext ctx) { copyFrom(ctx); }
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				left_expr(0);
				setState(93);
				match(ASSIGN);
				setState(94);
				expr(0);
				setState(95);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IF);
				setState(98);
				expr(0);
				setState(99);
				match(THEN);
				setState(100);
				statements();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(101);
					match(ELSE);
					setState(102);
					statements();
					}
				}

				setState(105);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(WHILE);
				setState(108);
				expr(0);
				setState(109);
				match(DO);
				setState(110);
				statements();
				setState(111);
				match(ENDWHILE);
				}
				break;
			case 4:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(READ);
				setState(114);
				left_expr(0);
				setState(115);
				match(T__4);
				}
				break;
			case 5:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				match(WRITE);
				setState(118);
				expr(0);
				setState(119);
				match(T__4);
				}
				break;
			case 6:
				_localctx = new MapContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				match(MAP);
				setState(122);
				((MapContext)_localctx).in = left_expr(0);
				setState(123);
				match(INTO);
				setState(124);
				((MapContext)_localctx).out = left_expr(0);
				setState(125);
				match(USING);
				setState(126);
				((MapContext)_localctx).func = ident();
				setState(127);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				match(WRITE);
				setState(130);
				match(STRING);
				setState(131);
				match(T__4);
				}
				break;
			case 8:
				_localctx = new MethodCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				match(ID);
				setState(133);
				match(PAREOP);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << FLOATVAL) | (1L << CHARVAL) | (1L << ID))) != 0)) {
					{
					setState(134);
					expr(0);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(135);
						match(T__0);
						setState(136);
						expr(0);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(144);
				match(PARECL);
				setState(145);
				match(T__4);
				}
				break;
			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				match(RETURN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << FLOATVAL) | (1L << CHARVAL) | (1L << ID))) != 0)) {
					{
					setState(147);
					expr(0);
					}
				}

				setState(150);
				match(T__4);
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
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode CLAUOP() { return getToken(AslParser.CLAUOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLAUCL() { return getToken(AslParser.CLAUCL, 0); }
		public Left_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_expr; }
	}

	public final Left_exprContext left_expr() throws RecognitionException {
		return left_expr(0);
	}

	private Left_exprContext left_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Left_exprContext _localctx = new Left_exprContext(_ctx, _parentState);
		Left_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_left_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PAREOP:
				{
				setState(154);
				match(PAREOP);
				setState(155);
				left_expr(0);
				setState(156);
				match(PARECL);
				}
				break;
			case ID:
				{
				setState(158);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Left_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_left_expr);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					match(CLAUOP);
					setState(163);
					expr(0);
					setState(164);
					match(CLAUCL);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class PotenciaContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXP() { return getToken(AslParser.EXP, 0); }
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
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
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(175);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(172);
					((UnaryContext)_localctx).op = match(MINUS);
					}
					break;
				case PLUS:
					{
					setState(173);
					((UnaryContext)_localctx).op = match(PLUS);
					}
					break;
				case NOT:
					{
					setState(174);
					((UnaryContext)_localctx).op = match(NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(177);
				expr(11);
				}
				break;
			case 2:
				{
				_localctx = new ArrayIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				left_expr(0);
				setState(179);
				match(CLAUOP);
				setState(180);
				expr(0);
				setState(181);
				match(CLAUCL);
				}
				break;
			case 3:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(PAREOP);
				setState(184);
				expr(0);
				setState(185);
				match(PARECL);
				}
				break;
			case 4:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << INTVAL) | (1L << FLOATVAL) | (1L << CHARVAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(ID);
				setState(189);
				match(PAREOP);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << FLOATVAL) | (1L << CHARVAL) | (1L << ID))) != 0)) {
					{
					setState(190);
					expr(0);
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(191);
						match(T__0);
						setState(192);
						expr(0);
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(200);
				match(PARECL);
				}
				break;
			case 6:
				{
				_localctx = new ExprIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				ident();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(205);
						((PotenciaContext)_localctx).op = match(EXP);
						setState(206);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(211);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(208);
							((ArithmeticContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(209);
							((ArithmeticContext)_localctx).op = match(DIV);
							}
							break;
						case MOD:
							{
							setState(210);
							((ArithmeticContext)_localctx).op = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(213);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(217);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(215);
							((ArithmeticContext)_localctx).op = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(216);
							((ArithmeticContext)_localctx).op = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(219);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(221);
							((RelationalContext)_localctx).op = match(EQUAL);
							}
							break;
						case NOTEQUAL:
							{
							setState(222);
							((RelationalContext)_localctx).op = match(NOTEQUAL);
							}
							break;
						case GT:
							{
							setState(223);
							((RelationalContext)_localctx).op = match(GT);
							}
							break;
						case GE:
							{
							setState(224);
							((RelationalContext)_localctx).op = match(GE);
							}
							break;
						case LT:
							{
							setState(225);
							((RelationalContext)_localctx).op = match(LT);
							}
							break;
						case LE:
							{
							setState(226);
							((RelationalContext)_localctx).op = match(LE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(229);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(231);
						((AndContext)_localctx).op = match(AND);
						}
						setState(232);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(234);
						((OrContext)_localctx).op = match(OR);
						}
						setState(235);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 22, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
			return left_expr_sempred((Left_exprContext)_localctx, predIndex);
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean left_expr_sempred(Left_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u00f6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\5\3-\n\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3"+
		"\3\3\3\3\3\3\4\7\49\n\4\f\4\16\4<\13\4\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U"+
		"\n\7\3\b\3\b\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\5\n\u0091\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0097\n\n\3\n\5\n\u009a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u00a2\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a9\n\13\f\13\16\13\u00ac"+
		"\13\13\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\5\f\u00c9"+
		"\n\f\3\f\3\f\5\f\u00cd\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d6\n\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00dc\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e6"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ef\n\f\f\f\16\f\u00f2\13\f\3\r"+
		"\3\r\3\r\2\4\24\26\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\61\64\2\u0116"+
		"\2\33\3\2\2\2\4!\3\2\2\2\6:\3\2\2\2\b=\3\2\2\2\nI\3\2\2\2\fT\3\2\2\2\16"+
		"V\3\2\2\2\20[\3\2\2\2\22\u0099\3\2\2\2\24\u00a1\3\2\2\2\26\u00cc\3\2\2"+
		"\2\30\u00f3\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7,\2\2\""+
		"#\7\65\2\2#,\7\b\2\2$)\5\n\6\2%&\7\3\2\2&(\5\n\6\2\'%\3\2\2\2(+\3\2\2"+
		"\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,$\3\2\2\2,-\3\2\2\2-.\3\2"+
		"\2\2.\61\7\t\2\2/\60\7\4\2\2\60\62\5\16\b\2\61/\3\2\2\2\61\62\3\2\2\2"+
		"\62\63\3\2\2\2\63\64\5\6\4\2\64\65\5\20\t\2\65\66\7.\2\2\66\5\3\2\2\2"+
		"\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<:\3"+
		"\2\2\2=>\7\34\2\2>C\7\65\2\2?@\7\3\2\2@B\7\65\2\2A?\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\4\2\2GH\5\f\7\2H\t\3\2\2"+
		"\2IJ\7\65\2\2JK\7\4\2\2KL\5\f\7\2L\13\3\2\2\2MU\5\16\b\2NO\7\5\2\2OP\7"+
		"\n\2\2PQ\7\62\2\2QR\7\13\2\2RS\7\6\2\2SU\5\16\b\2TM\3\2\2\2TN\3\2\2\2"+
		"U\r\3\2\2\2VW\7\35\2\2W\17\3\2\2\2XZ\5\22\n\2YX\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^_\5\24\13\2_`\7\20\2\2`a\5\26"+
		"\f\2ab\7\7\2\2b\u009a\3\2\2\2cd\7%\2\2de\5\26\f\2ef\7&\2\2fi\5\20\t\2"+
		"gh\7\'\2\2hj\5\20\t\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7(\2\2l\u009a\3"+
		"\2\2\2mn\7)\2\2no\5\26\f\2op\7*\2\2pq\5\20\t\2qr\7+\2\2r\u009a\3\2\2\2"+
		"st\7/\2\2tu\5\24\13\2uv\7\7\2\2v\u009a\3\2\2\2wx\7\60\2\2xy\5\26\f\2y"+
		"z\7\7\2\2z\u009a\3\2\2\2{|\7\36\2\2|}\5\24\13\2}~\7\37\2\2~\177\5\24\13"+
		"\2\177\u0080\7 \2\2\u0080\u0081\5\30\r\2\u0081\u0082\7\7\2\2\u0082\u009a"+
		"\3\2\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7\66\2\2\u0085\u009a\7\7\2\2"+
		"\u0086\u0087\7\65\2\2\u0087\u0090\7\b\2\2\u0088\u008d\5\26\f\2\u0089\u008a"+
		"\7\3\2\2\u008a\u008c\5\26\f\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\7\t\2\2\u0093\u009a\7\7\2\2\u0094\u0096\7-\2\2\u0095\u0097\5\26"+
		"\f\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u009a\7\7\2\2\u0099^\3\2\2\2\u0099c\3\2\2\2\u0099m\3\2\2\2\u0099s\3\2"+
		"\2\2\u0099w\3\2\2\2\u0099{\3\2\2\2\u0099\u0083\3\2\2\2\u0099\u0086\3\2"+
		"\2\2\u0099\u0094\3\2\2\2\u009a\23\3\2\2\2\u009b\u009c\b\13\1\2\u009c\u009d"+
		"\7\b\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\t\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u00a2\5\30\r\2\u00a1\u009b\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00aa"+
		"\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\n\2\2\u00a5\u00a6\5\26\f\2"+
		"\u00a6\u00a7\7\13\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\25\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b1\b\f\1\2\u00ae\u00b2\7\27\2\2\u00af\u00b2\7"+
		"\26\2\2\u00b0\u00b2\7\23\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00cd\5\26\f\r\u00b4\u00b5\5"+
		"\24\13\2\u00b5\u00b6\7\n\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7\13\2\2"+
		"\u00b8\u00cd\3\2\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\5\26\f\2\u00bb\u00bc"+
		"\7\t\2\2\u00bc\u00cd\3\2\2\2\u00bd\u00cd\t\2\2\2\u00be\u00bf\7\65\2\2"+
		"\u00bf\u00c8\7\b\2\2\u00c0\u00c5\5\26\f\2\u00c1\u00c2\7\3\2\2\u00c2\u00c4"+
		"\5\26\f\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c0"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\7\t\2\2\u00cb"+
		"\u00cd\5\30\r\2\u00cc\u00ad\3\2\2\2\u00cc\u00b4\3\2\2\2\u00cc\u00b9\3"+
		"\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00be\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00f0\3\2\2\2\u00ce\u00cf\f\16\2\2\u00cf\u00d0\7\30\2\2\u00d0\u00ef\5"+
		"\26\f\17\u00d1\u00d5\f\n\2\2\u00d2\u00d6\7\31\2\2\u00d3\u00d6\7\32\2\2"+
		"\u00d4\u00d6\7\33\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00ef\5\26\f\13\u00d8\u00db\f\t\2\2"+
		"\u00d9\u00dc\7\26\2\2\u00da\u00dc\7\27\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00ef\5\26\f\n\u00de\u00e5\f\b\2\2"+
		"\u00df\u00e6\7\21\2\2\u00e0\u00e6\7\22\2\2\u00e1\u00e6\7\16\2\2\u00e2"+
		"\u00e6\7\17\2\2\u00e3\u00e6\7\f\2\2\u00e4\u00e6\7\r\2\2\u00e5\u00df\3"+
		"\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ef\5\26"+
		"\f\t\u00e8\u00e9\f\7\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00ef\5\26\f\b\u00eb"+
		"\u00ec\f\6\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00ef\5\26\f\7\u00ee\u00ce\3"+
		"\2\2\2\u00ee\u00d1\3\2\2\2\u00ee\u00d8\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4"+
		"\7\65\2\2\u00f4\31\3\2\2\2\32\35),\61:CT[i\u008d\u0090\u0096\u0099\u00a1"+
		"\u00aa\u00b1\u00c5\u00c8\u00cc\u00d5\u00db\u00e5\u00ee\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}