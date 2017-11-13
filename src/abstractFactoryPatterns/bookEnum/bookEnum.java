package abstractFactoryPatterns.bookEnum;

/**
 * �鼮�ķ���ö��
 * @author liumengxi
 *
 */
public enum bookEnum {

	/*
	 * ��������鼮
	 */
	HARD_WARE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl.hardWareBook"),
	SOFT_WARE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.computerBookImpl.softWareBook"),
	CHINESE_FOOD_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl.chineseFoodBook"),
	WESTERN_FOOD_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.cookingBookImpl.westernFoodBook"),
	CLASSICAL_LETTER_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl.classicalLetterBook"),
	MODERN_LITERATURE_BOOK("abstractFactoryPatterns.abstractBook.abstractBookImpl.letterBookImpl.modernLiteratureBook");
	
	private String value = "";
	/**
	 * ���幹�캯����Ŀ����Data(value)���͵�ƥ��
	 * @param value
	 */
	private bookEnum(String value){
		this.value = value;
	}
	/**
	 * ����get��������ȡö��ֵ
	 * @return
	 */
	public String getValue(){
		return this.value;
	}
	
	
}
