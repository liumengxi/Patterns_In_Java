package visitorPatterns;

import java.util.ArrayList;
import java.util.List;

import visitorPatterns.book.book;
import visitorPatterns.book.computerBook;
import visitorPatterns.book.letterBook;
import visitorPatterns.visitor.Visitor;

/**
 * ���Է�����ģʽ
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(book b : getBookList()){
			
     			b.accept(new Visitor());
			
		}
		
	}
	
	public static List<book> getBookList(){
		
		
		List<book> book = new ArrayList<book>();
		
		computerBook cb = new computerBook();
		cb.setName("������������ѧ");
		cb.setPrice("56.6");
		book.add(cb);
		
		letterBook lb = new letterBook();
		lb.setName("��¥��");
		lb.setPrice("56.8");
		book.add(lb);
		
		
		return book;
		
	}

}
