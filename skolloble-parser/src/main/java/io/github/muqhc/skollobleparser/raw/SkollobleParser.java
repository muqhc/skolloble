package io.github.muqhc.skollobleparser.raw;// Generated from Skolloble.g4 by ANTLR 4.9.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkollobleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, Space=2, INTOATTR=3, ID=4, WholeWrap=5, SingleBlock=6, NoBlock=7, 
		GoOutBLOCK=8, INTOBLOCK=9, STRING=10, Comment=11;
	public static final int
		RULE_file = 0, RULE_element = 1, RULE_attribution = 2, RULE_block = 3, 
		RULE_attribute = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "element", "attribution", "block", "attribute"
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

	@Override
	public String getGrammarFileName() { return "Skolloble.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SkollobleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			element();
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public AttributionContext attribution() {
			return getRuleContext(AttributionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(ID);
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTOATTR) {
					{
					setState(13);
					attribution();
					}
				}

				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WholeWrap) | (1L << SingleBlock) | (1L << NoBlock) | (1L << INTOBLOCK))) != 0)) {
					{
					setState(16);
					block();
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(STRING);
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

	public static class AttributionContext extends ParserRuleContext {
		public TerminalNode INTOATTR() { return getToken(SkollobleParser.INTOATTR, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribution(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribution(this);
		}
	}

	public final AttributionContext attribution() throws RecognitionException {
		AttributionContext _localctx = new AttributionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribution);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(INTOATTR);
			setState(24); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(23);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(26); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INTOBLOCK() { return getToken(SkollobleParser.INTOBLOCK, 0); }
		public TerminalNode GoOutBLOCK() { return getToken(SkollobleParser.GoOutBLOCK, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode WholeWrap() { return getToken(SkollobleParser.WholeWrap, 0); }
		public TerminalNode SingleBlock() { return getToken(SkollobleParser.SingleBlock, 0); }
		public TerminalNode NoBlock() { return getToken(SkollobleParser.NoBlock, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTOBLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(INTOBLOCK);
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					element();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==STRING );
				setState(34);
				match(GoOutBLOCK);
				}
				break;
			case WholeWrap:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(WholeWrap);
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case SingleBlock:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(SingleBlock);
				setState(43);
				element();
				}
				break;
			case NoBlock:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(NoBlock);
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

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SkollobleParser.ID, 0); }
		public TerminalNode STRING() { return getToken(SkollobleParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SkollobleListener) ((SkollobleListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(48);
				match(STRING);
				}
				break;
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\5\3\21\n\3\3\3\5\3\24\n\3"+
		"\3\3\5\3\27\n\3\3\4\3\4\6\4\33\n\4\r\4\16\4\34\3\5\3\5\6\5!\n\5\r\5\16"+
		"\5\"\3\5\3\5\3\5\3\5\6\5)\n\5\r\5\16\5*\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6"+
		"\5\6\64\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2:\2\f\3\2\2\2\4\26\3\2\2\2\6\30\3"+
		"\2\2\2\b/\3\2\2\2\n\61\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\20\7\6\2\2\17"+
		"\21\5\6\4\2\20\17\3\2\2\2\20\21\3\2\2\2\21\23\3\2\2\2\22\24\5\b\5\2\23"+
		"\22\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\27\7\f\2\2\26\16\3\2\2\2\26"+
		"\25\3\2\2\2\27\5\3\2\2\2\30\32\7\5\2\2\31\33\5\n\6\2\32\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36 \7\13\2\2\37!"+
		"\5\4\3\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\n"+
		"\2\2%\60\3\2\2\2&(\7\7\2\2\')\5\4\3\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*"+
		"+\3\2\2\2+\60\3\2\2\2,-\7\b\2\2-\60\5\4\3\2.\60\7\t\2\2/\36\3\2\2\2/&"+
		"\3\2\2\2/,\3\2\2\2/.\3\2\2\2\60\t\3\2\2\2\61\63\7\6\2\2\62\64\7\f\2\2"+
		"\63\62\3\2\2\2\63\64\3\2\2\2\64\13\3\2\2\2\n\20\23\26\34\"*/\63";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}