package commandPatterns;

import commandPatterns.command.landArmyBack;
import commandPatterns.command.threeArmyDryRun;
import commandPatterns.commander.commander;

/**
 * 执行命令测试类
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**三军联合军演 */
		threeArmyDryRun tadr = new threeArmyDryRun();
		/** 陆军撤退 */
		landArmyBack lab = new landArmyBack();
		
		commander commander = new commander(lab);
		commander.action();

		System.out.println("*****************************");
		commander commanders = new commander(tadr);
		commanders.action();
		
		
	}

}
