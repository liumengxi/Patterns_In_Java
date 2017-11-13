package mediatorPatterns.mediator;

/**
 * 中介者的实现类(具体中介者角色通过协调各角色实现协作行为，因此它必须依赖于各个同事角色。)
 * 
 * @author liumengxi
 *
 */
public class psBookMediator extends mediator {

	/**
	 * 执行出售流程
	 */
	@Override
	public void excucte() {
	
		super.bp.bookProduce();
		super.bs.saleBook();
	
	}
	
	

}
