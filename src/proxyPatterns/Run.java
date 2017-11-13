package proxyPatterns;

import proxyPatterns.proxy.qingHuaPress;
import proxyPatterns.proxy.xinHuaPress;

/**
 * 测试代理模式
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*实例化清华大学出版社对象，对图书进行印刷出售。但实际上此处是使用其代理类，
		 * chinaMachinePress类（机械工业出版社）进行操作。
         * 无参构造方法进行实例化对象
		 * */
		qingHuaPress qhp = new qingHuaPress();
		qhp.pulishSomeBook();
		qhp.sellSomeBook();
		
		System.out.println("**************************************");
		
		/*实例化清华大学出版社对象，对图书进行印刷出售。但实际上此处是使用其代理类，
		 * xinHuaPress类(新华书局出版社)进行操作。
		 * 有参构造方法进行实例化对象
		 */
		xinHuaPress xhp = new xinHuaPress();
		qingHuaPress qhpx = new qingHuaPress(xhp);
		qhpx.pulishSomeBook();
		qhpx.sellSomeBook();
		

	}

}
