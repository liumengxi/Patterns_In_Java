package facadePatterns;

import facadePatterns.postOffice.postOffice;


/**
 * �����ż�����
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String context = "�������������Ժ���,�ҵ�����,�ҵ�����,�ҵ�ǹ����.....";
		String address = "�Ϻ�";
		
		//�ʾ�ʵ��
		postOffice po = new postOffice();
		/**
		 * �����ż�
		 */
		po.sendLetter(context, address);
		
	}

}
