package observerPatterns;

import observerPatterns.observer.nameObserver;
import observerPatterns.observer.priceObserver;
import observerPatterns.pojo.book;

/**
 * ���Թ۲���ģʽ
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		book b = new book();
		
		nameObserver no = new nameObserver();
		
		priceObserver po = new priceObserver();
		
		b.addObserver(no);
		
		b.addObserver(po);
		
		b.setName("�������Java������ڶ���");
		b.setPrice(57.6);
		
		

	}

}
