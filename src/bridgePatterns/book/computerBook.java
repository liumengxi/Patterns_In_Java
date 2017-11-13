package bridgePatterns.book;

import bridgePatterns.product.computerBookProduct;

/**
 * 计算机类图书
 * @author liumengxi
 *
 */
public class computerBook extends book {

	
	public computerBook(computerBookProduct comPro) {
		super(comPro);
	}

	@Override
	public void sellBook() {
		
		super.sellBook();
		System.out.println("已出售计算机类图书.....");

	}

}
