package mediatorPatterns.saling;

import mediatorPatterns.mediator.mediator;
import mediatorPatterns.mediator.mediatorExecute;

/**
 * 出售书籍类（业务类）
 * @author liumengxi
 *
 */
public class bookSaling extends mediatorExecute{
	
	
	public bookSaling(mediator me) {
		super(me);
	}

	/**
	 * 出售图书（自有方法，处理自己的逻辑）
	 */
	public void saleBook(){
		
		System.out.println("出售图书....");
	}
	
	/**
	 * 依赖方法（需要通过中介者处理与之依赖对象的方法）
	 * 
	 */
    public void getAllStream(){	
    	
    	super.me.excucte();//执行中介者方法
    	
    }

}
