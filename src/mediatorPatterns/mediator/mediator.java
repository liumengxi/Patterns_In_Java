package mediatorPatterns.mediator;

import mediatorPatterns.producer.bookProducer;
import mediatorPatterns.saling.bookSaling;

/**
 * �н��߳�����(�����н��ߣ�Mediator����ɫ�������н��߽�ɫ����ͳһ�Ľӿ����ڸ���ɫ֮���ͨ�š�)
 * ��һЩ����ϵ��ҵ�����װ������������϶�
 * �н������ģʽ��
 * ��һ���н��������װһϵ�й��ڶ��󽻻���Ϊ.
 * 
 * Ϊ��ʹ��Mediator?
 * ��������֮��Ľ��������ǳ���;ÿ���������Ϊ�����������˴˶Է�,�޸�һ���������Ϊ,ͬʱ���漰���޸ĺܶ������������Ϊ,���ʹ��Mediatorģʽ
 * ,����ʹ���������������ɢ,ֻ����ĺ� Mediator�Ĺ�ϵ,ʹ��Զ�Ĺ�ϵ�����һ�Զ�Ĺ�ϵ,���Խ���ϵͳ�ĸ�����,��߿��޸���չ��.
 *  Mediatorģʽ���¼�������Ӧ���бȽ϶�,����������GUI.;����,��Ϣ���ݵ�,
 * @author liumengxi
 *
 *  ʲô�����ʹ���н���ģʽ:
 * 1�� N ������֮��������໥��������ϵ������N ����2��ע�����໥��������
 * 2�� ���������������ϵ��������������Ϊ�в�ȷ�������з����ı�Ŀ��ܣ������������һ�㽨���
 *  ���н���ģʽ�����ͱ������ķ�����ɢ��
 * 3�� ��Ʒ����������һ�����Ե����Ӿ���MVC ��ܣ������Ӧ�õ���Ʒ�У�����������Ʒ�����ܺ���չ
 * �ԣ�������Ϊ��Ŀ������δ�أ���Ŀ���Խ���Ͷ��ΪĿ�꣬����Ʒ���ȶ�����Ч����չΪ��ּ��
 *  
 *
 */
public  abstract class mediator {
	
	public mediator(){
		bp = new bookProducer(this);
		bs = new bookSaling(this);
	}
     
	 public  bookProducer bp ; 
	 
	 public  bookSaling bs;
	 
	 
	 public abstract void excucte();


	public bookProducer getBp() {
		return bp;
	}


	public void setBp(bookProducer bp) {
		this.bp = bp;
	}


	public bookSaling getBs() {
		return bs;
	}


	public void setBs(bookSaling bs) {
		this.bs = bs;
	}
	
	
	 

}
