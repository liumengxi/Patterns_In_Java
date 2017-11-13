package singletonPatterns.lazySingleton;

/**
 * 单例设计模式
 * 延迟加载/懒汉模式
 * @author liumengxi
 * 饱汉模式：不用迫切去的实例化对象，只有需要使用到该对象的时候才去实例化此对象。
 * 如：调用getLazySingleton()方法，才会new出该实例对象。
 * 使用DCL双检查机制实现多线程环境中的单例设计模式
 *
 */
public class lazySingleton {
	
	private static lazySingleton lazySlt = null;
	
	private lazySingleton(){
		
	}
	
    public  static lazySingleton getLazySingleton(){
    	
    	synchronized(lazySingleton.class){
    		if(lazySlt == null){
          			lazySlt = new lazySingleton();
    	  }
    	}
    	return lazySlt;
    }
}
