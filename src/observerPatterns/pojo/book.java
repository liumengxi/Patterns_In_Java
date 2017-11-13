package observerPatterns.pojo;

import java.util.Observable;


/**
 * 观察者模式(observer)
 * 书籍类(被观察者)
 * 继承observable
 * 如何使用：
 *   Java的API还为为我们提供现成的Observer接口Java.util.Observer.我们只要直接使用它就可以.
 *   1.提供Add/Delete observer的方法;
 *   2.提供通知(notify) 所有observer的方法;
 *  观察者模式有另一个名称叫做发布/订阅模型(Publish/Subscribe)
 *  使用场景：
 *  实现消息的广播，一个消息可以出发多个事件。
 *  观察者模式需要解决的两个重点问题：
 *  广播链的问题。（一个观察者模式最多出现一个对象既是观察者也是被观察者。）
 *  异步处理问题。（如果观察者较多，可以使用异步处理方式。）
 * @author liumengxi
 *
 */
public class book extends Observable{
	
	private String name;
	
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//设置名称变化点
		setChanged();
		notifyObservers(name);
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
		//设置价格变化点
		setChanged();
		notifyObservers(price);
	}
	
	

}
