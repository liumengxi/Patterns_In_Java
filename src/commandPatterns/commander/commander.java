package commandPatterns.commander;

import commandPatterns.command.command;


/**
 * �׳���
 * ��Ҫִ�������ߣ�����Ҫִ�е�������Ϊ���������׳�����
 * @author liumengxi
 *
 */
public class commander {
	
	//ִ������
	protected command com;
	
	public commander(command com){
		this.com = com;
	}
	
	/**
	 * ִ������
	 */
	public void action(){
		
		this.com.execute();
		
	}

}
