package adapterPatterns.adapter;

import java.util.Map;

import adapterPatterns.innerLibrary.InnerLibrary;
import adapterPatterns.outLibrary.OutLibraryBooks;

/**
 * 
 * 适配器模式(adapter)
 * 旨在将两个类组织在一起，实际上是将组合方法(composition)和继承(inheritance)方法综合运用
 * 该适配器类功能是将两个图书馆系统组合一起，实现接口对接。从而可以完成本系统的需求
 * 实现内部图书馆系统通过名称从外部图书馆系统中获取书籍信息。
 * @author liumengxi
 *
 */
public class adapterBooks extends OutLibraryBooks implements InnerLibrary {

	Map<String,String> mapCom = super.ComputerBooks();
	Map<String,String> mapLetter = super.LetterBooks();
	Map<String,String> mapCooking = super.CookingBooks();
	
	@Override
	public void getComputerBookByName(String name) {
		
		System.out.println(mapCom.get(name));

	}

	@Override
	public void getLetterBookByName(String name) {
		System.out.println(mapLetter.get(name));

	}

	@Override
	public void getCookingBookByName(String name) {
		
		System.out.println(mapCooking.get(name));

	}

}
