package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 * ������װ����
 * @author liumengxi
 *
 */
public class bookMakerDecorator extends decorator {

	public bookMakerDecorator(book b) {
		super(b);
	}
	
	public void bookMarkerDecorator(){
		
		System.out.println("��е��ҵ������");
	}

	
	/**
	 * ����ͼ��
	 */
	@Override
	public void publish(){
		this.bookMarkerDecorator();
		super.publish();
	}
}
