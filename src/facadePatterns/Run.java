package facadePatterns;

import facadePatterns.postOffice.postOffice;


/**
 * 测试信件发送
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String context = "你存在我深深的脑海里,我的梦里,我的心里,我的枪声里.....";
		String address = "上海";
		
		//邮局实例
		postOffice po = new postOffice();
		/**
		 * 发送信件
		 */
		po.sendLetter(context, address);
		
	}

}
