package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;

/**
 * ”°À¢Õº È«Î«ÛµƒHandler
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
		
		System.out.println("”°À¢Õº È...");

	}

}
