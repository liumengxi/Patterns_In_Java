package facadePatterns.postOffice;

import facadePatterns.Letter.letterImpl;

/**
 * 
 * �ʾ���
 * �ṩ�����ż�����
 * 
 * 
 * �������ģʽ��������ʵ����ȡ�����������ɴ����еķ���ʵ�֣��û�ֻ��Ҫ�ṩ�ż����ż����ݼ��ɣ�
 * �����ż��ķ����ɴ�����ɣ�ʹ�����������չ��������ԡ�
 * facade�Ķ��壺Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һ�µĽ��档
 * ����Ӧ�þ������ݿ�JDBC��Ӧ�ã�ÿ������ɾ�Ĳ����ʱ����Ҫ�����ݿ�������Ӳ�������󽵵���Ч�ʡ�
 * ͨ��ʹ���������ģʽ(facade)���������ֳ�ȡ��һ���ӿڣ������Ҫ�����ݿ�������Ӳ�����ʱ�򣬵��øýӿڡ�
 * �������������Ч�ʣ��ִ����ǿ������ԡ�����������ݿ⣬ֻ���޸Ľӿ��е�������Ϣ���ɡ�
 * facadeģʽ������ϵͳ��Ĺ�ϵ������ϵͳ����϶ȵ�һ�����÷�����
 * 
 * 
 * @author liumengxi
 *
 */
public class postOffice {
	
	private letterImpl letter = new letterImpl();
	
	/**
	 * �����ż�����
	 * @param letterContext �ż�����
	 * @param address       �ŷ�����
	 */
	public void sendLetter(String letterContext,String address){
		
	   	//д�ż�����
		letter.letterContext(letterContext);
		//��д�ŷ�����
		letter.fillEnvelope(address);
		//���ŷ�Ͷ���ŷ���
		letter.letterIntoEnvelope();
		//�����ż�
		letter.sendLetter();
	}

}
