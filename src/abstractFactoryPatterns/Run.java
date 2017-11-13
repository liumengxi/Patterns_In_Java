package abstractFactoryPatterns;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookAbstractFactory.someBookFactory.someBookFactory;

/**
 * ͨ�����󹤳���������ͼ��
 * @author liumengxi
 * ʵ���������鼮����ʵ������������ж���ʵ����
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//�����鼮������
		someBookFactory bf = new someBookFactory();
		
		
		/**
		 * ʵ���������鼮
		 */
		IBook hardWareBook =  bf.createHardWareBook();
		
		IBook softWareBook = bf.createSoftWareBook();
		
		hardWareBook.bookTag();
		
		softWareBook.bookTag();
		
	}

}
