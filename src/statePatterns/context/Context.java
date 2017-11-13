package statePatterns.context;

import statePatterns.state.State;

public class Context {

	private State state = null;

	public void setState(State state) {
		this.state = state;
	}

	public void push(){
		
		//״̬���л���ϸ�ڲ���,�ڱ���������ɫ�ı仯,�Ѿ���װ�������handlepush��ʵ��,�����������
		state.handlepush(this);
			
}

	public void pull(){

		state.handlepull(this);

}

}
