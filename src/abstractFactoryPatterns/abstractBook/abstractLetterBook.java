package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * 书籍中的烹饪抽象类
 * @author liumengxi
 *
 */
public abstract class abstractLetterBook implements IBook {

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
