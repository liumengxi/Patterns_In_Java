package TemplatePatterns.ProduceComputerImpl;

import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * 苹果电脑生产商
 * @author liumengxi
 *
 */
public class AppleCompany extends abstractProduceComputer{
	
	private boolean isProduceWaiShe = true;

	@Override
	protected void produceScreen() {
		System.out.println("生产apply电脑屏幕");
		
	}

	@Override
	protected void produceWaiShe() {
		System.out.println("生产apply外设键盘,鼠标");
		
	}

	@Override
	protected void produceZhuJ() {
		System.out.println("生产apply主机");
		
	}
	/**
	 * 重写钩子方法
	 * 由该公司决定是否生产外设
	 */
	@Override
	protected boolean isProduceWaiShe(){
		
		return this.isProduceWaiShe;
	}

	//提供set方法，钩子方法决定该公司是否生产外设
	public void setProduceWaiShe(boolean isProduceWaiShe) {
		this.isProduceWaiShe = isProduceWaiShe;
	}
	
	
}
