package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 * 出版者装饰类
 * @author liumengxi
 *
 */
public class bookMakerDecorator extends decorator {

	public bookMakerDecorator(book b) {
		super(b);
	}
	
	public void bookMarkerDecorator(){
		
		System.out.println("机械工业出版社");
	}

	
	/**
	 * 出版图书
	 */
	@Override
	public void publish(){
		this.bookMarkerDecorator();
		super.publish();
	}
}
