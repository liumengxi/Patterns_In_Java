package adapterPatterns.innerLibrary;


/**
 * �ڲ��鼮ϵͳ��ʵ����
 * @author liumengxi
 *
 */
public class innerLibrayBooks implements InnerLibrary {

	@Override
	public void getComputerBookByName(String name) {
		
		System.out.println("���ⲿ�鼮ϵͳ��ȡ�ļ�������鼮�� "  + name);
	}

	@Override
	public void getLetterBookByName(String name) {
		
		System.out.println("���ⲿ�鼮ϵͳ��ȡ����ѧ���鼮�� " + name);
	}

	@Override
	public void getCookingBookByName(String name) {
		System.out.println("���ⲿ�鼮ϵͳ��ȡ��������鼮�� " + name);

	}

}
