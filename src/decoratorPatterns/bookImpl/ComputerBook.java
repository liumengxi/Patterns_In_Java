package decoratorPatterns.bookImpl;

import decoratorPatterns.abstractBook.book;


/**
 * �������ͼ��
 * @author liumengxi
 *
 */
public class ComputerBook extends book {

	@Override
	public void publish() {

		System.out.println("����������ͼ��....");
	}

}
