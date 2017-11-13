package compositePatterns.bookImpl;

import java.util.ArrayList;

import compositePatterns.book.book;

/**
 * 书籍分类(树枝节点)
 * @author liumengxi
 *
 */
public class bookType extends book {
	
	//存储书籍分类的容器
	private ArrayList<book> booList = new ArrayList<book>();

	/**
	 * 书籍分类
	 * 
	 * @param bookNo
	 * @param bookType
	 * @param bookDesc
	 */
	public bookType(String bookNo, String bookType, String bookDesc) {
		super(bookNo, bookType, bookDesc);
	}
	
	/**
	 * 增加书籍分类
	 * @param book
	 */
	public void addBookType(book book){
		
		this.booList.add(book);
		
	}
	
	public ArrayList<book> getBookListInfo(){
		return this.booList;
	}
	
	
	
	

}
