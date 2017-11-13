package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 *  ӡˢͼ����
 * @author liumengxi
 *
 */
public class printBookDecorator extends decorator {

	public printBookDecorator(book b) {
		super(b);
	}
	
	public void printBookDecorators(){
		
		System.out.println("ӡˢͼ��");
	}
	
	/**
	 * ӡˢͼ��
	 */
	@Override
	public void publish(){
		
		this.printBookDecorators();
		super.publish();
	
	}

}
