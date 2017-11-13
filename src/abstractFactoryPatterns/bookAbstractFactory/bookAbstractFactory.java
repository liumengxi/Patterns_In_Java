package abstractFactoryPatterns.bookAbstractFactory;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookEnum.bookEnum;
import abstractFactoryPatterns.bookFactory.bookFactory;

/**
 * 抽象工厂类：提供创建对象实例的抽象类
 * 抽象工厂设计优点：
 * 1、将创建对象实例的方法提取出在抽象类中实现，其子类更专注于何时创建实例，不用注重如何实例化。
 * （将共同的部分封装在抽象类中，提供各种不同的子类实现）
 * 2、实现了程序间的松耦合
 * 3、易于维护与扩展
 * 
 * 出版各类书籍的抽象工厂类
 * @author liumengxi
 * 该抽象工厂通过使用者提供的枚举类型进行实例化对象。
 *
 */
public abstract class bookAbstractFactory implements bookFactory {

	/**
	 * 出版各类书籍
	 * @param bookenum
	 * 书籍枚举
	 */
	public IBook createBook(bookEnum bookenum) {
		
		//定义书籍
		IBook book = null;

		if(bookenum.getValue() != null){
			
			try {
				book = (IBook) Class.forName(bookenum.getValue()).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return book;
	}



}
