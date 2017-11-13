package FactoryPatterns.Book.impl;

import FactoryPatterns.Book.IBook;

/**
 * 文学类书籍
 * @author liumengxi
 *
 */
public class letterBook implements IBook {

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("我是文学类书籍，无价之宝！！");
	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("吾博古通今，承载中西！");
	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub
		System.out.println("i'm Letter's book !!!");

	}

}
