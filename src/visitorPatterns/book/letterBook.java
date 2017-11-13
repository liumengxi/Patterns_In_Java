package visitorPatterns.book;

import visitorPatterns.visitor.IVisitor;

/**
 * ��ѧ���鼮ʵ����
 * @author liumengxi
 *
 */
public class letterBook extends book {
	
    private String name;
	
	private String price;

	/**
	 * ���������߷���
	 */
	@Override
	public void accept(IVisitor iv) {
		
		iv.visit(this);
		
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
		return "letterBook [name=" + name + ", price=" + price + "]";
	}
	
	
	

}