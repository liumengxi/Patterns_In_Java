package flyWeightPatterns;

import flyWeightPatterns.factory.bookNamesFactory;
import flyWeightPatterns.pojo.bookNames;

/**
 * 测试享元设计模式
 * @author liumengxi
 * 当书籍中存在大量一样的书籍名称时，享元模式将节省更多空间。
 *
 */
public class Run {
	
	public static void main(String[] args) {
		
		bookNamesFactory nf = new bookNamesFactory();
		
		bookNames Java_JVM = nf.getBookName("Java_JVM");
		
		bookNames Java_Thread = nf.getBookName("Java_Thread");
		
		System.out.println(Java_JVM);
		
		System.out.println(Java_Thread);
		
	}

}
