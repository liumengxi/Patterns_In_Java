package abstractFactoryPatterns.bookAbstractFactory.someBookFactory;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookAbstractFactory.bookAbstractFactory;
import abstractFactoryPatterns.bookEnum.bookEnum;

/**
 * �������ͼ��Ĺ�����
 * @author liumengxi
 *
 */
public class someBookFactory extends bookAbstractFactory {

	/**
	 * ����Ӳ����ͼ��
	 */
	@Override
	public IBook createHardWareBook() {
		return super.createBook(bookEnum.HARD_WARE_BOOK);
	}
	
    /**
     * ���������ͼ��
     */
	@Override
	public IBook createSoftWareBook() {
		return super.createBook(bookEnum.SOFT_WARE_BOOK);
	}
    /**
     * ����ŵ���ѧ��ͼ��
     */
	@Override
	public IBook createClassicalLetterBook() {
		return super.createBook(bookEnum.CLASSICAL_LETTER_BOOK);
	}

	/**
	 * ���������ѧ��ͼ��
	 */
	@Override
	public IBook createModernLetterBook() {
		return super.createBook(bookEnum.MODERN_LITERATURE_BOOK);
	}
    /**
     * �����в������ͼ��
     */
	@Override
	public IBook createChineseCookingBook() {
		return super.createBook(bookEnum.CHINESE_FOOD_BOOK);
	}
    /**
     * �������������ͼ��
     */
	@Override
	public IBook createWesternCookingBook() {
		return super.createBook(bookEnum.WESTERN_FOOD_BOOK);
	}



}
