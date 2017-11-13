package FactoryPatterns.booksFactory;

import java.util.HashMap;

import FactoryPatterns.Book.IBook;

/**
 * 工厂模式：提供创建对象的接口
 * 工厂模式的设计好处：
 * 1、将创建实例与使用实例的工作分开，实现代码之间的松耦合。
 * 2、创建实例的方法写入工厂类中，易于对代码的维护。
 * 3、灵活性、扩展性更强。如果业务有改动，只需修改工厂类中的创建实例方法即可。
 * 
 * 创建书籍对象的工厂
 * @author liumengxi
 */
public class bookFactory {

	/**
	 * 创建书籍实现类的方法
	 * @param <T>
	 * @param c
	 * 参数Class c为IBook接口的三个实现类，如果有扩展，可以继续添加它的实现。
	 */
	
	/*
	 * 为实现延迟初始化(Lazy initialization),定义一个存放IBook实例的容器,如果IBook对象已经被实例化,
	 * 再次用到该实例的话，直接从内存中获取，不需要再次实例化。
	 * 目的是为了减少内存消耗
	 */
	private static HashMap<String,IBook> books = new HashMap<String,IBook>();
	
	
	public static <T> IBook createBook(Class<T> c){
		
		//书籍接口
		IBook book = null;
		
		try {
			//通过容器寻找IBook,如果存在就不需要再次实例化
			if(books.containsKey(c.getSimpleName())){
				
				book = books.get(c.getSimpleName());
			
			}else{
				//通过反射创建类对象
				//通过Class.forName方法返回描述的Class对象
				//newInstance返回该类的一个新实例
				book = (IBook) Class.forName(c.getName()).newInstance();
				//放至容器中
				books.put(c.getSimpleName(), book);
			}
		
		} catch (InstantiationException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return book;
		
	}
	
}
