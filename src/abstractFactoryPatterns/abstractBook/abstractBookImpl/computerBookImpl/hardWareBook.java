package abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl;

import abstractFactoryPatterns.abstractBook.abstractComputerBook;

/**
 * Ӳ���鼮��ʵ����
 * @author liumengxi
 *
 */
public class hardWareBook extends abstractComputerBook {

	@Override
	public void bookTag() {
		
		System.out.println("������Ӳ������鼮��");

	}

}
