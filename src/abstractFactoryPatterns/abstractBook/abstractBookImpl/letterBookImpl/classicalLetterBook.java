package abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl;

import abstractFactoryPatterns.abstractBook.abstractLetterBook;

/**
 * �ŵ���ѧ�鼮��ʵ����
 * @author liumengxi
 *
 */
public class classicalLetterBook extends abstractLetterBook {

	@Override
	public void bookTag() {
		
		System.out.println("��¥�Ρ�����ǡ��Ͽ�һ�Ρ�ĵ��ͤ������ŵ䡣");
	}

}
