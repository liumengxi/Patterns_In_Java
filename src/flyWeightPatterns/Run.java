package flyWeightPatterns;

import flyWeightPatterns.factory.bookNamesFactory;
import flyWeightPatterns.pojo.bookNames;

/**
 * ������Ԫ���ģʽ
 * @author liumengxi
 * ���鼮�д��ڴ���һ�����鼮����ʱ����Ԫģʽ����ʡ����ռ䡣
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
