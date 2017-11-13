package TemplatePatterns;

import TemplatePatterns.ProduceComputerImpl.AppleCompany;
import TemplatePatterns.ProduceComputerImpl.HpCompany;
import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * 运行template模式测试类
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		AppleCompany ac = new AppleCompany();
		
		//是否需要生产外设，由客户定
		ac.setProduceWaiShe(true);
		
		ac.produceComputer();
		
		abstractProduceComputer apc1 = new HpCompany();
		
		apc1.produceComputer();
	}

}
