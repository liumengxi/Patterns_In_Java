package bridgePatterns.book;

import bridgePatterns.product.computerBookProduct;

/**
 * �������ͼ��
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
		System.out.println("�ѳ��ۼ������ͼ��.....");

	}

}
