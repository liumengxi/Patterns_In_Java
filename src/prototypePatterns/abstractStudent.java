package prototypePatterns;

import java.util.ArrayList;

/**
 * 原型设计模式
 * 定义：用原型实例指定创建地址对象的种类，并且通过拷贝这些原型创建新的对象。
 * 工作原理：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建对象请求原型对象拷贝它们自己来实施创建的。
 * 不通过new关键字来产生一个对象，而是通过对象拷贝来实现的模式就叫做原型模式。
 * 
 * 在JAVA中使用原型模式就是clone()方法。需注意的事项:
 * 1、对象拷贝时，类的构造函数是不会被执行的。
 * 2、浅拷贝与深拷贝
 * “浅拷贝”：Object类提供的方法clone只是拷贝本对象，其对象内部的数组，引用对象等都不拷贝，
 * 还是指向原生对象的内部元素地址。其他类型比如int，long，String等都会被拷贝。
 * “深拷贝”：object类中的clone方法，对数组或者引用对象进行单独拷贝，实现完全拷贝，这样克隆的对象中的变量就会互不影响。
 * 
 * 在实际开发运用中，建议要将浅拷贝和深拷贝分开实现。
 * @author liumengxi
 *
 */
public class abstractStudent implements Cloneable {
	
	private String name;
	private String sex;
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	public abstractStudent(){
		
		System.out.println("构造函数被执行");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void addListElement(String element){
		
		this.arrayList.add(element);
		
	}
	
	public ArrayList<String> getListElement(){
		
	    return	this.arrayList;
	}
	
	
	
	/**
	 * 重写克隆方法
	 * 其实Java中的prototype模式就是clone(对象拷贝)方法的使用
	 */
	@SuppressWarnings("unchecked")
	@Override
	public abstractStudent clone(){
		
		abstractStudent abstudent = null;
		
		try {
			//执行父类Object中的clone方法，拷贝其对象
			abstudent = (abstractStudent) super.clone();
			this.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return abstudent;
	}
	

}
