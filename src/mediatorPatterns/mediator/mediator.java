package mediatorPatterns.mediator;

import mediatorPatterns.producer.bookProducer;
import mediatorPatterns.saling.bookSaling;

/**
 * 中介者抽象类(抽象中介者（Mediator）角色：抽象中介者角色定义统一的接口用于各角色之间的通信。)
 * 将一些有联系的业务类封装起来，降低耦合度
 * 中介者设计模式：
 * 用一个中介对象来封装一系列关于对象交互行为.
 * 
 * 为何使用Mediator?
 * 各个对象之间的交互操作非常多;每个对象的行为操作都依赖彼此对方,修改一个对象的行为,同时会涉及到修改很多其他对象的行为,如果使用Mediator模式
 * ,可以使各个对象间的耦合松散,只需关心和 Mediator的关系,使多对多的关系变成了一对多的关系,可以降低系统的复杂性,提高可修改扩展性.
 *  Mediator模式在事件驱动类应用中比较多,例如界面设计GUI.;聊天,消息传递等,
 * @author liumengxi
 *
 *  什么情况下使用中介者模式:
 * 1、 N 个对象之间产生了相互的依赖关系，其中N 大于2，注意是相互的依赖；
 * 2、 多个对象有依赖关系，但是依赖的行为尚不确定或者有发生改变的可能，在这种情况下一般建议采
 *  用中介者模式，降低变更引起的风险扩散；
 * 3、 产品开发。其中一个明显的例子就是MVC 框架，把这个应用到产品中，可以提升产品的性能和扩展
 * 性，但是作为项目开发就未必，项目是以交付投产为目标，而产品以稳定、高效、扩展为宗旨。
 *  
 *
 */
public  abstract class mediator {
	
	public mediator(){
		bp = new bookProducer(this);
		bs = new bookSaling(this);
	}
     
	 public  bookProducer bp ; 
	 
	 public  bookSaling bs;
	 
	 
	 public abstract void excucte();


	public bookProducer getBp() {
		return bp;
	}


	public void setBp(bookProducer bp) {
		this.bp = bp;
	}


	public bookSaling getBs() {
		return bs;
	}


	public void setBs(bookSaling bs) {
		this.bs = bs;
	}
	
	
	 

}
