package io.github.muqhc.skollobleparser.raw;// Generated from Skolloble.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkollobleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, Space=2, INTOATTR=3, NamespaceSign=4, ID=5, WholeWrap=6, SingleBlock=7, 
		NoBlock=8, GoOutBLOCK=9, INTOBLOCK=10, STRING=11, Comment=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "Space", "INTOATTR", "IDSUR", "IDINNER", "NAMING", "NamespaceSign", 
			"ID", "WholeWrap", "SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", 
			"STRING", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", "'@'", null, "'/'", "'-'", "'\\'", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "Space", "INTOATTR", "NamespaceSign", "ID", "WholeWrap", 
			"SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", "STRING", "Comment"
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


	public SkollobleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Skolloble.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2%\n\2"+
		"\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6\65\n\6"+
		"\3\7\6\78\n\7\r\7\16\79\3\7\6\7=\n\7\r\7\16\7>\3\7\3\7\5\7C\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\7\17"+
		"U\n\17\f\17\16\17X\13\17\3\17\3\17\3\20\3\20\7\20^\n\20\f\20\16\20a\13"+
		"\20\3\20\3\20\3\20\3\20\4V_\2\21\3\3\5\4\7\5\t\2\13\2\r\2\17\6\21\7\23"+
		"\b\25\t\27\n\31\13\33\f\35\r\37\16\3\2\5\4\2\13\13\"\"\6\2\62;C\\aac|"+
		"\7\2/\60\62;C\\aac|\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3$\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2"+
		"\t\61\3\2\2\2\13\64\3\2\2\2\r\67\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3"+
		"\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33P\3\2\2\2\35R\3\2\2\2\37"+
		"[\3\2\2\2!%\7\f\2\2\"#\7\17\2\2#%\7\f\2\2$!\3\2\2\2$\"\3\2\2\2%&\3\2\2"+
		"\2&\'\b\2\2\2\'\4\3\2\2\2(*\t\2\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,-\3\2\2\2-.\b\3\2\2.\6\3\2\2\2/\60\7<\2\2\60\b\3\2\2\2\61\62\t"+
		"\3\2\2\62\n\3\2\2\2\63\65\t\4\2\2\64\63\3\2\2\2\65\f\3\2\2\2\668\5\t\5"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:B\3\2\2\2;=\5\13\6\2"+
		"<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\5\t\5\2AC\3\2\2\2"+
		"B<\3\2\2\2BC\3\2\2\2C\16\3\2\2\2DE\7B\2\2E\20\3\2\2\2FG\5\r\7\2G\22\3"+
		"\2\2\2HI\7\61\2\2I\24\3\2\2\2JK\7/\2\2K\26\3\2\2\2LM\7^\2\2M\30\3\2\2"+
		"\2NO\7\177\2\2O\32\3\2\2\2PQ\7}\2\2Q\34\3\2\2\2RV\7$\2\2SU\13\2\2\2TS"+
		"\3\2\2\2UX\3\2\2\2VW\3\2\2\2VT\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7$\2\2Z\36"+
		"\3\2\2\2[_\7=\2\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2"+
		"`b\3\2\2\2a_\3\2\2\2bc\7=\2\2cd\3\2\2\2de\b\20\2\2e \3\2\2\2\13\2$+\64"+
		"9>BV_\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}