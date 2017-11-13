package abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl;

import abstractFactoryPatterns.abstractBook.abstractCookingBook;

/**
 * 中餐类书籍的实现类
 * @author liumengxi
 *
 */
public class chineseFoodBook extends abstractCookingBook {

	@Override
	public void bookTag() {

		System.out.println("形形色色的中餐类书籍：粤菜、湘菜、中原菜....");

	}

}
