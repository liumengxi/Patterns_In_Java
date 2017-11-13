package abstractFactoryPatterns.bookAbstractFactory;

import abstractFactoryPatterns.book.IBook;
import abstractFactoryPatterns.bookEnum.bookEnum;
import abstractFactoryPatterns.bookFactory.bookFactory;

/**
 * ���󹤳��ࣺ�ṩ��������ʵ���ĳ�����
 * ���󹤳�����ŵ㣺
 * 1������������ʵ���ķ�����ȡ���ڳ�������ʵ�֣��������רע�ں�ʱ����ʵ��������ע�����ʵ������
 * ������ͬ�Ĳ��ַ�װ�ڳ������У��ṩ���ֲ�ͬ������ʵ�֣�
 * 2��ʵ���˳����������
 * 3������ά������չ
 * 
 * ��������鼮�ĳ��󹤳���
 * @author liumengxi
 * �ó��󹤳�ͨ��ʹ�����ṩ��ö�����ͽ���ʵ��������
 *
 */
public abstract class bookAbstractFactory implements bookFactory {

	/**
	 * ��������鼮
	 * @param bookenum
	 * �鼮ö��
	 */
	public IBook createBook(bookEnum bookenum) {
		
		//�����鼮
		IBook book = null;

		if(bookenum.getValue() != null){
			
			try {
				book = (IBook) Class.forName(bookenum.getValue()).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		return book;
	}



}
