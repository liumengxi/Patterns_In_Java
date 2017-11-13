package abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl;

import abstractFactoryPatterns.abstractBook.abstractCookingBook;

/**
 * 西餐类书籍的实现类
 * @author liumengxi
 *
 */
public class westernFoodBook extends abstractCookingBook {

	@Override
	public void bookTag() {
		
		System.out.println("西餐类书籍");

	}

}
