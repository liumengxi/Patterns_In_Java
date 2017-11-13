package compositePatterns;

import java.util.ArrayList;

import compositePatterns.book.book;
import compositePatterns.bookImpl.bookFinalType;
import compositePatterns.bookImpl.bookType;

/**
 * 测试组合模式
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//初始化书籍的分类
		bookType bt = getAllBookType();
		
		//打印主节点信息
		System.out.println(bt.getBookInfo());
		 
		//打印树枝节点以及叶子节点信息
		System.out.println(getbookTypeList(bt));
		
		
		

	}
	
	/**
	 * 初始化书籍分类
	 * @return
	 */
	public static bookType getAllBookType(){
		
		
		//根节点
		bookType btRoot = new bookType("1", "图书", "图书根节点");
		
		//树枝节点
		bookType btRoot1 = new bookType("11", "文学类图书", "描述文学..."); 
		bookType btRoot2 = new bookType("12", "计算类图书", "描述计算机..."); 
		bookType btRoot3 = new bookType("13", "烹饪类图书", "描述烹饪..."); 
		bookType btRoot4 = new bookType("14", "旅游类图书", "描述旅游..."); 
		
		bookType btRoot11 = new bookType("111", "古典文学类图书", "描述古典文学");
		bookType btRoot12 = new bookType("112", "现代文学类图书", "描述现代文学");
		bookType btRoot13 = new bookType("121", "软件类图书", "描述软件类");
		bookType btRoot14 = new bookType("122", "硬件类图书", "描述硬件类");
		bookType btRoot15 = new bookType("131", "中餐类图书", "描述中餐类");
		bookType btRoot16 = new bookType("132", "西餐类图书", "描述西餐类");
		bookType btRoot17 = new bookType("141", "探险类图书", "描述探险类");
		bookType btRoot18 = new bookType("142", "摩旅类图书", "描述摩旅类");
		
		
		bookFinalType bft1 = new bookFinalType("111A", "红楼梦", "曹雪芹");
		bookFinalType bft2 = new bookFinalType("111B", "沉沦", "郁达夫");
		bookFinalType bft3 = new bookFinalType("112A", "Thinking in Java", "golings");
		bookFinalType bft4 = new bookFinalType("112B", "windows", "soft");
		bookFinalType bft5 = new bookFinalType("113A", "粤菜", "广东");
		bookFinalType bft6 = new bookFinalType("113B", "KFC", "穆大叔");
		bookFinalType bft7 = new bookFinalType("114A", "探险之道", "Akin");
		bookFinalType bft8 = new bookFinalType("114B", "摩旅之道", "Akon");
		
		btRoot.addBookType(btRoot1);
		btRoot.addBookType(btRoot2);
		btRoot.addBookType(btRoot3);
		btRoot.addBookType(btRoot4);
		
		btRoot1.addBookType(btRoot11);
		btRoot1.addBookType(btRoot12);
		btRoot2.addBookType(btRoot13);
		btRoot2.addBookType(btRoot14);
		
		btRoot3.addBookType(btRoot15);
		btRoot3.addBookType(btRoot16);
		btRoot4.addBookType(btRoot17);
		btRoot4.addBookType(btRoot18);
		
		btRoot11.addBookType(bft1);
		btRoot12.addBookType(bft2);
		btRoot13.addBookType(bft3);
		btRoot14.addBookType(bft4);
		btRoot15.addBookType(bft5);
		btRoot16.addBookType(bft6);
		btRoot17.addBookType(bft7);
		btRoot18.addBookType(bft8);
		
		return btRoot;
		
	}
	
	/**
	 * 获取书籍节点
	 * @return
	 */
	public static String getbookTypeList(bookType bt){
		
		
		String info = "";
		//获取整个书籍的分类集合
		ArrayList<book> arrayBookList = bt.getBookListInfo();
		
		//遍历书籍分类
		for(book b : arrayBookList){
			if(b instanceof bookFinalType){ //叶子节点信息
                 info = info + b.getBookInfo() + "\n";				
				
			}else{
				info = info + b.getBookInfo()+  "\n" + getbookTypeList((bookType)b);//树枝节点
			}
			
		}
		return info;
		
		
	}

}
