package adapterPatterns.outLibrary;

import java.util.Map;

/**
 * �ⲿͼ���ϵͳ�ӿ�
 * @author liumengxi
 *  
 *
 */
public interface  OutLibrary{
	
	//��������鼮
	public Map<String,String> ComputerBooks();
	//��ѧ���鼮
    public Map<String,String> LetterBooks();
	//������鼮
	public Map<String,String> CookingBooks();

}
