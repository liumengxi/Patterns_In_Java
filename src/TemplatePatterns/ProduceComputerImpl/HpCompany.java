package TemplatePatterns.ProduceComputerImpl;

import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * hp��������hp�Ƶ���
 * @author liumengxi
 *
 */
public class HpCompany extends abstractProduceComputer{

	@Override
	protected void produceScreen() {
		
		System.out.println("����hp������Ļ");
	}

	@Override
	protected void produceWaiShe() {
		
		System.out.println("����hp�������,���");
	}

	@Override
	protected void produceZhuJ() {
		
		System.out.println("����hp����");
		
		
	}
	
	
	

}
