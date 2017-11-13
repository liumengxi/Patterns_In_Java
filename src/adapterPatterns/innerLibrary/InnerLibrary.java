package adapterPatterns.innerLibrary;

/**
 * 内部图书馆系统接口
 * @author liumengxi
 * 
 *
 */
public interface InnerLibrary {
	
	//通过书名获取计算机类书籍
	public void getComputerBookByName(String name);
	//通过书名获取文学类书籍
	public void getLetterBookByName(String name);
	//通过书名获取烹饪类书籍
	public void getCookingBookByName(String name);

}
