package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * 新华书局出版社
 * @author liumengxi
 *
 */
public class xinHuaPress extends book {

	@Override
	public void pulishSomeBook() {

		System.out.println("新华书局出版社印刷图书....");
	}

	@Override
	public void sellSomeBook() {
		
		System.out.println("新华书局出版社出售图书....");
		
	}

}
