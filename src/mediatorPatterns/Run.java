package mediatorPatterns;

import mediatorPatterns.mediator.mediator;
import mediatorPatterns.mediator.psBookMediator;
import mediatorPatterns.producer.bookProducer;

/**
 * �����н�����
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		mediator m = new psBookMediator();
		
		bookProducer bp = new bookProducer(m);
		
		bp.getAllStream();

	}

}
