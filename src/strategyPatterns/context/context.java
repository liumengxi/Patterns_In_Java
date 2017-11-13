package strategyPatterns.context;

import strategyPatterns.computer.computer;

/**
 * �����࣬����ʹ��ĳ�ֵ��Ի���
 * Strategy���������ģʽ�� ������Ϊ��ģʽ,��Ҫ�Ƕ���һϵ�е��㷨,����Щ�㷨һ������װ�ɵ�������.
 * StratrgyӦ�ñȽϹ㷺,����, ��˾��Ӫҵ��仯ͼ, ����������ʵ�ַ�ʽ,һ������������,һ���ǿ�ͼ(bar),���������㷨,����ʹ��Strategyʵ��.
 * Stratrgy�ŵ㣺�����˸��ھ۵���ϵ����ԣ���ǿ��չ��
 * 
 * Strategy�ʺ����г���:
 * 1.�Բ�ͬ�ĸ�ʽ�����ļ�;
 * 2.�Բ�ͬ���㷨ѹ���ļ�;
 * 3.�Բ�ͬ���㷨�ػ�ͼ��;
 * 4.�Բ�ͬ�ĸ�ʽ���ͬ�����ݵ�ͼ��,�������� ���ͼbar��
 * @author liumengxi
 *
 */
public class context {
	
	private computer com;
	
	public context(computer com){
		this.com = com;
	}
	
	/**
	 * ʹ����X�C��
	 */
	public void use(){
		
		this.com.useageOf();
	}

}
