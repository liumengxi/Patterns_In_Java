package FactoryPatterns;

import FactoryPatterns.Book.IBook;
import FactoryPatterns.Book.impl.computerBook;
import FactoryPatterns.Book.impl.cookingBook;
import FactoryPatterns.Book.impl.letterBook;
import FactoryPatterns.booksFactory.bookFactory;

/**
 * 
 * ���Թ���������ʵ��
 * ���򵥹���ģʽ��
 * ͨ��������BookFactory�еĴ����鼮��������ʵ�������󡣣����������ݵĲ���ֵ��������ʵ������
 * 
 * @author liumengxi
 */
public class Run {

	/**
	 * ͨ���������������鼮���������䷽��
	 */
	public static void main(String[] args) {

		/*
		 * ��������鼮
		 * 
		 */
		IBook computerBook = bookFactory.createBook(computerBook.class);
		computerBook.Price();
		computerBook.Apply();
		computerBook.BookType();
		
		System.out.println("-----------------------------------------");
		/*
		 * ��ѧ���鼮
		 */
		IBook letterBook = bookFactory.createBook(letterBook.class);
		letterBook.Price();
		letterBook.Apply();
		letterBook.BookType();
		
		
		System.out.println("-----------------------------------------");
		/*
		 *������鼮
		 */
		IBook cookingBook = bookFactory.createBook(cookingBook.class);
		cookingBook.Price();
		cookingBook.Apply();
		cookingBook.BookType();
		
		System.out.println("-----------------------------------------");
		
		
		
	}

}
