package mediatorPatterns.producer;

import mediatorPatterns.mediator.mediator;
import mediatorPatterns.mediator.mediatorExecute;


/**
 * �����鼮��ҵ���ࣩ
 * @author liumengxi
 *
 */
public class bookProducer extends mediatorExecute {
	


	/**
	 * ע���н�����
	 * @param me
	 */
	public bookProducer(mediator me) {
		super(me);
	}

	/**
	 * ����ͼ�飨���з����������Լ����߼���
	 */
	public void bookProduce(){
		
		System.out.println("����ͼ��...");
	}
	/**
	 * ������������Ҫͨ���н��ߴ�����֮��������ķ�����
	 * 
	 */
    public void getAllStream(){	
    	
    	super.me.excucte();//ִ���н��߷���
    	
    }
	
}
