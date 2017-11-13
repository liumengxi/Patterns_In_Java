package singletonPatterns.innerClassSingleton;

/**
 * �������ģʽ
 * ��̬�ڲ���ʵ�ֵ���ģʽ
 * @author liumengxi
 *
 */
public class innerClassSingleton {

	/*
	 * ��̬�ڲ���
	 */
	private static class innerClassSingletonObject{
		
		private static innerClassSingleton innerClassSingletonObject = new innerClassSingleton();
	}
	
	public static innerClassSingleton getInnerClassSingletonInstance(){
		
		return innerClassSingletonObject.innerClassSingletonObject;
	}
}
