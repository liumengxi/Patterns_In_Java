package mediatorPatterns.saling;

import mediatorPatterns.mediator.mediator;
import mediatorPatterns.mediator.mediatorExecute;

/**
 * �����鼮�ࣨҵ���ࣩ
 * @author liumengxi
 *
 */
public class bookSaling extends mediatorExecute{
	
	
	public bookSaling(mediator me) {
		super(me);
	}

	/**
	 * ����ͼ�飨���з����������Լ����߼���
	 */
	public void saleBook(){
		
		System.out.println("����ͼ��....");
	}
	
	/**
	 * ������������Ҫͨ���н��ߴ�����֮��������ķ�����
	 * 
	 */
    public void getAllStream(){	
    	
    	super.me.excucte();//ִ���н��߷���
    	
    }

}
