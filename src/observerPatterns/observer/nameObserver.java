package observerPatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * (�۲���)
 * nameObserver����Ҫ�������鼮���� ���й۲�
 * @author liumengxi
 *
 */
public class nameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if(arg instanceof String){
			
			String name = (String) arg;
			System.out.println("�鼮�����޸�Ϊ --->" + name);
			
		}
		
	}

}
