package compositePatterns.book;

/**
 * 组合设计模式
 * 书籍分类抽象类
 * 定义参加组合对象的共有方法和属性
 * composite组合模式（也叫合成模式），有时又叫做部分-整体模式（part-whole）主要是用来描述整体与部分的关系，
 * 用的最多的地方就是树形结构。
 * 组合体内这些对象都有共同的接口（此处使用继承抽象类），当组合体一个对象的方法被调用执行时，Composite将遍历
 * 整个树形结构，寻找同样包含这个方法的对象并实现调用执行。可以用牵一动百来形容。
 * Composite好处:
 * 1、使客户端调用简单，客户端可以一致的使用组合结构或其中单个对象，用户就不必关心自己所处理的是
 * 单个对象还是整个组合机构，这就简化了客户端代码。
 * 2、更容易在组合内加入对象部件，客户端不必因为加入了新的对象而更改代码。
 * Compostie角色：
 * 1、Component 定义参加组合的对象的共有方法和属性，可以定义一些默认的行为或属性。比如例子中的getBookInfo()
 * 就封装在抽象类中。该方法是获取书籍分类信息。
 * 2、bookFinlType：叶子对象，其下再也没有其他的分支
 * 3、bookType：树枝对象，它的作用是组合树枝节点和叶子节点。
 * Composite分类：
 * 1、透明模式(把用来组合使用的方法放到抽象类中，比如add()、remove()等)
 * 2、安全模式
 * 
 * 
 * @author liumengxi
 *
 */
public abstract class book {
	
	private String bookNo = "";  //书籍类编号
	
	private String bookType = "";//书籍类名称
	
	private String bookDesc = ""; //书籍类描述
	
	
	public book(String bookNo, String bookType,String bookDesc){
		this.bookNo = bookNo;
		this.bookType = bookType;
		this.bookDesc = bookDesc;
	}
	
	/**
	 * 获取书籍分类信息
	 * @return
	 */
	public String getBookInfo(){
		
	 String info = 	"";
	 info = this.bookNo + "\t" + this.bookType + "\t" + this.bookDesc;
	 return info;
		
	}
	
	

}
