package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * �鼮�е���⿳�����
 * @author liumengxi
 *
 */
public abstract class abstractCookingBook implements IBook {

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("����������鼮���������ۣ�ȴ���Դ��������ϵ��й���");

	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("�塢ը���롢������");

	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub.
		System.out.println("i'm Cooking's book !!!");

	}

}
