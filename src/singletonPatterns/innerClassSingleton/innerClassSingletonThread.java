package singletonPatterns.innerClassSingleton;

/**
 * ���Ծ�̬�ڲ���ĵ���ģʽ�߳�
 * @author liumengxi
 * ��ӡʵ����hashֵ
 */
public class innerClassSingletonThread extends Thread {

	public void run(){
		
		System.out.println(innerClassSingleton.getInnerClassSingletonInstance().hashCode());
	}
}
