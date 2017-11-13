package decoratorPatterns.bookImpl;

import decoratorPatterns.abstractBook.book;


/**
 * 计算机类图书
 * @author liumengxi
 *
 */
public class ComputerBook extends book {

	@Override
	public void publish() {

		System.out.println("出版计算机类图书....");
	}

}
