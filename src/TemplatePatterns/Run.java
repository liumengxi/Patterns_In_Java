package TemplatePatterns;

import TemplatePatterns.ProduceComputerImpl.AppleCompany;
import TemplatePatterns.ProduceComputerImpl.HpCompany;
import TemplatePatterns.abstractProduceComputer.abstractProduceComputer;

/**
 * ����templateģʽ������
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		AppleCompany ac = new AppleCompany();
		
		//�Ƿ���Ҫ�������裬�ɿͻ���
		ac.setProduceWaiShe(true);
		
		ac.produceComputer();
		
		abstractProduceComputer apc1 = new HpCompany();
		
		apc1.produceComputer();
	}

}
