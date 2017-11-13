package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * 机械工业出版社类
 * @author liumengxi
 *
 */
public class chinaMachinePress extends book {
	
	

	@Override
	public void pulishSomeBook() {
		
		System.out.println("机械工业出版社印刷图书....");

	}

	@Override
	public void sellSomeBook() {
		
		System.out.println("机械工业出版社出售图书....");
		
	}

}
