package singletonPatterns.innerClassSingleton;

/**
 * 测试静态内部类的单例模式线程
 * @author liumengxi
 * 打印实例的hash值
 */
public class innerClassSingletonThread extends Thread {

	public void run(){
		
		System.out.println(innerClassSingleton.getInnerClassSingletonInstance().hashCode());
	}
}
