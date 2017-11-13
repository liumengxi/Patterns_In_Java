package abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl;

import abstractFactoryPatterns.abstractBook.abstractComputerBook;

/**
 * 硬件书籍的实现类
 * @author liumengxi
 *
 */
public class hardWareBook extends abstractComputerBook {

	@Override
	public void bookTag() {
		
		System.out.println("我属于硬件类的书籍。");

	}

}
