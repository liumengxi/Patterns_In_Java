package observerPatterns;

import observerPatterns.observer.nameObserver;
import observerPatterns.observer.priceObserver;
import observerPatterns.pojo.book;

/**
 * 测试观察者模式
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
		
		b.setName("深入理解Java虚拟机第二版");
		b.setPrice(57.6);
		
		

	}

}
