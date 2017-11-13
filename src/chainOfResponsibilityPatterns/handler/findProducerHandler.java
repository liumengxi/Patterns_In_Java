package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;

/**
 * 请求寻找出版商handler
 * @author liumengxi
 *
 */
public class findProducerHandler extends Handler {
	
	
	public findProducerHandler(){
		super(1);
	}

	public findProducerHandler(int requestType) {
		
	}

	@Override
	public void responseMessage(book book) {


		System.out.println("寻找到机械工业出版社...");
	}

}
