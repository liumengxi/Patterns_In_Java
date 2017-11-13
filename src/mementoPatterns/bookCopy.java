package mementoPatterns;

/**
 * 书籍类的拷贝对象
 * @author liumengxi
 *
 */
public class bookCopy {
	
	 String name;
	
	 String price;
	
	public bookCopy(){
		
	}
	
	/**
	 * 创建书籍对象
	 * @return
	 */
	public book getBook(){
		
		return new book(this);
	
	}
	/**
	 * 恢复原始值
	 * @param b
	 */
	public void setBook(book b){
		
		name = b.name;
		price = b.price;
		
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
