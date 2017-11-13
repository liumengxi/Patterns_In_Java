package commandPatterns.commander;

import commandPatterns.command.command;


/**
 * 首长类
 * 需要执行命令者，将需要执行的命令作为变量传入首长类中
 * @author liumengxi
 *
 */
public class commander {
	
	//执行命令
	protected command com;
	
	public commander(command com){
		this.com = com;
	}
	
	/**
	 * 执行命令
	 */
	public void action(){
		
		this.com.execute();
		
	}

}
