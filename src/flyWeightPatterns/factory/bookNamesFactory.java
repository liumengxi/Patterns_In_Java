package flyWeightPatterns.factory;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import flyWeightPatterns.pojo.bookNames;

/**
 * 可共享的书籍名称工厂类
 * Flyweight定义:
 * 避免大量拥有相同内容的小类的开销(如耗费内存),使大家共享一个类(元类).
 * Flyweight模式是一个提高程序效率和性能的模式,会大大加快程序的运行速度.
 * 应用场合很多:比如你要从一个数据库中读取一系列字符串,这些字符串中有许多是重复的,
 * 那么我们可以将这些字符串储存在Flyweight池(pool)中.
 * @author liumengxi
 *
 */
public class bookNamesFactory {
	
	
	Hashtable ht = new  Hashtable();
	
	public bookNames getBookName(String name){
		
		bookNames bookName;
		bookName = (bookNames) ht.get(name);
		//产生新的书籍名称类
		if(bookName == null){
			
			bookName = new bookNames(name);
			ht.put(name, bookName);
			
		}
		return bookName;
	}
	
	
}
