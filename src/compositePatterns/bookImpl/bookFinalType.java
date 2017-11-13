package compositePatterns.bookImpl;

import compositePatterns.book.book;

/**
 * 书籍的最终分类(叶子节点)
 * @author liumengxi
 *
 */
public class bookFinalType extends book {

	/**
	 * 书籍最终分类
	 * @param bookNo
	 * @param bookType
	 * @param bookDesc
	 */
	public bookFinalType(String bookNo, String bookType, String bookDesc) {
		super(bookNo, bookType, bookDesc);
	}

}
