package mediatorPatterns.mediator;

/**
 * 中介者抽象执行类(每一个角色都知道中介者角色，而且与其他的角色通信的时候，
 * 一定要通过中介者角色协作)
 * 为了建立中介服务的基类。
 * @author liumengxi
 *
 */
public abstract class mediatorExecute {

	protected mediator me;
	
	public mediatorExecute(mediator me){
		
		this.me = me;
	}
	
}
