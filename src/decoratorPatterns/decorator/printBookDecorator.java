package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 *  ”°À¢Õº È¿‡
 * @author liumengxi
 *
 */
public class printBookDecorator extends decorator {

	public printBookDecorator(book b) {
		super(b);
	}
	
	public void printBookDecorators(){
		
		System.out.println("”°À¢Õº È");
	}
	
	/**
	 * ”°À¢Õº È
	 */
	@Override
	public void publish(){
		
		this.printBookDecorators();
		super.publish();
	
	}

}
