package visitorPatterns.book;

import visitorPatterns.visitor.IVisitor;

/**
 * �鼮�����࣬�������ܷ����߷�������
 * @author liumengxi
 *
 */
public abstract class book {
	//���ܷ����ߵķ���
	public abstract void accept(IVisitor iv);

}
