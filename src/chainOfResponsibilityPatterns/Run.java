package chainOfResponsibilityPatterns;

import java.util.ArrayList;

import chainOfResponsibilityPatterns.book.book;
import chainOfResponsibilityPatterns.handler.findProducerHandler;
import chainOfResponsibilityPatterns.handler.pulishPaperHandler;
import chainOfResponsibilityPatterns.handler.sellingBookHandler;


/**
 * 测试责任链设计模式
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<book> arrayListBook = new ArrayList<book>();
		
		arrayListBook.add(new book(1, ""));
		arrayListBook.add(new book(2, ""));
		arrayListBook.add(new book(3, ""));
		
		
		findProducerHandler fph = new findProducerHandler();
		pulishPaperHandler pph = new pulishPaperHandler();
		sellingBookHandler sbh = new sellingBookHandler();
		
		fph.setNestHandler(pph);
		pph.setNestHandler(sbh);
		
		for(book book: arrayListBook){
			
			fph.handlerMessage(book);
		}
		

	}

}
