package proxyPatterns;

import proxyPatterns.proxy.qingHuaPress;
import proxyPatterns.proxy.xinHuaPress;

/**
 * ���Դ���ģʽ
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*ʵ�����廪��ѧ��������󣬶�ͼ�����ӡˢ���ۡ���ʵ���ϴ˴���ʹ��������࣬
		 * chinaMachinePress�ࣨ��е��ҵ�����磩���в�����
         * �޲ι��췽������ʵ��������
		 * */
		qingHuaPress qhp = new qingHuaPress();
		qhp.pulishSomeBook();
		qhp.sellSomeBook();
		
		System.out.println("**************************************");
		
		/*ʵ�����廪��ѧ��������󣬶�ͼ�����ӡˢ���ۡ���ʵ���ϴ˴���ʹ��������࣬
		 * xinHuaPress��(�»���ֳ�����)���в�����
		 * �вι��췽������ʵ��������
		 */
		xinHuaPress xhp = new xinHuaPress();
		qingHuaPress qhpx = new qingHuaPress(xhp);
		qhpx.pulishSomeBook();
		qhpx.sellSomeBook();
		

	}

}
