package chainOfResponsibilityPatterns.book;

/**
 * �����鼮��
 * @author liumengxi
 *
 */
public class book {

	//��������
	private int requestType = 0;
	//��������
	private String requestString;
	
	
	public book(int requestType,String requestString){
		this.requestType = requestType;
		
		//���������������ж����������
		switch(requestType){
		
		  case 1:this.requestString = "����Ѱ�ҳ���������"; break;
		  case 2:this.requestString = "����ӡˢͼ������";break;
		  case 3:this.requestString ="���ͳ���ͼ������";break;
		
		}
		
		
	}


	public int getRequestType() {
		return requestType;
	}

	public String getRequestString() {
		return requestString;
	}
	
	
}
