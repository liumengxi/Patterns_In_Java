package mementoPatterns;

/**
 * �鼮��Ŀ�������
 * @author liumengxi
 *
 */
public class bookCopy {
	
	 String name;
	
	 String price;
	
	public bookCopy(){
		
	}
	
	/**
	 * �����鼮����
	 * @return
	 */
	public book getBook(){
		
		return new book(this);
	
	}
	/**
	 * �ָ�ԭʼֵ
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
