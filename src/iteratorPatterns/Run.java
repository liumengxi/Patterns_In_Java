package iteratorPatterns;

import iteratorPatterns.book.book;
import iteratorPatterns.iterator.IBookIterator;

/**
 * 測試迭代類
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		book book = new book();
		//这边100个项目
		for(int i=0;i<100;i++){
		book.add(String.valueOf(i),"文学第 "+i + " 本图书");
		}
		
		IBookIterator bi =  book.iterator();
		while(bi.hasNext()){
			book b = bi.next();
			System.out.println(b.toString());
		}

	}

}
