package mediatorPatterns.producer;

import mediatorPatterns.mediator.mediator;
import mediatorPatterns.mediator.mediatorExecute;


/**
 * 出版书籍（业务类）
 * @author liumengxi
 *
 */
public class bookProducer extends mediatorExecute {
	


	/**
	 * 注入中介者类
	 * @param me
	 */
	public bookProducer(mediator me) {
		super(me);
	}

	/**
	 * 出版图书（自有方法，处理自己的逻辑）
	 */
	public void bookProduce(){
		
		System.out.println("出版图书...");
	}
	/**
	 * 依赖方法（需要通过中介者处理与之依赖对象的方法）
	 * 
	 */
    public void getAllStream(){	
    	
    	super.me.excucte();//执行中介者方法
    	
    }
	
}
