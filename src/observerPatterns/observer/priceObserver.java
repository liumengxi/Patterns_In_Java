package observerPatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * (�۲���)
 * priceObserver����Ҫ�Ƕ��鼮�۸���й۲�
 * @author liumengxi
 *
 */
public class priceObserver implements Observer {

	private double price = 0.0; 

	@Override
	public void update(Observable o, Object arg) {

		if(arg instanceof Double){
			
			price = ((Double) arg).doubleValue();
			
			System.out.println("�鼮���ѽ���---->" + price);
		}
		

	}

}
