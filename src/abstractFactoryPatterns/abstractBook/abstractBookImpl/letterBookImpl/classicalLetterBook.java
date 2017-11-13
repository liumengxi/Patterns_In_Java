package abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl;

import abstractFactoryPatterns.abstractBook.abstractLetterBook;

/**
 * 古典文学书籍的实现类
 * @author liumengxi
 *
 */
public class classicalLetterBook extends abstractLetterBook {

	@Override
	public void bookTag() {
		
		System.out.println("红楼梦、西厢记、南柯一梦、牡丹亭，美如古典。");
	}

}
