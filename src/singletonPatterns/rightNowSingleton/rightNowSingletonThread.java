package singletonPatterns.rightNowSingleton;

/**
 * ���Ե���ģʽ
 * ��������/����ģʽ�߳�
 * @author liumengxi
 *
 */
public class rightNowSingletonThread extends Thread {
	
	public void run(){
		//��ӡ��ʵ�������hashֵ
		System.out.println(rightNowSingleton.getrightNowSingletonIntance().hashCode());
		
	}

}
