package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;

/**
 * ӡˢͼ�������Handler
 * @author liumengxi
 *
 */
public class pulishPaperHandler extends Handler {
	
	public pulishPaperHandler(){
		super(2);
	}

	public pulishPaperHandler(int requestType) {
		
	}

	@Override
	public void responseMessage(book book) {
		
		System.out.println("ӡˢͼ��...");

	}

}
