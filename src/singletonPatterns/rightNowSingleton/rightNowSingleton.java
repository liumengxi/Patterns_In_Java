package singletonPatterns.rightNowSingleton;

/**
 * �������ģʽ
 * ��������/����ģʽ
 * @author liumengxi
 * ����ģʽ������˼�壬�������ʵ�����Ƚ��ż�������ĳ�ʼ��ʱ��ȥʵ��������
 *
 */
public class rightNowSingleton {

	private static rightNowSingleton rnSingleton = new rightNowSingleton();
	
	private rightNowSingleton(){
		
	}
	
	public static rightNowSingleton getrightNowSingletonIntance(){
		
		return rnSingleton;
	}
	
}
