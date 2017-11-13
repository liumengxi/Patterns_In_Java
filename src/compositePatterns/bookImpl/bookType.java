package compositePatterns.bookImpl;

import java.util.ArrayList;

import compositePatterns.book.book;

/**
 * �鼮����(��֦�ڵ�)
 * @author liumengxi
 *
 */
public class bookType extends book {
	
	//�洢�鼮���������
	private ArrayList<book> booList = new ArrayList<book>();

	/**
	 * �鼮����
	 * 
	 * @param bookNo
	 * @param bookType
	 * @param bookDesc
	 */
	public bookType(String bookNo, String bookType, String bookDesc) {
		super(bookNo, bookType, bookDesc);
	}
	
	/**
	 * �����鼮����
	 * @param book
	 */
	public void addBookType(book book){
		
		this.booList.add(book);
		
	}
	
	public ArrayList<book> getBookListInfo(){
		return this.booList;
	}
	
	
	
	

}
