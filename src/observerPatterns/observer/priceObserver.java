package observerPatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * (观察者)
 * priceObserver类主要是对书籍价格进行观察
 * @author liumengxi
 *
 */
public class priceObserver implements Observer {

	private double price = 0.0; 

	@Override
	public void update(Observable o, Object arg) {

		if(arg instanceof Double){
			
			price = ((Double) arg).doubleValue();
			
			System.out.println("书籍的已降价---->" + price);
		}
		

	}

}
