package visitorPatterns.visitor;

import visitorPatterns.book.computerBook;
import visitorPatterns.book.letterBook;

/**
 * 具体访问者的实现类
 * 
 */
public class Visitor implements IVisitor {

	/**
	 * 访问计算机类图书
	 */
	@Override
	public void visit(computerBook comb) {
		
		
		System.out.println(comb.toString());

	}

	/**
	 * 访问文学类图书
	 */
	@Override
	public void visit(letterBook lb) {
		
		System.out.println(lb.toString());
		

	}

}
