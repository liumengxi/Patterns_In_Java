package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * ��е��ҵ��������
 * @author liumengxi
 *
 */
public class chinaMachinePress extends book {
	
	

	@Override
	public void pulishSomeBook() {
		
		System.out.println("��е��ҵ������ӡˢͼ��....");

	}

	@Override
	public void sellSomeBook() {
		
		System.out.println("��е��ҵ���������ͼ��....");
		
	}

}
