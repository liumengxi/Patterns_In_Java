package adapterPatterns.innerLibrary;


/**
 * 内部书籍系统的实现类
 * @author liumengxi
 *
 */
public class innerLibrayBooks implements InnerLibrary {

	@Override
	public void getComputerBookByName(String name) {
		
		System.out.println("从外部书籍系统获取的计算机类书籍是 "  + name);
	}

	@Override
	public void getLetterBookByName(String name) {
		
		System.out.println("从外部书籍系统获取的文学类书籍是 " + name);
	}

	@Override
	public void getCookingBookByName(String name) {
		System.out.println("从外部书籍系统获取的烹饪类书籍是 " + name);

	}

}
