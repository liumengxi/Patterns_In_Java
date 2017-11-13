package flyWeightPatterns.factory;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import flyWeightPatterns.pojo.bookNames;

/**
 * �ɹ�����鼮���ƹ�����
 * Flyweight����:
 * �������ӵ����ͬ���ݵ�С��Ŀ���(��ķ��ڴ�),ʹ��ҹ���һ����(Ԫ��).
 * Flyweightģʽ��һ����߳���Ч�ʺ����ܵ�ģʽ,����ӿ����������ٶ�.
 * Ӧ�ó��Ϻܶ�:������Ҫ��һ�����ݿ��ж�ȡһϵ���ַ���,��Щ�ַ�������������ظ���,
 * ��ô���ǿ��Խ���Щ�ַ���������Flyweight��(pool)��.
 * @author liumengxi
 *
 */
public class bookNamesFactory {
	
	
	Hashtable ht = new  Hashtable();
	
	public bookNames getBookName(String name){
		
		bookNames bookName;
		bookName = (bookNames) ht.get(name);
		//�����µ��鼮������
		if(bookName == null){
			
			bookName = new bookNames(name);
			ht.put(name, bookName);
			
		}
		return bookName;
	}
	
	
}
