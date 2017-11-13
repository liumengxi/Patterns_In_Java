package bridgePatterns.book;

import bridgePatterns.product.product;

/**
 * 书籍抽象类
 * Bridge(桥梁模式)定义:将抽象和行为划分开来,各自独立,但能动态的结合.
 * 桥梁模式的优点是类间的解耦，两个角色（抽象和行为）可以自己扩展下去，不会互相影响。这也符合ocp原则。
 * 
 * Bridge模式在EJB中的应用
 * EJB中有一个Data Access Object (DAO)模式,这是将商业逻辑和具体数据资源分开的,
 * 因为不同的数据库有不同的数据库操作.将操作不同数据库的行为独立抽象成一个行为接口DAO.
 * 
 * 
 * @author liumengxi
 *
 */
public abstract class book {
	
	private product pro;
	
	public book(product pro){
		this.pro = pro;
	}
	
	//出售书籍
	public  void sellBook(){
	     
		this.pro.findBookMaker();
		this.pro.publish();
	
	}

}
