package statePatterns;

import statePatterns.context.Context;
import statePatterns.state.BlueState;

/**
 * ״̬ģʽ����
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BlueState bs = new BlueState();
		Context c = new Context();
		c.setState(bs);
		//�ГQ�ɫ
		c.push();

	}

}
