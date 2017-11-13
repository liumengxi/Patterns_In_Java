package iteratorPatterns;

import iteratorPatterns.book.book;
import iteratorPatterns.iterator.IBookIterator;

/**
 * �yԇ�����
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		book book = new book();
		//���100����Ŀ
		for(int i=0;i<100;i++){
		book.add(String.valueOf(i),"��ѧ�� "+i + " ��ͼ��");
		}
		
		IBookIterator bi =  book.iterator();
		while(bi.hasNext()){
			book b = bi.next();
			System.out.println(b.toString());
		}

	}

}
