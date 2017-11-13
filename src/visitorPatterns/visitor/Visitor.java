package visitorPatterns.visitor;

import visitorPatterns.book.computerBook;
import visitorPatterns.book.letterBook;

/**
 * ��������ߵ�ʵ����
 * 
 */
public class Visitor implements IVisitor {

	/**
	 * ���ʼ������ͼ��
	 */
	@Override
	public void visit(computerBook comb) {
		
		
		System.out.println(comb.toString());

	}

	/**
	 * ������ѧ��ͼ��
	 */
	@Override
	public void visit(letterBook lb) {
		
		System.out.println(lb.toString());
		

	}

}
