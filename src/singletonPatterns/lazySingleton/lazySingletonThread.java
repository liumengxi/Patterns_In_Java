package singletonPatterns.lazySingleton;

/**
 * ����ģʽ
 * �ӳټ���/����ģʽ���̲߳�����
 * ��ӡ��ʵ�������hashֵ������֤
 * @author liumengxi
 *
 */
public class lazySingletonThread extends Thread {
	
	public void run(){
		
		System.out.println(lazySingleton.getLazySingleton().hashCode());
	}

}
