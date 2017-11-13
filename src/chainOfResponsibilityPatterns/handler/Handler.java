package chainOfResponsibilityPatterns.handler;

import chainOfResponsibilityPatterns.book.book;


/**
 * ��ȡ����ĳ�����
 * ���������ģʽ
 * Chain of Responsibility����
 * Chain of Responsibility(CoR) ����һϵ����(classes)��ͼ����һ������request,
 * ��Щ��֮����һ����ɢ�����,Ψһ��ͬ����������֮�䴫��request. 
 * Ҳ����˵������һ������A���ȴ������û�д����ʹ��ݵ�B�ദ�����û�д����ʹ��ݵ�C�ദ��
 * ��������һ������(chain)һ��������ȥ��
 * @author liumengxi
 *
 */
public abstract class Handler {
	
	//��������
	private int requestType;
	
	//��һ����������
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
				
				System.out.println("������");
			}
			
		}
	}
	
	
	
	/**
	 * ������һ����������
	 * @param nextHandler
	 */
	public void setNestHandler(Handler nextHandler){
		
		this.nextHandler = nextHandler;
	}
	
	
	public abstract void responseMessage(book book);

}
