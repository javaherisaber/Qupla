// Generated from test.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link testParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(testParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(testParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#major}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMajor(testParser.MajorContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declarevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarevar(testParser.DeclarevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#declarefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarefunc(testParser.DeclarefuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(testParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(testParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(testParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(testParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#callfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallfunc(testParser.CallfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(testParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(testParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(testParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link testParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(testParser.OpContext ctx);
}