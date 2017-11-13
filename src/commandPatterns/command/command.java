package commandPatterns.command;

import commandPatterns.army.landArmy;
import commandPatterns.army.seaArmy;
import commandPatterns.army.skyArmy;

/**
 * 发送命令抽象类
 * Command定义
 * 不少Command模式的代码都是针对图形界面的,它实际就是菜单命令,我们在一个下拉菜单选择一个命令时,然后会执行一些动作
 * 将这些命令封装成在一个类中,然后用户(调用者)再对这个类进行操作,这就是Command模式,换句话说,
 * 本来用户(调用者)是直接调用这些命令的,如菜单上打开文档(调用者),就直接指向打开文档的代码,使用Command模式,就是在这两者之间增加一个中间者,
 * 将这种直接关系拗断,同时两者之间都隔离,基本没有关系了.
 * @author liumengxi
 *
 */
public abstract class command {
	
	//陆军
	protected landArmy la = new landArmy();
	//海军
	protected seaArmy sa = new seaArmy();
	//空军
	protected skyArmy skya = new skyArmy();
	
	//执行命令
	public abstract void execute();
	

}
