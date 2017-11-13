package iteratorPatterns.book;

import iteratorPatterns.iterator.IBookIterator;
import iteratorPatterns.iterator.bookIterator;

import java.util.ArrayList;

/**
 * 书籍类
 * @author liumengxi
 *
 */
public class book {
	
	
	private String name ;
	private String price;
	
	private ArrayList<book> bookList = new ArrayList<book>();
	
	public book(){
		
	}
	public book(String name,String price){
		this.name = name;
		this.price = price;
	}
	
	
	//增加圖書
	public void add(String name,String price){
	this.bookList.add(new book(name,price));
	}
	
	//产生一个遍历对象
	public IBookIterator iterator(){
	return new bookIterator(this.bookList);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	

}
