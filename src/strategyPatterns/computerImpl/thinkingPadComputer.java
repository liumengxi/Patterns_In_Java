package strategyPatterns.computerImpl;

import strategyPatterns.computer.computer;

/**
 * thinkPad型电脑实现类
 * @author liumengxi
 *
 */
public class thinkingPadComputer implements computer {

	@Override
	public void useageOf() {
		
		System.out.println("适用于学习....");
	}

}
