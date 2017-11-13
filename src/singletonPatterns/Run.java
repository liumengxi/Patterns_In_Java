package singletonPatterns;

import singletonPatterns.innerClassSingleton.innerClassSingletonThread;
import singletonPatterns.lazySingleton.lazySingletonThread;
import singletonPatterns.rightNowSingleton.rightNowSingletonThread;

public class Run {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/**
		 * 测试饿汉模式单例
		 * 循环创建饿汉模式线程，打印出该对象的hash值，五个对象的hash值均是一致的。 
		 *
		 */
		System.out.println("测试立即加载/饿汉模式单例示例");
		Thread [] thread = new Thread[5];
		rightNowSingletonThread[] r = new rightNowSingletonThread[5];
		for(int i = 0; i < 5; i++){
			
            r[i] = new rightNowSingletonThread(); 
			thread[i] = new Thread(r[i]);
			thread[i].start();
		}				
		
		
		Thread.sleep(5000);
		
		/**
		 * 测试懒汉模式单例
		 * 循环创建懒汉模式线程，打印hash值
		 * 
		 * ##注意一点##：
		 * 此处如果延迟加载/饱汉模式中的获取实例方法如果没有添加同步关键字的话，多线程并发的时候，会出现
		 * hash值不一致的情况，也就是说，延迟加载/懒汉模式的单例在多线程并发环境下，并不严谨，会出现多实例的情况。
		 * 如果要解决这个问题：需要在创建实例的方法中加上synchronized关键字进行同步。
		 * 实现方法详见 lazySingleton类中的getLazySingleton()方法中的同步实现
		 * 为提高效率，此处使用的同步机制是代码块的形式。并使用双检查机制(DCL)
		 * 
		 */
		System.out.println("测试延迟加载/懒汉模式单例示例");
		Thread [] threadLazy = new Thread[5];
		lazySingletonThread [] lazySlt = new lazySingletonThread[5];
		for(int i = 0; i < 5; i ++){
			lazySlt[i] = new lazySingletonThread();
			threadLazy[i] = new Thread(lazySlt[i]);
			threadLazy[i].start();
		}
		
		
		Thread.sleep(5000);
		/**
		 * 测试静态内部类的单例设计模式
		 * 创建多线程并发访问
		 */
		System.out.println("测试静态内部类单例示例");
		Thread [] innerThread = new Thread[5];
		innerClassSingletonThread []innClassSlt = new innerClassSingletonThread[5];
		for(int i = 0 ; i < 5; i ++){
			innClassSlt[i] = new innerClassSingletonThread();
			innerThread[i] = new Thread(innClassSlt[i]);
			innerThread[i].start();
			
		}

	}

}
