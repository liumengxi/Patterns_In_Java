package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * �鼮�е���⿳�����
 * @author liumengxi
 *
 */
public abstract class abstractLetterBook implements IBook {

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("������ѧ���鼮���޼�֮������");
	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("�Ჩ��ͨ�񣬳���������");
	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub
		System.out.println("i'm Letter's book !!!");

	}

}
