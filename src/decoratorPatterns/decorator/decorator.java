package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 * 装饰抽象类
 * Decorator(装饰模式)定义:动态给一个对象添加一些额外的职责，就像是在墙上刷油漆，
 * 使用Decorator模式相比用生成子类方式达到功能的扩充显的更加灵活。
 * 使用Decorator的理由是:这些功能需要由用户动态决定加入的方式和时机.
 * Decorator提供了"即插即用"的方法,在运行期间决定何时增加何种功能.
 * 装饰类是对继承的有力补充，继承可以解决实际问题，但在项目中需要考虑到易用性、复用性、
 * 扩展性、所以装饰模式可以替代继承，动态的增加功能。
 * @author liumengxi
 *
 */
public abstract class decorator extends book{
	
	private book b;
	
	/**
	 * 装饰类的构造函数
	 * 决定装饰哪一种图书类
	 * 在构造器中使用组合new方式,引入book对象;
	 * @param b
	 */
	public decorator(book b){
		this.b = b;
	}
	
	
	public void publish(){
		
		this.b.publish();
	
	}

}
