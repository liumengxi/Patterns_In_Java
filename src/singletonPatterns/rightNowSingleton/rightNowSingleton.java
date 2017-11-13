package singletonPatterns.rightNowSingleton;

/**
 * 单例设计模式
 * 立即加载/饿汉模式
 * @author liumengxi
 * 饿汉模式：顾名思义，创建类的实例化比较着急，在类的初始化时就去实例化对象。
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
