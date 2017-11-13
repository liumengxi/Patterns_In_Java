package flyWeightPatterns.pojo;

/**
 * 书籍名称
 * 作为可共享的实现类
 * @author liumengxi
 *
 */
public class bookNames {

	
	private String name;
	
	public bookNames(String name){
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
