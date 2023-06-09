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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PAREOP=6, PARECL=7, CLAUOP=8, 
		CLAUCL=9, LT=10, LE=11, GT=12, GE=13, ASSIGN=14, EQUAL=15, NOTEQUAL=16, 
		NOT=17, AND=18, OR=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, VAR=25, 
		MAX=26, BASIC_TYPE=27, INT=28, BOOL=29, CHAR=30, FLOAT=31, IF=32, THEN=33, 
		ELSE=34, ENDIF=35, WHILE=36, DO=37, ENDWHILE=38, FUNC=39, RETURN=40, ENDFUNC=41, 
		READ=42, WRITE=43, BOOLVAL=44, INTVAL=45, FLOATVAL=46, CHARVAL=47, ID=48, 
		STRING=49, COMMENT=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "PAREOP", "PARECL", "CLAUOP", 
			"CLAUCL", "LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", 
			"AND", "OR", "PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "MAX", "BASIC_TYPE", 
			"INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", "WHILE", 
			"DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", "BOOLVAL", 
			"INTVAL", "FLOATVAL", "CHARVAL", "ID", "STRING", "ESC_SEQ", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "'array'", "'of'", "';'", "'('", "')'", "'['", "']'", 
			"'<'", "'<='", "'>'", "'>='", "'='", "'=='", "'!='", "'not'", "'and'", 
			"'or'", "'+'", "'-'", "'*'", "'/'", "'%'", "'var'", "'.max'", null, "'int'", 
			"'bool'", "'char'", "'float'", "'if'", "'then'", "'else'", "'endif'", 
			"'while'", "'do'", "'endwhile'", "'func'", "'return'", "'endfunc'", "'read'", 
			"'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "PAREOP", "PARECL", "CLAUOP", "CLAUCL", 
			"LT", "LE", "GT", "GE", "ASSIGN", "EQUAL", "NOTEQUAL", "NOT", "AND", 
			"OR", "PLUS", "MINUS", "MUL", "DIV", "MOD", "VAR", "MAX", "BASIC_TYPE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0162\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\5\34\u00b7\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u011a\n-\3.\6.\u011d\n.\r.\16.\u011e\3/\6/\u0122\n"+
		"/\r/\16/\u0123\3/\3/\6/\u0128\n/\r/\16/\u0129\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0134\n\60\3\60\3\60\3\61\3\61\7\61\u013a\n\61\f"+
		"\61\16\61\u013d\13\61\3\62\3\62\3\62\7\62\u0142\n\62\f\62\16\62\u0145"+
		"\13\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0150\n\64\f"+
		"\64\16\64\u0153\13\64\3\64\5\64\u0156\n\64\3\64\3\64\3\64\3\64\3\65\6"+
		"\65\u015d\n\65\r\65\16\65\u015e\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\64i\65\3\2\b\4\2C\\c|\6\2\62;C\\aac"+
		"|\4\2$$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0170"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2"+
		"\2\tu\3\2\2\2\13x\3\2\2\2\rz\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0080"+
		"\3\2\2\2\25\u0082\3\2\2\2\27\u0084\3\2\2\2\31\u0087\3\2\2\2\33\u0089\3"+
		"\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0091\3\2\2\2#\u0094\3\2\2\2"+
		"%\u0098\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3"+
		"\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2\2\65\u00ad\3\2\2"+
		"\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00bc\3\2\2\2=\u00c1\3\2\2\2?\u00c6"+
		"\3\2\2\2A\u00cc\3\2\2\2C\u00cf\3\2\2\2E\u00d4\3\2\2\2G\u00d9\3\2\2\2I"+
		"\u00df\3\2\2\2K\u00e5\3\2\2\2M\u00e8\3\2\2\2O\u00f1\3\2\2\2Q\u00f6\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0105\3\2\2\2W\u010a\3\2\2\2Y\u0119\3\2\2\2[\u011c"+
		"\3\2\2\2]\u0121\3\2\2\2_\u012b\3\2\2\2a\u0137\3\2\2\2c\u013e\3\2\2\2e"+
		"\u0148\3\2\2\2g\u014b\3\2\2\2i\u015c\3\2\2\2kl\7.\2\2l\4\3\2\2\2mn\7<"+
		"\2\2n\6\3\2\2\2op\7c\2\2pq\7t\2\2qr\7t\2\2rs\7c\2\2st\7{\2\2t\b\3\2\2"+
		"\2uv\7q\2\2vw\7h\2\2w\n\3\2\2\2xy\7=\2\2y\f\3\2\2\2z{\7*\2\2{\16\3\2\2"+
		"\2|}\7+\2\2}\20\3\2\2\2~\177\7]\2\2\177\22\3\2\2\2\u0080\u0081\7_\2\2"+
		"\u0081\24\3\2\2\2\u0082\u0083\7>\2\2\u0083\26\3\2\2\2\u0084\u0085\7>\2"+
		"\2\u0085\u0086\7?\2\2\u0086\30\3\2\2\2\u0087\u0088\7@\2\2\u0088\32\3\2"+
		"\2\2\u0089\u008a\7@\2\2\u008a\u008b\7?\2\2\u008b\34\3\2\2\2\u008c\u008d"+
		"\7?\2\2\u008d\36\3\2\2\2\u008e\u008f\7?\2\2\u008f\u0090\7?\2\2\u0090 "+
		"\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\"\3\2\2\2\u0094\u0095"+
		"\7p\2\2\u0095\u0096\7q\2\2\u0096\u0097\7v\2\2\u0097$\3\2\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7p\2\2\u009a\u009b\7f\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7t\2\2\u009e(\3\2\2\2\u009f\u00a0\7-\2\2\u00a0*\3"+
		"\2\2\2\u00a1\u00a2\7/\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4.\3\2"+
		"\2\2\u00a5\u00a6\7\61\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\62"+
		"\3\2\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\64\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7z\2\2\u00b1\66\3\2\2\2\u00b2\u00b7\59\35\2\u00b3\u00b7\5"+
		";\36\2\u00b4\u00b7\5=\37\2\u00b5\u00b7\5? \2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b78\3\2\2\2"+
		"\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb:\3\2\2"+
		"\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7n\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4"+
		"\7c\2\2\u00c4\u00c5\7t\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"@\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7h\2\2\u00ceB\3\2\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"D\3\2\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8F\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7p\2\2\u00db"+
		"\u00dc\7f\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7h\2\2\u00deH\3\2\2\2\u00df"+
		"\u00e0\7y\2\2\u00e0\u00e1\7j\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7n\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e4J\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2"+
		"\2\u00e7L\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7"+
		"f\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7g\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3"+
		"\7w\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7e\2\2\u00f5P\3\2\2\2\u00f6\u00f7"+
		"\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7w\2\2\u00fa"+
		"\u00fb\7t\2\2\u00fb\u00fc\7p\2\2\u00fcR\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\u00ff\7p\2\2\u00ff\u0100\7f\2\2\u0100\u0101\7h\2\2\u0101\u0102\7w\2\2"+
		"\u0102\u0103\7p\2\2\u0103\u0104\7e\2\2\u0104T\3\2\2\2\u0105\u0106\7t\2"+
		"\2\u0106\u0107\7g\2\2\u0107\u0108\7c\2\2\u0108\u0109\7f\2\2\u0109V\3\2"+
		"\2\2\u010a\u010b\7y\2\2\u010b\u010c\7t\2\2\u010c\u010d\7k\2\2\u010d\u010e"+
		"\7v\2\2\u010e\u010f\7g\2\2\u010fX\3\2\2\2\u0110\u0111\7v\2\2\u0111\u0112"+
		"\7t\2\2\u0112\u0113\7w\2\2\u0113\u011a\7g\2\2\u0114\u0115\7h\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7n\2\2\u0117\u0118\7u\2\2\u0118\u011a\7g\2\2"+
		"\u0119\u0110\3\2\2\2\u0119\u0114\3\2\2\2\u011aZ\3\2\2\2\u011b\u011d\4"+
		"\62;\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\\\3\2\2\2\u0120\u0122\4\62;\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0127\7\60\2\2\u0126\u0128\4\62;\2\u0127\u0126\3\2\2\2"+
		"\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a^\3"+
		"\2\2\2\u012b\u0133\7)\2\2\u012c\u0134\13\2\2\2\u012d\u012e\7^\2\2\u012e"+
		"\u0134\7p\2\2\u012f\u0130\7^\2\2\u0130\u0134\7v\2\2\u0131\u0132\7^\2\2"+
		"\u0132\u0134\7)\2\2\u0133\u012c\3\2\2\2\u0133\u012d\3\2\2\2\u0133\u012f"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7)\2\2\u0136"+
		"`\3\2\2\2\u0137\u013b\t\2\2\2\u0138\u013a\t\3\2\2\u0139\u0138\3\2\2\2"+
		"\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013cb\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013e\u0143\7$\2\2\u013f\u0142\5e\63\2\u0140"+
		"\u0142\n\4\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7$\2\2\u0147d\3\2\2\2\u0148\u0149\7^\2\2\u0149"+
		"\u014a\t\5\2\2\u014af\3\2\2\2\u014b\u014c\7\61\2\2\u014c\u014d\7\61\2"+
		"\2\u014d\u0151\3\2\2\2\u014e\u0150\n\6\2\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\7\17\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\f\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\b\64\2\2\u015ah\3\2\2\2\u015b\u015d\t\7\2\2\u015c\u015b\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\b\65\2\2\u0161j\3\2\2\2\17\2\u00b6\u0119\u011e\u0123"+
		"\u0129\u0133\u013b\u0141\u0143\u0151\u0155\u015e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}