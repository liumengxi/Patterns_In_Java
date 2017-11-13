package TemplatePatterns.ProduceComputerImpl;

import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * ƻ������������
 * @author liumengxi
 *
 */
public class AppleCompany extends abstractProduceComputer{
	
	private boolean isProduceWaiShe = true;

	@Override
	protected void produceScreen() {
		System.out.println("����apply������Ļ");
		
	}

	@Override
	protected void produceWaiShe() {
		System.out.println("����apply�������,���");
		
	}

	@Override
	protected void produceZhuJ() {
		System.out.println("����apply����");
		
	}
	/**
	 * ��д���ӷ���
	 * �ɸù�˾�����Ƿ���������
	 */
	@Override
	protected boolean isProduceWaiShe(){
		
		return this.isProduceWaiShe;
	}

	//�ṩset���������ӷ��������ù�˾�Ƿ���������
	public void setProduceWaiShe(boolean isProduceWaiShe) {
		this.isProduceWaiShe = isProduceWaiShe;
	}
	
	
}
