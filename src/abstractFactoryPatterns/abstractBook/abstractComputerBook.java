package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * �鼮�еļ����������
 * @author liumengxi
 *
 */
public abstract class abstractComputerBook implements IBook {
	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("���Ǽ�������鼮���Ҽ�ֵ���ǣ�");

	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("������Ϣ����������������");

	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub
		System.out.println("i'm Computer's book !!!");

	}
}
