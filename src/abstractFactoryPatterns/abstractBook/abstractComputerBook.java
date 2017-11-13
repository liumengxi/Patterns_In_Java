package abstractFactoryPatterns.abstractBook;

import abstractFactoryPatterns.book.IBook;

/**
 * 书籍中的计算机抽象类
 * @author liumengxi
 *
 */
public abstract class abstractComputerBook implements IBook {
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
