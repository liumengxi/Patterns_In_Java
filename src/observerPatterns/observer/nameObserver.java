package observerPatterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * (观察者)
 * nameObserver类主要是来对书籍名称 进行观察
 * @author liumengxi
 *
 */
public class nameObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		if(arg instanceof String){
			
			String name = (String) arg;
			System.out.println("书籍名称修改为 --->" + name);
			
		}
		
	}

}
