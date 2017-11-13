package decoratorPatterns;

import decoratorPatterns.abstractBook.book;
import decoratorPatterns.bookImpl.ComputerBook;
import decoratorPatterns.decorator.bookMakerDecorator;
import decoratorPatterns.decorator.printBookDecorator;

/**
 * ≤‚ ‘◊∞ Œ¿‡
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		book b = new ComputerBook();
		
		b = new bookMakerDecorator(b);
		
		b = new printBookDecorator(b);
		
		
		
		b.publish();
		

	}

}
