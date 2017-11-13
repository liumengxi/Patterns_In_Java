package adapterPatterns.adapter;

import java.util.Map;

import adapterPatterns.innerLibrary.InnerLibrary;
import adapterPatterns.outLibrary.OutLibraryBooks;

/**
 * 
 * ������ģʽ(adapter)
 * ּ�ڽ���������֯��һ��ʵ�����ǽ���Ϸ���(composition)�ͼ̳�(inheritance)�����ۺ�����
 * ���������๦���ǽ�����ͼ���ϵͳ���һ��ʵ�ֽӿڶԽӡ��Ӷ�������ɱ�ϵͳ������
 * ʵ���ڲ�ͼ���ϵͳͨ�����ƴ��ⲿͼ���ϵͳ�л�ȡ�鼮��Ϣ��
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
