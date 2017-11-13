package singletonPatterns.lazySingleton;

/**
 * 单例模式
 * 延迟加载/懒汉模式的线程测试类
 * 打印出实例对象的hash值进行验证
 * @author liumengxi
 *
 */
public class lazySingletonThread extends Thread {
	
	public void run(){
		
		System.out.println(lazySingleton.getLazySingleton().hashCode());
	}

}
