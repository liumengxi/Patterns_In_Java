package interpreterPatterns.expression;

/**
 * 用来描述共同的操作
 * Interpreter定义:定义语言的文法 ,并且建立一个解释器来解释该语言中的句子.
 * @author liumengxi
 *
 */
public interface abstractExpression {

	void interpret( context context ); 

}
