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
		NEWLINE=1, Space=2, INTOATTR=3, ID=4, WholeWrap=5, SingleBlock=6, NoBlock=7, 
		GoOutBLOCK=8, INTOBLOCK=9, STRING=10, Comment=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEWLINE", "Space", "INTOATTR", "IDHEAD", "IDTAIL", "NAMING", "ID", "WholeWrap", 
			"SingleBlock", "NoBlock", "GoOutBLOCK", "INTOBLOCK", "STRING", "Comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", null, "'/'", "'-'", "'\\'", "'}'", "'{'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEWLINE", "Space", "INTOATTR", "ID", "WholeWrap", "SingleBlock", 
			"NoBlock", "GoOutBLOCK", "INTOBLOCK", "STRING", "Comment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\5\2#\n\2\3\2\3\2\3"+
		"\3\6\3(\n\3\r\3\16\3)\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6\63\n\6\3\7\3\7\7"+
		"\7\67\n\7\f\7\16\7:\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\7\16J\n\16\f\16\16\16M\13\16\3\16\3\16\3\17\3\17\7\17S"+
		"\n\17\f\17\16\17V\13\17\3\17\3\17\3\17\3\17\4KT\2\20\3\3\5\4\7\5\t\2\13"+
		"\2\r\2\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\3\2\5\4\2\13\13\"\"\5"+
		"\2C\\aac|\7\2//\62;C\\aac|\2\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\"\3\2\2\2\5\'\3\2\2\2\7-\3\2\2\2\t/\3"+
		"\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2"+
		"\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35P\3\2\2\2\37#\7\f\2"+
		"\2 !\7\17\2\2!#\7\f\2\2\"\37\3\2\2\2\" \3\2\2\2#$\3\2\2\2$%\b\2\2\2%\4"+
		"\3\2\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2"+
		"+,\b\3\2\2,\6\3\2\2\2-.\7<\2\2.\b\3\2\2\2/\60\t\3\2\2\60\n\3\2\2\2\61"+
		"\63\t\4\2\2\62\61\3\2\2\2\63\f\3\2\2\2\648\5\t\5\2\65\67\5\13\6\2\66\65"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\16\3\2\2\2:8\3\2\2\2;<\5\r"+
		"\7\2<\20\3\2\2\2=>\7\61\2\2>\22\3\2\2\2?@\7/\2\2@\24\3\2\2\2AB\7^\2\2"+
		"B\26\3\2\2\2CD\7\177\2\2D\30\3\2\2\2EF\7}\2\2F\32\3\2\2\2GK\7$\2\2HJ\13"+
		"\2\2\2IH\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7"+
		"$\2\2O\34\3\2\2\2PT\7=\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2TR"+
		"\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7=\2\2XY\3\2\2\2YZ\b\17\2\2Z\36\3\2\2\2"+
		"\t\2\")\628KT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}