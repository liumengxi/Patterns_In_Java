package adapterPatterns.innerLibrary;

/**
 * �ڲ�ͼ���ϵͳ�ӿ�
 * @author liumengxi
 * 
 *
 */
public interface InnerLibrary {
	
	//ͨ��������ȡ��������鼮
	public void getComputerBookByName(String name);
	//ͨ��������ȡ��ѧ���鼮
	public void getLetterBookByName(String name);
	//ͨ��������ȡ������鼮
	public void getCookingBookByName(String name);

}
