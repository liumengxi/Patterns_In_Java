package strategyPatterns.computerImpl;

import strategyPatterns.computer.computer;

/**
 * 联想机型实现类
 * @author liumengxi
 *
 */
public class lenovoComputer implements computer {
	

	@Override
	public void useageOf() {
		
		System.out.println("适用于办公上网....");

	}

}
