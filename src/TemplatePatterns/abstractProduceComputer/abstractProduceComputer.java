package TemplatePatterns.abstractProduceComputer;

/**
 * ģ�����ģʽ(Template)
 * ����һ���������㷨�ĹǼܣ���һЩ�����ִ���ӳٵ��������С���ʵjava�ĳ����౾������Templateģʽ
 * �������Եĳ�����
 * @author liumengxi
 *
 */
public abstract class abstractProduceComputer {


	//������ʾ��
	protected abstract void produceScreen(); 
	
	//��������
	protected abstract void produceWaiShe();
	
	//��������
	protected abstract void produceZhuJ();
	
	/**
	 * ���ӷ��������������д�÷�����
	 * ���ݴ˷������ж������Ƿ��������衣
	 * @return
	 */
	protected boolean isProduceWaiShe(){
		
		return true;
	}
	
	/**
	 * ��������
	 * ģ�巽��ģʽ
	 * �������������Ե�˳�򣬴˷���Ϊfinal�������޷��޸ĸ��࣬��������ͽ���ģ�巽��
	 * produceWaiShe��produceZhuJ��produceScreen�������������������ʵ�ֵģ����Ҷ�Ӧ��ͬ���࣬��������������
	 * ����������Ϊ���֣�
	 * ��������ʵ�ֵķ������������巽����
	 * ������û��ʵ�֣�����ʵ�ֵķ������������󷽷���
	 * ������ʵ�ֵķ��������������д�ģ����������ӷ�����
	 * 
	 */
	public final void produceComputer(){
		//���ݿͻ��������ж������Ʒ�Ƿ�����
		if(this.isProduceWaiShe()){
			
			this.produceWaiShe();
		}
		
		this.produceZhuJ();
		
		this.produceScreen();
		
	}
	
	
	
	
}
