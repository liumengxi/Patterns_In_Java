package TemplatePatterns.abstractProduceComputer;

/**
 * 模板设计模式(Template)
 * 定义一个操作中算法的骨架，将一些步骤的执行延迟到其子类中。其实java的抽象类本来就是Template模式
 * 生产电脑的抽象类
 * @author liumengxi
 *
 */
public abstract class abstractProduceComputer {


	//生产显示屏
	protected abstract void produceScreen(); 
	
	//生产外设
	protected abstract void produceWaiShe();
	
	//生产主机
	protected abstract void produceZhuJ();
	
	/**
	 * 钩子方法，子类可以重写该方法。
	 * 根据此方法，判断现在是否生产外设。
	 * @return
	 */
	protected boolean isProduceWaiShe(){
		
		return true;
	}
	
	/**
	 * 生产过程
	 * 模板方法模式
	 * 定义了生产电脑的顺序，此方法为final，子类无法修改该类，这个方法就叫做模板方法
	 * produceWaiShe、produceZhuJ、produceScreen这三个方法是子类必须实现的，并且对应不同的类，叫做基本方法。
	 * 基本方法分为三种：
	 * 抽象类中实现的方法叫做“具体方法”
	 * 抽象类没有实现，子类实现的方法叫做“抽象方法”
	 * 抽象类实现的方法，子类可以重写的，叫做“钩子方法”
	 * 
	 */
	public final void produceComputer(){
		//根据客户的需求判断外设产品是否生产
		if(this.isProduceWaiShe()){
			
			this.produceWaiShe();
		}
		
		this.produceZhuJ();
		
		this.produceScreen();
		
	}
	
	
	
	
}
