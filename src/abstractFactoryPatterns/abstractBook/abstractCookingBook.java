package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * 书籍中的烹饪抽象类
 * @author liumengxi
 *
 */
public abstract class abstractCookingBook implements IBook {

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
