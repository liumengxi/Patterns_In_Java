package adapterPatterns.outLibrary;

import java.util.Map;

/**
 * 外部图书馆系统接口
 * @author liumengxi
 *  
 *
 */
public interface  OutLibrary{
	
	//计算机类书籍
	public Map<String,String> ComputerBooks();
	//文学类书籍
    public Map<String,String> LetterBooks();
	//烹饪类书籍
	public Map<String,String> CookingBooks();

}
