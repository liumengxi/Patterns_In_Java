package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * �»���ֳ�����
 * @author liumengxi
 *
 */
public class xinHuaPress extends book {

	@Override
	public void pulishSomeBook() {

		System.out.println("�»���ֳ�����ӡˢͼ��....");
	}

	@Override
	public void sellSomeBook() {
		
		System.out.println("�»���ֳ��������ͼ��....");
		
	}

}
