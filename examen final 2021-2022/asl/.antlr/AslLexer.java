// Generated from /home/jeremy/Escritorio/Compiladores/examen/asl/Asl.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, EXCL=7, PAREOP=8, PARECL=9, 
		CLAUOP=10, CLAUCL=11, LT=12, LE=13, GT=14, GE=15, ASSIGN=16, EQUAL=17, 
		NOTEQUAL=18, NOT=19, AND=20, OR=21, PLUS=22, MINUS=23, MUL=24, DIV=25, 
		MOD=26, VAR=27, BASIC_TYPE=28, INT=29, BOOL=30, CHAR=31, FLOAT=32, IF=33, 
		THEN=34, ELSE=35, ENDIF=36, WHILE=37, DO=38, ENDWHILE=39, FUNC=40, RETURN=41, 
		ENDFUNC=42, READ=43, WRITE=44, BOOLVAL=45, INTVAL=46, FLOATVAL=47, CHARVAL=48, 
		ID=49, STRING=50, COMMENT=51, WS=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "EXCL", "PAREOP", "PARECL", 
			"CLAUOP", "CLAUCL", "LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", 
			"NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "BASIC_TYPE", 
			"INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", "WHILE", 
			"DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", "BOOLVAL", 
			"INTVAL", "FLOATVAL", "CHARVAL", "ID", "STRING", "ESC_SEQ", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'matrix'", "'of'", "'array'", "';'", "'!'", "'('", 
			"')'", "'['", "']'", "'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", 
			"'not'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'var'", 
			null, "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", "'else'", 
			"'endif'", "'while'", "'do'", "'endwhile'", "'func'", "'return'", "'endfunc'", 
			"'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "EXCL", "PAREOP", "PARECL", 
			"CLAUOP", "CLAUCL", "LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", 
			"NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "BASIC_TYPE", 
			"INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", "WHILE", 
			"DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", "BOOLVAL", 
			"INTVAL", "FLOATVAL", "CHARVAL", "ID", "STRING", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u00bd\n\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0120\n.\3/\6/\u0123\n/\r/\16/\u0124\3\60"+
		"\6\60\u0128\n\60\r\60\16\60\u0129\3\60\3\60\6\60\u012e\n\60\r\60\16\60"+
		"\u012f\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u013a\n\61\3\61\3"+
		"\61\3\62\3\62\7\62\u0140\n\62\f\62\16\62\u0143\13\62\3\63\3\63\3\63\7"+
		"\63\u0148\n\63\f\63\16\63\u014b\13\63\3\63\3\63\3\64\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\7\65\u0156\n\65\f\65\16\65\u0159\13\65\3\65\5\65\u015c\n"+
		"\65\3\65\3\65\3\65\3\65\3\66\6\66\u0163\n\66\r\66\16\66\u0164\3\66\3\66"+
		"\2\2\67\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\65"+
		"k\66\3\2\b\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\2\u0176\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tx\3\2\2\2\13{\3\2\2\2"+
		"\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2\2\2\25"+
		"\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0092"+
		"\3\2\2\2\37\u0094\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009c\3\2\2\2"+
		"\'\u009f\3\2\2\2)\u00a3\3\2\2\2+\u00a7\3\2\2\2-\u00aa\3\2\2\2/\u00ac\3"+
		"\2\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00b2\3\2\2\2\67\u00b4\3\2"+
		"\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c2\3\2\2\2?\u00c7\3\2\2\2A\u00cc"+
		"\3\2\2\2C\u00d2\3\2\2\2E\u00d5\3\2\2\2G\u00da\3\2\2\2I\u00df\3\2\2\2K"+
		"\u00e5\3\2\2\2M\u00eb\3\2\2\2O\u00ee\3\2\2\2Q\u00f7\3\2\2\2S\u00fc\3\2"+
		"\2\2U\u0103\3\2\2\2W\u010b\3\2\2\2Y\u0110\3\2\2\2[\u011f\3\2\2\2]\u0122"+
		"\3\2\2\2_\u0127\3\2\2\2a\u0131\3\2\2\2c\u013d\3\2\2\2e\u0144\3\2\2\2g"+
		"\u014e\3\2\2\2i\u0151\3\2\2\2k\u0162\3\2\2\2mn\7.\2\2n\4\3\2\2\2op\7<"+
		"\2\2p\6\3\2\2\2qr\7o\2\2rs\7c\2\2st\7v\2\2tu\7t\2\2uv\7k\2\2vw\7z\2\2"+
		"w\b\3\2\2\2xy\7q\2\2yz\7h\2\2z\n\3\2\2\2{|\7c\2\2|}\7t\2\2}~\7t\2\2~\177"+
		"\7c\2\2\177\u0080\7{\2\2\u0080\f\3\2\2\2\u0081\u0082\7=\2\2\u0082\16\3"+
		"\2\2\2\u0083\u0084\7#\2\2\u0084\20\3\2\2\2\u0085\u0086\7*\2\2\u0086\22"+
		"\3\2\2\2\u0087\u0088\7+\2\2\u0088\24\3\2\2\2\u0089\u008a\7]\2\2\u008a"+
		"\26\3\2\2\2\u008b\u008c\7_\2\2\u008c\30\3\2\2\2\u008d\u008e\7>\2\2\u008e"+
		"\32\3\2\2\2\u008f\u0090\7>\2\2\u0090\u0091\7?\2\2\u0091\34\3\2\2\2\u0092"+
		"\u0093\7@\2\2\u0093\36\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096"+
		" \3\2\2\2\u0097\u0098\7?\2\2\u0098\"\3\2\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u009b\7?\2\2\u009b$\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e\7?\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7v\2\2\u00a2"+
		"(\3\2\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7f\2\2\u00a6"+
		"*\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7t\2\2\u00a9,\3\2\2\2\u00aa\u00ab"+
		"\7-\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\60\3\2\2\2\u00ae\u00af"+
		"\7,\2\2\u00af\62\3\2\2\2\u00b0\u00b1\7\61\2\2\u00b1\64\3\2\2\2\u00b2\u00b3"+
		"\7\'\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7x\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7t\2\2\u00b78\3\2\2\2\u00b8\u00bd\5;\36\2\u00b9\u00bd\5=\37\2\u00ba"+
		"\u00bd\5? \2\u00bb\u00bd\5A!\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd:\3\2\2\2\u00be\u00bf\7"+
		"k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7v\2\2\u00c1<\3\2\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		">\3\2\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb@\3\2\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7n\2\2\u00ce"+
		"\u00cf\7q\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7v\2\2\u00d1B\3\2\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7v\2\2\u00d6"+
		"\u00d7\7j\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7p\2\2\u00d9F\3\2\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2"+
		"\u00deH\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2"+
		"\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7h\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7"+
		"y\2\2\u00e6\u00e7\7j\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea"+
		"\7g\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7q\2\2\u00edN\3"+
		"\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7f\2\2\u00f1"+
		"\u00f2\7y\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7n\2\2"+
		"\u00f5\u00f6\7g\2\2\u00f6P\3\2\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7w\2"+
		"\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7e\2\2\u00fbR\3\2\2\2\u00fc\u00fd\7"+
		"t\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7w\2\2\u0100\u0101"+
		"\7t\2\2\u0101\u0102\7p\2\2\u0102T\3\2\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7f\2\2\u0106\u0107\7h\2\2\u0107\u0108\7w\2\2\u0108"+
		"\u0109\7p\2\2\u0109\u010a\7e\2\2\u010aV\3\2\2\2\u010b\u010c\7t\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7c\2\2\u010e\u010f\7f\2\2\u010fX\3\2\2\2\u0110"+
		"\u0111\7y\2\2\u0111\u0112\7t\2\2\u0112\u0113\7k\2\2\u0113\u0114\7v\2\2"+
		"\u0114\u0115\7g\2\2\u0115Z\3\2\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2"+
		"\2\u0118\u0119\7w\2\2\u0119\u0120\7g\2\2\u011a\u011b\7h\2\2\u011b\u011c"+
		"\7c\2\2\u011c\u011d\7n\2\2\u011d\u011e\7u\2\2\u011e\u0120\7g\2\2\u011f"+
		"\u0116\3\2\2\2\u011f\u011a\3\2\2\2\u0120\\\3\2\2\2\u0121\u0123\4\62;\2"+
		"\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125^\3\2\2\2\u0126\u0128\4\62;\2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\7\60\2\2\u012c\u012e\4\62;\2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130`\3\2\2\2"+
		"\u0131\u0139\7)\2\2\u0132\u013a\13\2\2\2\u0133\u0134\7^\2\2\u0134\u013a"+
		"\7p\2\2\u0135\u0136\7^\2\2\u0136\u013a\7v\2\2\u0137\u0138\7^\2\2\u0138"+
		"\u013a\7)\2\2\u0139\u0132\3\2\2\2\u0139\u0133\3\2\2\2\u0139\u0135\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7)\2\2\u013c"+
		"b\3\2\2\2\u013d\u0141\t\2\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142d\3"+
		"\2\2\2\u0143\u0141\3\2\2\2\u0144\u0149\7$\2\2\u0145\u0148\5g\64\2\u0146"+
		"\u0148\n\4\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\7$\2\2\u014df\3\2\2\2\u014e\u014f\7^\2\2\u014f"+
		"\u0150\t\5\2\2\u0150h\3\2\2\2\u0151\u0152\7\61\2\2\u0152\u0153\7\61\2"+
		"\2\u0153\u0157\3\2\2\2\u0154\u0156\n\6\2\2\u0155\u0154\3\2\2\2\u0156\u0159"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\7\17\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3"+
		"\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\f\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\b\65\2\2\u0160j\3\2\2\2\u0161\u0163\t\7\2\2\u0162\u0161\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\b\66\2\2\u0167l\3\2\2\2\17\2\u00bc\u011f\u0124\u0129"+
		"\u012f\u0139\u0141\u0147\u0149\u0157\u015b\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}