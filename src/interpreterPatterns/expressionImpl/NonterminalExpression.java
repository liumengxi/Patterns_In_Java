package interpreterPatterns.expressionImpl;

import interpreterPatterns.expression.abstractExpression;
import interpreterPatterns.expression.context;

/**
 * ���ս�����ʽ
 * @author liumengxi
 *
 */
public class NonterminalExpression implements abstractExpression {
	
	private abstractExpression successor; 


	@Override
	public void interpret(context context) {
		

	}

	public abstractExpression getSuccessor() {
		return successor;
	}


	public void setSuccessor(abstractExpression successor) {
		this.successor = successor;
	}

	
	
}
