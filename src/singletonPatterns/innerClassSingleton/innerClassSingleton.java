package singletonPatterns.innerClassSingleton;

/**
 * 单例设计模式
 * 静态内部类实现单例模式
 * @author liumengxi
 *
 */
public class innerClassSingleton {

	/*
	 * 静态内部类
	 */
	private static class innerClassSingletonObject{
		
		private static innerClassSingleton innerClassSingletonObject = new innerClassSingleton();
	}
	
	public static innerClassSingleton getInnerClassSingletonInstance(){
		
		return innerClassSingletonObject.innerClassSingletonObject;
	}
}
