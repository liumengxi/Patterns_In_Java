package bridgePatterns.book;

import bridgePatterns.product.letterBookProduct;

/**
 * 文学类图书
 * @author liumengxi
 *
 */
public class letterBook extends book {

	public letterBook(letterBookProduct letterPro) {
		super(letterPro);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sellBook() {
		
		super.sellBook();
		System.out.println("已出售文学类图书.....");

	}

}
