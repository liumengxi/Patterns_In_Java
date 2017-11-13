package FactoryPatterns;

import FactoryPatterns.Book.IBook;
import FactoryPatterns.Book.impl.computerBook;
import FactoryPatterns.Book.impl.cookingBook;
import FactoryPatterns.Book.impl.letterBook;
import FactoryPatterns.booksFactory.bookFactory;

/**
 * 
 * 测试工厂方法的实现
 * （简单工厂模式）
 * 通过工厂类BookFactory中的创建书籍方法进行实例化对象。（根据所传递的参数值，来进行实例化）
 * 
 * @author liumengxi
 */
public class Run {

	/**
	 * 通过工厂方法创建书籍，并调用其方法
	 */
	public static void main(String[] args) {

		/*
		 * 计算机类书籍
		 * 
		 */
		IBook computerBook = bookFactory.createBook(computerBook.class);
		computerBook.Price();
		computerBook.Apply();
		computerBook.BookType();
		
		System.out.println("-----------------------------------------");
		/*
		 * 文学类书籍
		 */
		IBook letterBook = bookFactory.createBook(letterBook.class);
		letterBook.Price();
		letterBook.Apply();
		letterBook.BookType();
		
		
		System.out.println("-----------------------------------------");
		/*
		 *烹饪类书籍
		 */
		IBook cookingBook = bookFactory.createBook(cookingBook.class);
		cookingBook.Price();
		cookingBook.Apply();
		cookingBook.BookType();
		
		System.out.println("-----------------------------------------");
		
		
		
	}

}
