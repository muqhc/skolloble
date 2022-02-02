package io.github.muqhc.skollobleparser.raw;// Generated from Skolloble.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SkollobleParser}.
 */
public interface SkollobleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(SkollobleParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(SkollobleParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(SkollobleParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(SkollobleParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#attribution}.
	 * @param ctx the parse tree
	 */
	void enterAttribution(SkollobleParser.AttributionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#attribution}.
	 * @param ctx the parse tree
	 */
	void exitAttribution(SkollobleParser.AttributionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SkollobleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SkollobleParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SkollobleParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SkollobleParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SkollobleParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SkollobleParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SkollobleParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SkollobleParser.NamespaceContext ctx);
}