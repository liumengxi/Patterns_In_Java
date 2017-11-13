package prototypePatterns;

/**
 * 原型设计模式的测试
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		abstractStudent abs = new abstractStudent();
		
		abs.setName("小明");
		
		abstractStudent abs1 = abs.clone();//执行克隆方法后，该类的构造方法不会被执行。
		
		abs1.setName("小芳");
		
		/**
		 * 浅拷贝
		 * int,long,String等类型会进行完全拷贝。所以输出的值互不影响。
		 */
		System.out.println(abs.getName());
		
		System.out.println(abs1.getName());
		
		
		/**
		 * 由于clone()方法，无法拷贝数组或者引用类型的值，所以下述的输出值为“[小左,小东]”
		 * 如果需要进行完全拷贝(深拷贝)，则需要在重写的clone方法中增添如下设置
		 * this.arrayList = (ArrayList<String>)this.arrayList.clone();
		 * 就会实现完全拷贝，再次运行程序，就只会输出[小左]
		 * 
		 */
		abs.addListElement("小左");
		
		abs1.addListElement("小东");
		
		System.out.println(abs.getListElement());
		
		
	}

}
