// Generated from /home/jeremy/Escritorio/simulacro/practica/asl/Asl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "PAREOP", "PARECL", "CLAUOP", "CLAUCL", "LT", 
			"LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", "OR", 
			"PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "INT", "BOOL", "CHAR", "FLOAT", 
			"IF", "THEN", "ELSE", "ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", 
			"ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
			"ID", "STRING", "ESC_SEQ", "COMMENT", "WS"
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


	public AslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)"+
		"\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u012f\n\62\3\63\6\63\u0132\n\63\r\63\16\63\u0133"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u013e\n\64\3\64\3\64\3\65"+
		"\6\65\u0143\n\65\r\65\16\65\u0144\3\65\3\65\6\65\u0149\n\65\r\65\16\65"+
		"\u014a\3\66\3\66\7\66\u014f\n\66\f\66\16\66\u0152\13\66\3\67\3\67\3\67"+
		"\7\67\u0157\n\67\f\67\16\67\u015a\13\67\3\67\3\67\38\38\38\39\39\39\3"+
		"9\79\u0165\n9\f9\169\u0168\139\39\59\u016b\n9\39\39\39\39\3:\6:\u0172"+
		"\n:\r:\16:\u0173\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\66k\67m8o\2q9s:\3\2\b\4\2C\\c|\6\2\62;C\\aac|\4\2$$^"+
		"^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0182\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t\177\3\2\2\2\13\u0082"+
		"\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u008f\3"+
		"\2\2\2\25\u0091\3\2\2\2\27\u0095\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3\2"+
		"\2\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%"+
		"\u00a4\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00ae\3"+
		"\2\2\2/\u00b1\3\2\2\2\61\u00b4\3\2\2\2\63\u00b8\3\2\2\2\65\u00bc\3\2\2"+
		"\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c3\3\2\2\2=\u00c5\3\2\2\2?\u00c7"+
		"\3\2\2\2A\u00c9\3\2\2\2C\u00cd\3\2\2\2E\u00d1\3\2\2\2G\u00d6\3\2\2\2I"+
		"\u00db\3\2\2\2K\u00e1\3\2\2\2M\u00e4\3\2\2\2O\u00e9\3\2\2\2Q\u00ee\3\2"+
		"\2\2S\u00f4\3\2\2\2U\u00fa\3\2\2\2W\u00fd\3\2\2\2Y\u0106\3\2\2\2[\u010b"+
		"\3\2\2\2]\u0112\3\2\2\2_\u011a\3\2\2\2a\u011f\3\2\2\2c\u012e\3\2\2\2e"+
		"\u0131\3\2\2\2g\u0135\3\2\2\2i\u0142\3\2\2\2k\u014c\3\2\2\2m\u0153\3\2"+
		"\2\2o\u015d\3\2\2\2q\u0160\3\2\2\2s\u0171\3\2\2\2uv\7.\2\2v\4\3\2\2\2"+
		"wx\7<\2\2x\6\3\2\2\2yz\7c\2\2z{\7t\2\2{|\7t\2\2|}\7c\2\2}~\7{\2\2~\b\3"+
		"\2\2\2\177\u0080\7q\2\2\u0080\u0081\7h\2\2\u0081\n\3\2\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7e\2\2\u0087\u0088\7v\2\2\u0088\f\3\2\2\2\u0089\u008a\7}\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7\177\2\2\u008c\20\3\2\2\2\u008d\u008e\7=\2\2"+
		"\u008e\22\3\2\2\2\u008f\u0090\7A\2\2\u0090\24\3\2\2\2\u0091\u0092\7h\2"+
		"\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\26\3\2\2\2\u0095\u0096"+
		"\7k\2\2\u0096\u0097\7p\2\2\u0097\30\3\2\2\2\u0098\u0099\7\60\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\7*\2\2\u009b\34\3\2\2\2\u009c\u009d\7+\2\2\u009d"+
		"\36\3\2\2\2\u009e\u009f\7]\2\2\u009f \3\2\2\2\u00a0\u00a1\7_\2\2\u00a1"+
		"\"\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8(\3\2\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa\u00ab\7?\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7?\2\2\u00ad,\3"+
		"\2\2\2\u00ae\u00af\7?\2\2\u00af\u00b0\7?\2\2\u00b0.\3\2\2\2\u00b1\u00b2"+
		"\7#\2\2\u00b2\u00b3\7?\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7v\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba"+
		"\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be"+
		"\7t\2\2\u00be\66\3\2\2\2\u00bf\u00c0\7-\2\2\u00c08\3\2\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7"+
		"\61\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8@\3\2\2\2\u00c9\u00ca"+
		"\7x\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7t\2\2\u00ccB\3\2\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0D\3\2\2\2\u00d1\u00d2"+
		"\7d\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"F\3\2\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9\7c\2\2\u00d9"+
		"\u00da\7t\2\2\u00daH\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		"\u00de\7q\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7v\2\2\u00e0J\3\2\2\2\u00e1"+
		"\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3L\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7j\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7p\2\2\u00e8N\3\2\2\2\u00e9"+
		"\u00ea\7g\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2"+
		"\u00edP\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7f\2"+
		"\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7"+
		"y\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9"+
		"\7g\2\2\u00f9T\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fcV\3"+
		"\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100"+
		"\u0101\7y\2\2\u0101\u0102\7j\2\2\u0102\u0103\7k\2\2\u0103\u0104\7n\2\2"+
		"\u0104\u0105\7g\2\2\u0105X\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7w\2"+
		"\2\u0108\u0109\7p\2\2\u0109\u010a\7e\2\2\u010aZ\3\2\2\2\u010b\u010c\7"+
		"t\2\2\u010c\u010d\7g\2\2\u010d\u010e\7v\2\2\u010e\u010f\7w\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7p\2\2\u0111\\\3\2\2\2\u0112\u0113\7g\2\2\u0113\u0114"+
		"\7p\2\2\u0114\u0115\7f\2\2\u0115\u0116\7h\2\2\u0116\u0117\7w\2\2\u0117"+
		"\u0118\7p\2\2\u0118\u0119\7e\2\2\u0119^\3\2\2\2\u011a\u011b\7t\2\2\u011b"+
		"\u011c\7g\2\2\u011c\u011d\7c\2\2\u011d\u011e\7f\2\2\u011e`\3\2\2\2\u011f"+
		"\u0120\7y\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2\u0122\u0123\7v\2\2"+
		"\u0123\u0124\7g\2\2\u0124b\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2"+
		"\2\u0127\u0128\7w\2\2\u0128\u012f\7g\2\2\u0129\u012a\7h\2\2\u012a\u012b"+
		"\7c\2\2\u012b\u012c\7n\2\2\u012c\u012d\7u\2\2\u012d\u012f\7g\2\2\u012e"+
		"\u0125\3\2\2\2\u012e\u0129\3\2\2\2\u012fd\3\2\2\2\u0130\u0132\4\62;\2"+
		"\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134f\3\2\2\2\u0135\u013d\7)\2\2\u0136\u013e\13\2\2\2\u0137"+
		"\u0138\7^\2\2\u0138\u013e\7p\2\2\u0139\u013a\7^\2\2\u013a\u013e\7v\2\2"+
		"\u013b\u013c\7^\2\2\u013c\u013e\7)\2\2\u013d\u0136\3\2\2\2\u013d\u0137"+
		"\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7)\2\2\u0140h\3\2\2\2\u0141\u0143\4\62;\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\7\60\2\2\u0147\u0149\4\62;\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bj\3\2\2\2"+
		"\u014c\u0150\t\2\2\2\u014d\u014f\t\3\2\2\u014e\u014d\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151l\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0158\7$\2\2\u0154\u0157\5o8\2\u0155\u0157\n\4\2"+
		"\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\7$\2\2\u015cn\3\2\2\2\u015d\u015e\7^\2\2\u015e\u015f\t\5\2\2\u015f"+
		"p\3\2\2\2\u0160\u0161\7\61\2\2\u0161\u0162\7\61\2\2\u0162\u0166\3\2\2"+
		"\2\u0163\u0165\n\6\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\7\17\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016c\u016d\7\f\2\2\u016d\u016e\3\2\2\2\u016e\u016f\b9\2\2\u016f"+
		"r\3\2\2\2\u0170\u0172\t\7\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2"+
		"\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176"+
		"\b:\2\2\u0176t\3\2\2\2\16\2\u012e\u0133\u013d\u0144\u014a\u0150\u0156"+
		"\u0158\u0166\u016a\u0173\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}