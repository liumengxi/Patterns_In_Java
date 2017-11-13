package abstractFactoryPatterns.bookEnum;

/**
 * 书籍的分类枚举
 * @author liumengxi
 *
 */
public enum bookEnum {

	/*
	 * 定义各类书籍
	 */
	HARD_WARE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl.hardWareBook"),
	SOFT_WARE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl.softWareBook"),
	CHINESE_FOOD_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl.chineseFoodBook"),
	WESTERN_FOOD_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl.westernFoodBook"),
	CLASSICAL_LETTER_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl.classicalLetterBook"),
	MODERN_LITERATURE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl.modernLiteratureBook");
	
	private String value = "";
	/**
	 * 定义构造函数，目的是Data(value)类型的匹配
	 * @param value
	 */
	private bookEnum(String value){
		this.value = value;
	}
	/**
	 * 定义get方法，获取枚举值
	 * @return
	 */
	public String getValue(){
		return this.value;
	}
	
	
}
