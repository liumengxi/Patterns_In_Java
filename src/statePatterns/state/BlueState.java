package statePatterns.state;

import java.awt.Color;

import statePatterns.context.Context;

public class BlueState extends State {
	
	
	public Color getcolor() {
		
		return (Color.blue);

	}
	@Override
	public void handlepush(Context c) {
		
		c.setState(new BlueState());//�˴�Ϊ����������ɫ��״̬���ɴ�������״̬��ɫ���࣬������ò���
		
	}
	@Override
	public void handlepull(Context c) {
		
		c.setState(new BlueState());//�˴�Ϊ����������ɫ��״̬���ɴ�������״̬��ɫ���࣬������ò���
		
	}

}
