package FactoryPatterns.Book.impl;

import FactoryPatterns.Book.IBook;

/**
 * ������鼮
 * @author liumengxi
 *
 */
public class cookingBook implements IBook {

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
