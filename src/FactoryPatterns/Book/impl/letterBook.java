package FactoryPatterns.Book.impl;

import FactoryPatterns.Book.IBook;

/**
 * ��ѧ���鼮
 * @author liumengxi
 *
 */
public class letterBook implements IBook {

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
