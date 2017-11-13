package abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl;

import abstractFactoryPatterns.abstractBook.abstractLetterBook;

/**
 * 近代文学的实现类
 * @author liumengxi
 *
 */
public class modernLiteratureBook extends abstractLetterBook {

	@Override
	public void bookTag() {

		System.out.println("鲁郭茅巴老曹的作品耐人寻味....");
	}

}
