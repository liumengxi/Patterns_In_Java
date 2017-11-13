package FactoryPatterns.Book.impl;

import FactoryPatterns.Book.IBook;

/**
 * 计算机类书籍
 * @author liumengxi
 *
 */
public class computerBook implements IBook {

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("我是计算机类书籍，我价值连城！");

	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("吾乃信息化革命的驱动剂！");

	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub
		System.out.println("i'm Computer's book !!!");

	}

}
