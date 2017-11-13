package abstractFactoryPatterns;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookAbstractFactory.someBookFactory.someBookFactory;

/**
 * 通过抽象工厂类出版各类图书
 * @author liumengxi
 * 实例化出版书籍工厂实例，按需求进行对象实例化
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//出版书籍工厂类
		someBookFactory bf = new someBookFactory();
		
		
		/**
		 * 实例化各类书籍
		 */
		IBook hardWareBook =  bf.createHardWareBook();
		
		IBook softWareBook = bf.createSoftWareBook();
		
		hardWareBook.bookTag();
		
		softWareBook.bookTag();
		
	}

}
