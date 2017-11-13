package bridgePatterns.product;

/**
 * 桥梁模式，将抽象和行为分开来
 * 抽象生产类(此类属于桥梁模式中的行为)
 * @author liumengxi
 *
 */
public abstract class product {

	//寻找出版社
	public abstract void findBookMaker();
	//印刷图书
	public abstract void publish();
	
	
}
