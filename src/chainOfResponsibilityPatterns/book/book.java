package chainOfResponsibilityPatterns.book;

/**
 * 出版书籍类
 * @author liumengxi
 *
 */
public class book {

	//请求类型
	private int requestType = 0;
	//请求描述
	private String requestString;
	
	
	public book(int requestType,String requestString){
		this.requestType = requestType;
		
		//根据请求类型来判断请求的描述
		switch(requestType){
		
		  case 1:this.requestString = "发送寻找出版社请求"; break;
		  case 2:this.requestString = "发送印刷图书请求";break;
		  case 3:this.requestString ="发送出版图书请求";break;
		
		}
		
		
	}


	public int getRequestType() {
		return requestType;
	}

	public String getRequestString() {
		return requestString;
	}
	
	
}
