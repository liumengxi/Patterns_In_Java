package FactoryPatterns.Book.impl;

import FactoryPatterns.Book.IBook;

/**
 * 烹饪类书籍
 * @author liumengxi
 *
 */
public class cookingBook implements IBook {

	@Override
	public void Price() {
		// TODO Auto-generated method stub
		System.out.println("我是烹饪类书籍，吾虽廉价，却可以创造出舌尖上的中国！");

	}

	@Override
	public void Apply() {
		// TODO Auto-generated method stub
		System.out.println("煎、炸、烹、煮、蒸。");

	}

	@Override
	public void BookType() {
		// TODO Auto-generated method stub.
		System.out.println("i'm Cooking's book !!!");

	}

}
