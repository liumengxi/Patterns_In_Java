package singletonPatterns.rightNowSingleton;

/**
 * 测试单例模式
 * 立即加载/饿汉模式线程
 * @author liumengxi
 *
 */
public class rightNowSingletonThread extends Thread {
	
	public void run(){
		//打印出实例对象的hash值
		System.out.println(rightNowSingleton.getrightNowSingletonIntance().hashCode());
		
	}

}
