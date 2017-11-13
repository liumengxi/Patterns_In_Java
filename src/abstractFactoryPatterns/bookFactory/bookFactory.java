package abstractFactoryPatterns.bookFactory;

import abstractFactoryPatterns.book.IBook;

/**
 * �����鼮�Ľӿ�
 * @author liumengxi
 *
 */
public interface bookFactory {
	
	/*
	 * ��������鼮
	 */
	public IBook createHardWareBook();
	public IBook createSoftWareBook();
	public IBook createClassicalLetterBook();
	public IBook createModernLetterBook();
	public IBook createChineseCookingBook();
	public IBook createWesternCookingBook();

}
