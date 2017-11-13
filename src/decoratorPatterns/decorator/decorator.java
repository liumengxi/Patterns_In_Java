package decoratorPatterns.decorator;

import decoratorPatterns.abstractBook.book;

/**
 * װ�γ�����
 * Decorator(װ��ģʽ)����:��̬��һ���������һЩ�����ְ�𣬾�������ǽ��ˢ���ᣬ
 * ʹ��Decoratorģʽ������������෽ʽ�ﵽ���ܵ������Եĸ�����
 * ʹ��Decorator��������:��Щ������Ҫ���û���̬��������ķ�ʽ��ʱ��.
 * Decorator�ṩ��"���弴��"�ķ���,�������ڼ������ʱ���Ӻ��ֹ���.
 * װ�����ǶԼ̳е��������䣬�̳п��Խ��ʵ�����⣬������Ŀ����Ҫ���ǵ������ԡ������ԡ�
 * ��չ�ԡ�����װ��ģʽ��������̳У���̬�����ӹ��ܡ�
 * @author liumengxi
 *
 */
public abstract class decorator extends book{
	
	private book b;
	
	/**
	 * װ����Ĺ��캯��
	 * ����װ����һ��ͼ����
	 * �ڹ�������ʹ�����new��ʽ,����book����;
	 * @param b
	 */
	public decorator(book b){
		this.b = b;
	}
	
	
	public void publish(){
		
		this.b.publish();
	
	}

}
