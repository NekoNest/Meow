// Generated from E:/Projects/IdeaProjects/Meow/src/moe/lemonneko/meow/antlr\Meow.g4 by ANTLR 4.8
package moe.lemonneko.meow.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeowLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SINGLE_LINE_COMMENT=1, MULTI_LINE_COMMENT=2, DOCUMENT=3, PACKAGE=4, USING=5, 
		DOT=6, CLASS=7, TYPE=8, LEFT_BRACE=9, RIGHT_BRACE=10, VAR=11, VAL=12, 
		COLON=13, EQUALS=14, FUN=15, LEFT_BRACKET=16, RIGHT_BRACKET=17, PRIVATE=18, 
		PROTECTED=19, PUBLIC=20, STATIC=21, COMMA=22, DECIMAL_INTEGER=23, HEX_INTEGER=24, 
		BINARY_INTEGER=25, DECIMAL_FLOAT=26, STRING=27, MUL=28, DIV=29, ADD=30, 
		SUB=31, ID=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "DOCUMENT", "PACKAGE", "USING", 
			"DOT", "CLASS", "TYPE", "LEFT_BRACE", "RIGHT_BRACE", "VAR", "VAL", "COLON", 
			"EQUALS", "FUN", "LEFT_BRACKET", "RIGHT_BRACKET", "PRIVATE", "PROTECTED", 
			"PUBLIC", "STATIC", "COMMA", "DECIMAL_INTEGER", "HEX_INTEGER", "BINARY_INTEGER", 
			"DECIMAL_FLOAT", "STRING", "MUL", "DIV", "ADD", "SUB", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'package'", "'using'", "'.'", "'class'", null, 
			"'{'", "'}'", "'var'", "'val'", "':'", "'='", "'fun'", "'('", "')'", 
			"'private'", "'protected'", "'public'", "'static'", "','", null, null, 
			null, null, null, "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "DOCUMENT", "PACKAGE", 
			"USING", "DOT", "CLASS", "TYPE", "LEFT_BRACE", "RIGHT_BRACE", "VAR", 
			"VAL", "COLON", "EQUALS", "FUN", "LEFT_BRACKET", "RIGHT_BRACKET", "PRIVATE", 
			"PROTECTED", "PUBLIC", "STATIC", "COMMA", "DECIMAL_INTEGER", "HEX_INTEGER", 
			"BINARY_INTEGER", "DECIMAL_FLOAT", "STRING", "MUL", "DIV", "ADD", "SUB", 
			"ID", "WS"
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


	public MeowLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Meow.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\3\3\7"+
		"\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4`\n\4\f\4\16"+
		"\4c\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t\177\n\t\r\t\16\t\u0080"+
		"\3\t\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\6\30\u00c4\n\30\r\30\16\30"+
		"\u00c5\3\31\3\31\3\31\6\31\u00cb\n\31\r\31\16\31\u00cc\3\32\6\32\u00d0"+
		"\n\32\r\32\16\32\u00d1\3\33\6\33\u00d5\n\33\r\33\16\33\u00d6\3\33\3\33"+
		"\6\33\u00db\n\33\r\33\16\33\u00dc\3\34\3\34\7\34\u00e1\n\34\f\34\16\34"+
		"\u00e4\13\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u00f1"+
		"\n!\r!\16!\u00f2\3!\7!\u00f6\n!\f!\16!\u00f9\13!\3\"\6\"\u00fc\n\"\r\""+
		"\16\"\u00fd\3\"\3\"\6KTa\u00e2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\n\3\2C\\\6\2\62;C\\aac|"+
		"\3\2\62;\4\2ZZzz\5\2\62;CHch\3\2\62\63\5\2C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u010e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5"+
		"N\3\2\2\2\7Z\3\2\2\2\tg\3\2\2\2\13o\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21"+
		"~\3\2\2\2\23\u0088\3\2\2\2\25\u008a\3\2\2\2\27\u008c\3\2\2\2\31\u0090"+
		"\3\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009c\3\2"+
		"\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a8\3\2\2\2)\u00b2\3\2\2\2+\u00b9"+
		"\3\2\2\2-\u00c0\3\2\2\2/\u00c3\3\2\2\2\61\u00c7\3\2\2\2\63\u00cf\3\2\2"+
		"\2\65\u00d4\3\2\2\2\67\u00de\3\2\2\29\u00e7\3\2\2\2;\u00e9\3\2\2\2=\u00eb"+
		"\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C\u00fb\3\2\2\2EF\7\61\2\2FG\7\61"+
		"\2\2GK\3\2\2\2HJ\13\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2L\4\3"+
		"\2\2\2MK\3\2\2\2NO\7\61\2\2OP\7,\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV"+
		"\3\2\2\2TU\3\2\2\2TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7,\2\2XY\7\61\2\2Y"+
		"\6\3\2\2\2Z[\7\61\2\2[\\\7,\2\2\\]\7,\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2\2"+
		"\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7,\2\2ef\7\61\2"+
		"\2f\b\3\2\2\2gh\7r\2\2hi\7c\2\2ij\7e\2\2jk\7m\2\2kl\7c\2\2lm\7i\2\2mn"+
		"\7g\2\2n\n\3\2\2\2op\7w\2\2pq\7u\2\2qr\7k\2\2rs\7p\2\2st\7i\2\2t\f\3\2"+
		"\2\2uv\7\60\2\2v\16\3\2\2\2wx\7e\2\2xy\7n\2\2yz\7c\2\2z{\7u\2\2{|\7u\2"+
		"\2|\20\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0085\3\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\22\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7}\2\2\u0089\24\3\2\2\2\u008a"+
		"\u008b\7\177\2\2\u008b\26\3\2\2\2\u008c\u008d\7x\2\2\u008d\u008e\7c\2"+
		"\2\u008e\u008f\7t\2\2\u008f\30\3\2\2\2\u0090\u0091\7x\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7n\2\2\u0093\32\3\2\2\2\u0094\u0095\7<\2\2\u0095\34"+
		"\3\2\2\2\u0096\u0097\7?\2\2\u0097\36\3\2\2\2\u0098\u0099\7h\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7p\2\2\u009b \3\2\2\2\u009c\u009d\7*\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7+\2\2\u009f$\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7r\2"+
		"\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7f\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7w\2\2\u00b4"+
		"\u00b5\7d\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7e\2\2"+
		"\u00b8*\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7c\2"+
		"\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7e\2\2\u00bf,\3\2"+
		"\2\2\u00c0\u00c1\7.\2\2\u00c1.\3\2\2\2\u00c2\u00c4\t\4\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\60\3\2\2\2\u00c7\u00c8\7\62\2\2\u00c8\u00ca\t\5\2\2\u00c9\u00cb\t\6\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\62\3\2\2\2\u00ce\u00d0\t\7\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\64\3\2\2"+
		"\2\u00d3\u00d5\t\4\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\60\2\2"+
		"\u00d9\u00db\t\4\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\66\3\2\2\2\u00de\u00e2\7$\2\2\u00df"+
		"\u00e1\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\7$\2\2\u00e68\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8:\3\2\2\2\u00e9\u00ea"+
		"\7\61\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec>\3\2\2\2\u00ed\u00ee"+
		"\7/\2\2\u00ee@\3\2\2\2\u00ef\u00f1\t\b\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4"+
		"\u00f6\t\3\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8B\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc"+
		"\t\t\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b\"\2\2\u0100D\3\2\2\2"+
		"\24\2KTa\u0080\u0083\u0085\u00c5\u00cc\u00d1\u00d6\u00dc\u00e2\u00f0\u00f2"+
		"\u00f5\u00f7\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}