package abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl;

import abstractFactoryPatterns.abstractBook.abstractCookingBook;

/**
 * �������鼮��ʵ����
 * @author liumengxi
 *
 */
public class westernFoodBook extends abstractCookingBook {

	@Override
	public void bookTag() {
		
		System.out.println("�������鼮");

	}

}
