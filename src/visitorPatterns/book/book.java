package visitorPatterns.book;

import visitorPatterns.visitor.IVisitor;

/**
 * 书籍抽象类，声明接受访问者访问类型
 * @author liumengxi
 *
 */
public abstract class book {
	//接受访问者的访问
	public abstract void accept(IVisitor iv);

}
