package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;

/**
 * 出版图书的请求类
 * @author liumengxi
 *
 */
public class sellingBookHandler extends Handler {

	public sellingBookHandler(){
		super(3);
	}
	
	public sellingBookHandler(int requestType) {
		
	}

	@Override
	public void responseMessage(book book) {
		
		System.out.println("出版图书....");
		
	}

}
