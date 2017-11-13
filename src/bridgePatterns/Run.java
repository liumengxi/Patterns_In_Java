package bridgePatterns;

import bridgePatterns.book.book;
import bridgePatterns.book.computerBook;
import bridgePatterns.book.letterBook;
import bridgePatterns.product.computerBookProduct;
import bridgePatterns.product.letterBookProduct;

/**
 * ≤‚ ‘«≈¡∫ƒ£ Ω
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		computerBookProduct comBookPro = new computerBookProduct();
		
		letterBookProduct letterPro = new letterBookProduct();
		
		book comBook = new computerBook(comBookPro);
		
		book letterBook = new letterBook(letterPro);
		
		comBook.sellBook();
		
		System.out.println("-*-----*-------*----");
		
		letterBook.sellBook();
		
		
		

	}

}
