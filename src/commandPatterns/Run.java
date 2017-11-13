package commandPatterns;

import commandPatterns.command.landArmyBack;
import commandPatterns.command.threeArmyDryRun;
import commandPatterns.commander.commander;

/**
 * ִ�����������
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**�������Ͼ��� */
		threeArmyDryRun tadr = new threeArmyDryRun();
		/** ½������ */
		landArmyBack lab = new landArmyBack();
		
		commander commander = new commander(lab);
		commander.action();

		System.out.println("*****************************");
		commander commanders = new commander(tadr);
		commanders.action();
		
		
	}

}
