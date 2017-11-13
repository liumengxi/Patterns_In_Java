package mementoPatterns;

import java.io.Serializable;

/**
 * �鼮��
 * �����������ģʽ
 * Memento����:
 * memento��һ����������һ�������ڲ�״̬�����Ķ���.�����Ժ�Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬.
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
