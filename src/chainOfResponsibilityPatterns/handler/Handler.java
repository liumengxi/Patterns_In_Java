package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;


/**
 * 获取请求的抽象类
 * 责任链设计模式
 * Chain of Responsibility定义
 * Chain of Responsibility(CoR) 是用一系列类(classes)试图处理一个请求request,
 * 这些类之间是一个松散的耦合,唯一共同点是在他们之间传递request. 
 * 也就是说，来了一个请求，A类先处理，如果没有处理，就传递到B类处理，如果没有处理，就传递到C类处理，
 * 就这样象一个链条(chain)一样传递下去。
 * @author liumengxi
 *
 */
public abstract class Handler {
	
	//请求类型
	private int requestType;
	
	//下一个请求类型
	private Handler nextHandler;
	
	public Handler(){
		
	}
	
	public Handler(int requestType){
		this.requestType = requestType;
	}
	
	
	public final void handlerMessage(book book){
		
		if(book.getRequestType() == this.requestType){
			this.responseMessage(book);
		}else{
			if(this.nextHandler != null){
				
				this.nextHandler.handlerMessage(book);
			}else{
				
				System.out.println("无请求！");
			}
			
		}
	}
	
	
	
	/**
	 * 设置下一个请求类型
	 * @param nextHandler
	 */
	public void setNestHandler(Handler nextHandler){
		
		this.nextHandler = nextHandler;
	}
	
	
	public abstract void responseMessage(book book);

}
