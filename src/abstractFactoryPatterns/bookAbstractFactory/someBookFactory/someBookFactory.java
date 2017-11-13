package abstractFactoryPatterns.bookAbstractFactory.someBookFactory;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookAbstractFactory.bookAbstractFactory;
import abstractFactoryPatterns.bookEnum.bookEnum;

/**
 * 出版各类图书的工厂类
 * @author liumengxi
 *
 */
public class someBookFactory extends bookAbstractFactory {

	/**
	 * 出版硬件类图书
	 */
	@Override
	public IBook createHardWareBook() {
		return super.createBook(bookEnum.HARD_WARE_BOOK);
	}
	
    /**
     * 出版软件类图书
     */
	@Override
	public IBook createSoftWareBook() {
		return super.createBook(bookEnum.SOFT_WARE_BOOK);
	}
    /**
     * 出版古典文学类图书
     */
	@Override
	public IBook createClassicalLetterBook() {
		return super.createBook(bookEnum.CLASSICAL_LETTER_BOOK);
	}

	/**
	 * 出版近代文学类图书
	 */
	@Override
	public IBook createModernLetterBook() {
		return super.createBook(bookEnum.MODERN_LITERATURE_BOOK);
	}
    /**
     * 出版中餐类烹饪图书
     */
	@Override
	public IBook createChineseCookingBook() {
		return super.createBook(bookEnum.CHINESE_FOOD_BOOK);
	}
    /**
     * 出版西餐类烹饪图书
     */
	@Override
	public IBook createWesternCookingBook() {
		return super.createBook(bookEnum.WESTERN_FOOD_BOOK);
	}



}
