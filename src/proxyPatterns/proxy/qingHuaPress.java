package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * 代理设计模式
 * 设计模式中定义: 为其他对象提供一种代理以控制对这个对象的访问.
 * 为什么要使用Proxy?
 * 1）、授权机制
 * 2）、某个客户端不能直接操作到某个对象，但又必须和那个对象有所互动。
 * 
 * 代理模式主要使用了Java的多态，被代理类主要是执行，代理类主要是接收。
 * 此实例中：
 * qingHuaPress类作为代理类，来接收客户端发来的请求，指定代理哪个类来执行方法。
 * chinaMachinePress类作为被代理类，来执行方法
 * xinHuaPress类作为被代理类，来执行方法
 *
 * 清华大学出版社
 * @author liumengxi
 *
 */
public class qingHuaPress extends book {

	private book book;
	
	
	/**
	 * 使用代理模式，出版图书时由机械工业出版社代理 印刷，出售
	 * 无参构造方法，默认代理chinaMachinePress(机械工业出版社类)
	 * 
	 */
	public qingHuaPress(){
		
		this.book = new chinaMachinePress();
	}
	
	/**
	 * 代理模式
	 * 有参构造方法，根据传递的参数来指定具体代理哪一个出版社类来执行方法
	 * @param book
	 */
	public qingHuaPress(book book){
		this.book = book;
	}
	
	
	@Override
	public void pulishSomeBook() {
		
		this.book.pulishSomeBook();

	}

	@Override
	public void sellSomeBook() {
		
		this.book.sellSomeBook();

	}

	public book getBook() {
		return book;
	}

	public void setBook(book book) {
		this.book = book;
	}
	
	

}
