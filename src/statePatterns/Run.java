package statePatterns;

import statePatterns.context.Context;
import statePatterns.state.BlueState;

/**
 * ×´Ì¬Ä£Ê½²âÊÔ
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
		//ÇĞ“QîÉ«
		c.push();

	}

}
