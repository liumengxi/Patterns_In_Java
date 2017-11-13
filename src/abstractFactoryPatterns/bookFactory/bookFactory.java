package abstractFactoryPatterns.bookFactory;

import abstractFactoryPatterns.book.IBook;

/**
 * 出版书籍的接口
 * @author liumengxi
 *
 */
public interface bookFactory {
	
	/*
	 * 出版各类书籍
	 */
	public IBook createHardWareBook();
	public IBook createSoftWareBook();
	public IBook createClassicalLetterBook();
	public IBook createModernLetterBook();
	public IBook createChineseCookingBook();
	public IBook createWesternCookingBook();

}
