package mementoPatterns;

import java.io.Serializable;

/**
 * 书籍类
 * 备忘机制设计模式
 * Memento定义:
 * memento是一个保存另外一个对象内部状态拷贝的对象.这样以后就可以将该对象恢复到原先保存的状态.
 * @author liumengxi
 *
 */
@SuppressWarnings("serial")
class book implements Serializable{
	
	String name;
	String price;
	
	public book(){}
	
	
	public book(bookCopy bc){
		name = bc.name;
		price = bc.price;
		
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
	
	

}
