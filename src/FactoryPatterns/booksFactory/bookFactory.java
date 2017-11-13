package FactoryPatterns.booksFactory;

import java.util.HashMap;

import FactoryPatterns.Book.IBook;

/**
 * ����ģʽ���ṩ��������Ľӿ�
 * ����ģʽ����ƺô���
 * 1��������ʵ����ʹ��ʵ���Ĺ����ֿ���ʵ�ִ���֮�������ϡ�
 * 2������ʵ���ķ���д�빤�����У����ڶԴ����ά����
 * 3������ԡ���չ�Ը�ǿ�����ҵ���иĶ���ֻ���޸Ĺ������еĴ���ʵ���������ɡ�
 * 
 * �����鼮����Ĺ���
 * @author liumengxi
 */
public class bookFactory {

	/**
	 * �����鼮ʵ����ķ���
	 * @param <T>
	 * @param c
	 * ����Class cΪIBook�ӿڵ�����ʵ���࣬�������չ�����Լ����������ʵ�֡�
	 */
	
	/*
	 * Ϊʵ���ӳٳ�ʼ��(Lazy initialization),����һ�����IBookʵ��������,���IBook�����Ѿ���ʵ����,
	 * �ٴ��õ���ʵ���Ļ���ֱ�Ӵ��ڴ��л�ȡ������Ҫ�ٴ�ʵ������
	 * Ŀ����Ϊ�˼����ڴ�����
	 */
	private static HashMap<String,IBook> books = new HashMap<String,IBook>();
	
	
	public static <T> IBook createBook(Class<T> c){
		
		//�鼮�ӿ�
		IBook book = null;
		
		try {
			//ͨ������Ѱ��IBook,������ھͲ���Ҫ�ٴ�ʵ����
			if(books.containsKey(c.getSimpleName())){
				
				book = books.get(c.getSimpleName());
			
			}else{
				//ͨ�����䴴�������
				//ͨ��Class.forName��������������Class����
				//newInstance���ظ����һ����ʵ��
				book = (IBook) Class.forName(c.getName()).newInstance();
				//����������
				books.put(c.getSimpleName(), book);
			}
		
		} catch (InstantiationException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return book;
		
	}
	
}
