package proxyPatterns.proxy;

import proxyPatterns.book.book;

/**
 * �������ģʽ
 * ���ģʽ�ж���: Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���.
 * ΪʲôҪʹ��Proxy?
 * 1������Ȩ����
 * 2����ĳ���ͻ��˲���ֱ�Ӳ�����ĳ�����󣬵��ֱ�����Ǹ���������������
 * 
 * ����ģʽ��Ҫʹ����Java�Ķ�̬������������Ҫ��ִ�У���������Ҫ�ǽ��ա�
 * ��ʵ���У�
 * qingHuaPress����Ϊ�����࣬�����տͻ��˷���������ָ�������ĸ�����ִ�з�����
 * chinaMachinePress����Ϊ�������࣬��ִ�з���
 * xinHuaPress����Ϊ�������࣬��ִ�з���
 *
 * �廪��ѧ������
 * @author liumengxi
 *
 */
public class qingHuaPress extends book {

	private book book;
	
	
	/**
	 * ʹ�ô���ģʽ������ͼ��ʱ�ɻ�е��ҵ��������� ӡˢ������
	 * �޲ι��췽����Ĭ�ϴ���chinaMachinePress(��е��ҵ��������)
	 * 
	 */
	public qingHuaPress(){
		
		this.book = new chinaMachinePress();
	}
	
	/**
	 * ����ģʽ
	 * �вι��췽�������ݴ��ݵĲ�����ָ�����������һ������������ִ�з���
	 * @param book
	 */
	public qingHuaPress(book book){
		this.book = book;
	}
	
	
	@Override
	public void pulishSomeBook() {
		
		this.book.pulishSomeBook();

	}

	@Override
	public void sellSomeBook() {
		
		this.book.sellSomeBook();

	}

	public book getBook() {
		return book;
	}

	public void setBook(book book) {
		this.book = book;
	}
	
	

}
