package visitorPatterns.visitor;

import visitorPatterns.book.computerBook;
import visitorPatterns.book.letterBook;

/**
 * 访问者接口，声明访问者可以访问哪些元素
 * 访问者模式
 * Visitor定义
 * 作用于某个对象群中各个对象的操作. 它可以使你在不改变这些对象本身的情况下,定义作用于这些对象的新操作.
 * 在Java中,Visitor模式实际上是分离了collection结构中的元素和对这些元素进行操作的行为.
 * 
 * 访问者模式的优点：
 * 1、符合单一职责原则。
 * 2、由于职责分开，继续增加对数据的操作非常敏捷
 * 
 * 
 * 访问者扩展场景：
 * 1、统计功能
 * 2、多个访问者
 * 3、拦截器
 * @author liumengxi
 *
 */
public interface IVisitor {
	
	//定义访问计算机类图书
	public void visit(computerBook comb);
	//定义访问文学类图书
	public void visit(letterBook lb);

}
