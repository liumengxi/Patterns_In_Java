package abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl;

import abstractFactoryPatterns.abstractBook.abstractComputerBook;

/**
 * ������鼮��ʵ����
 * @author liumengxi
 *
 */
public class softWareBook extends abstractComputerBook {

	@Override
	public void bookTag() {
		
		System.out.println("softWare's book change the world ...");

	}

}
