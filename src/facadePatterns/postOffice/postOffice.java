package facadePatterns.postOffice;

import facadePatterns.Letter.letterImpl;

/**
 * 
 * 邮局类
 * 提供发送信件方法
 * 
 * 
 * 门面设计模式，将公共实现提取出来，过程由此类中的方法实现，用户只需要提供信件与信件内容即可，
 * 发送信件的服务由此类完成，使程序更具有扩展性与灵活性。
 * facade的定义：为子系统中的一组接口提供一个一致的界面。
 * 经典应用就是数据库JDBC的应用，每次做增删改查操作时都需要对数据库进行连接操作，大大降低了效率。
 * 通过使用门面设计模式(facade)将公共部分抽取出一个接口，如果需要对数据库进行连接操作的时候，调用该接口。
 * 这样做既提高了效率，又大大增强了灵活性。如果更换数据库，只需修改接口中的连接信息即可。
 * facade模式是理清系统间的关系，降低系统间耦合度的一个常用方法。
 * 
 * 
 * @author liumengxi
 *
 */
public class postOffice {
	
	private letterImpl letter = new letterImpl();
	
	/**
	 * 发送信件方法
	 * @param letterContext 信件内容
	 * @param address       信封内容
	 */
	public void sendLetter(String letterContext,String address){
		
	   	//写信件内容
		letter.letterContext(letterContext);
		//填写信封内容
		letter.fillEnvelope(address);
		//将信封投入信封中
		letter.letterIntoEnvelope();
		//发送信件
		letter.sendLetter();
	}

}
