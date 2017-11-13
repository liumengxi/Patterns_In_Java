package bridgePatterns.product;

/**
 * 印刷计算机类图书
 * @author liumengxi
 *
 */
public class computerBookProduct extends product {

	@Override
	public void findBookMaker() {
		
		System.out.println("寻求计算机类图书出版社--->机械工业出版社");

	}

	@Override
	public void publish() {
		
		System.out.println("出版计算机类图书....");

	}

}
