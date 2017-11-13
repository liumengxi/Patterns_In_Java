package TemplatePatterns.ProduceComputerImpl;

import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * hp子类生产hp牌电脑
 * @author liumengxi
 *
 */
public class HpCompany extends abstractProduceComputer{

	@Override
	protected void produceScreen() {
		
		System.out.println("生产hp电脑屏幕");
	}

	@Override
	protected void produceWaiShe() {
		
		System.out.println("生产hp外设键盘,鼠标");
	}

	@Override
	protected void produceZhuJ() {
		
		System.out.println("生产hp主机");
		
		
	}
	
	
	

}
