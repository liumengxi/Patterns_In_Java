package iteratorPatterns.iterator;

import java.util.ArrayList;

import iteratorPatterns.book.book;

/**
 * �������F
 * @author liumengxi
 *
 */
public class bookIterator implements IBookIterator {
	
	
	private int currentItem = 0;
	
	private ArrayList<book> bookList = new ArrayList<book>();
	

	public bookIterator(ArrayList<book> bookList) {
		super();
		this.bookList = bookList;
	}

	public ArrayList<book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public boolean hasNext() {
		//����һ������ֵ
		boolean b = true;
		if(this.currentItem>=bookList.size() ||
		this.bookList.get(this.currentItem) == null){
		     b =false;
		 }
		return b;
		
	}

	@Override
	public book next() {
		// TODO Auto-generated method stub
		 return (book)this.bookList.get(this.currentItem++);
	}

	@Override
	public void remove() {

	}

}
