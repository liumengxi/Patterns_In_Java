package abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl;

import abstractFactoryPatterns.abstractBook.abstractLetterBook;

/**
 * ������ѧ��ʵ����
 * @author liumengxi
 *
 */
public class modernLiteratureBook extends abstractLetterBook {

	@Override
	public void bookTag() {

		System.out.println("³��é���ϲܵ���Ʒ����Ѱζ....");
	}

}
