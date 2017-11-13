package bridgePatterns.product;

/**
 * 出版文学类图书
 * @author liumengxi
 *
 */
public class letterBookProduct extends product {

	@Override
	public void findBookMaker() {
		
		System.out.println("寻找文学类图书出版社-->新华书局");

	}

	@Override
	public void publish() {
		
		System.out.println("出版文学类图书....");

	}

}
