package mediatorPatterns.mediator;

/**
 * �н��߳���ִ����(ÿһ����ɫ��֪���н��߽�ɫ�������������Ľ�ɫͨ�ŵ�ʱ��
 * һ��Ҫͨ���н��߽�ɫЭ��)
 * Ϊ�˽����н����Ļ��ࡣ
 * @author liumengxi
 *
 */
public abstract class mediatorExecute {

	protected mediator me;
	
	public mediatorExecute(mediator me){
		
		this.me = me;
	}
	
}
