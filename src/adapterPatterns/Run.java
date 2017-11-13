package adapterPatterns;

import adapterPatterns.adapter.adapterBooks;
import adapterPatterns.innerLibrary.InnerLibrary;

/**
 * ≤‚ ‘  ≈‰∆˜
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InnerLibrary ilb = new adapterBooks();
		
		ilb.getComputerBookByName("Java");
		
		ilb.getCookingBookByName("cooking");
		
		ilb.getLetterBookByName("letter");

	}

}
