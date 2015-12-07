package com.compiler.antlride.antlr;
// Generated from test.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(testParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(testParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(testParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(testParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#major}.
	 * @param ctx the parse tree
	 */
	void enterMajor(testParser.MajorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#major}.
	 * @param ctx the parse tree
	 */
	void exitMajor(testParser.MajorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void enterDeclarevar(testParser.DeclarevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarevar}.
	 * @param ctx the parse tree
	 */
	void exitDeclarevar(testParser.DeclarevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarefunc}.
	 * @param ctx the parse tree
	 */
	void enterDeclarefunc(testParser.DeclarefuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarefunc}.
	 * @param ctx the parse tree
	 */
	void exitDeclarefunc(testParser.DeclarefuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncParams(testParser.FuncParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#funcParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncParams(testParser.FuncParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(testParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(testParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(testParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void enterCallfunc(testParser.CallfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#callfunc}.
	 * @param ctx the parse tree
	 */
	void exitCallfunc(testParser.CallfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(testParser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(testParser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(testParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(testParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(testParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(testParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(testParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(testParser.OpContext ctx);
}