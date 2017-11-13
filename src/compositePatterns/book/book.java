package compositePatterns.book;

/**
 * ������ģʽ
 * �鼮���������
 * ����μ���϶���Ĺ��з���������
 * composite���ģʽ��Ҳ�кϳ�ģʽ������ʱ�ֽ�������-����ģʽ��part-whole����Ҫ���������������벿�ֵĹ�ϵ��
 * �õ����ĵط��������νṹ��
 * ���������Щ�����й�ͬ�Ľӿڣ��˴�ʹ�ü̳г����ࣩ���������һ������ķ���������ִ��ʱ��Composite������
 * �������νṹ��Ѱ��ͬ��������������Ķ���ʵ�ֵ���ִ�С�������ǣһ���������ݡ�
 * Composite�ô�:
 * 1��ʹ�ͻ��˵��ü򵥣��ͻ��˿���һ�µ�ʹ����Ͻṹ�����е��������û��Ͳ��ع����Լ����������
 * ����������������ϻ�������ͼ��˿ͻ��˴��롣
 * 2��������������ڼ�����󲿼����ͻ��˲�����Ϊ�������µĶ�������Ĵ��롣
 * Compostie��ɫ��
 * 1��Component ����μ���ϵĶ���Ĺ��з��������ԣ����Զ���һЩĬ�ϵ���Ϊ�����ԡ����������е�getBookInfo()
 * �ͷ�װ�ڳ������С��÷����ǻ�ȡ�鼮������Ϣ��
 * 2��bookFinlType��Ҷ�Ӷ���������Ҳû�������ķ�֧
 * 3��bookType����֦�������������������֦�ڵ��Ҷ�ӽڵ㡣
 * Composite���ࣺ
 * 1��͸��ģʽ(���������ʹ�õķ����ŵ��������У�����add()��remove()��)
 * 2����ȫģʽ
 * 
 * 
 * @author liumengxi
 *
 */
public abstract class book {
	
	private String bookNo = "";  //�鼮����
	
	private String bookType = "";//�鼮������
	
	private String bookDesc = ""; //�鼮������
	
	
	public book(String bookNo, String bookType,String bookDesc){
		this.bookNo = bookNo;
		this.bookType = bookType;
		this.bookDesc = bookDesc;
	}
	
	/**
	 * ��ȡ�鼮������Ϣ
	 * @return
	 */
	public String getBookInfo(){
		
	 String info = 	"";
	 info = this.bookNo + "\t" + this.bookType + "\t" + this.bookDesc;
	 return info;
		
	}
	
	

}
