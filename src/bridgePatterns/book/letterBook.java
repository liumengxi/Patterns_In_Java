package bridgePatterns.book;

import bridgePatterns.product.letterBookProduct;

/**
 * ��ѧ��ͼ��
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
		System.out.println("�ѳ�����ѧ��ͼ��.....");

	}

}
