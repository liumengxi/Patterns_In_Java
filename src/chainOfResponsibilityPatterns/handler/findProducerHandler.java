package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;

/**
 * ����Ѱ�ҳ�����handler
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


		System.out.println("Ѱ�ҵ���е��ҵ������...");
	}

}
