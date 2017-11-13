package commandPatterns.command;

/**
 * 三军联合军演命令实现类
 * @author liumengxi
 *
 */
public class threeArmyDryRun extends command {

	@Override
	public void execute() {
		
		super.la.come();
		super.sa.come();
		super.skya.come();

	}

}
