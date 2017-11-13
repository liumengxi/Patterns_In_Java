package statePatterns.context;

import statePatterns.state.State;

public class Context {

	private State state = null;

	public void setState(State state) {
		this.state = state;
	}

	public void push(){
		
		//状态的切换的细节部分,在本例中是颜色的变化,已经封装在子类的handlepush中实现,这里无需关心
		state.handlepush(this);
			
}

	public void pull(){

		state.handlepull(this);

}

}
