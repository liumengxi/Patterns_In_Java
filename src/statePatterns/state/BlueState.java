package statePatterns.state;

import java.awt.Color;

import statePatterns.context.Context;

public class BlueState extends State {
	
	
	public Color getcolor() {
		
		return (Color.blue);

	}
	@Override
	public void handlepush(Context c) {
		
		c.setState(new BlueState());//此处为创建其他颜色的状态，可创建其他状态颜色子类，来替代该参数
		
	}
	@Override
	public void handlepull(Context c) {
		
		c.setState(new BlueState());//此处为创建其他颜色的状态，可创建其他状态颜色子类，来替代该参数
		
	}

}
