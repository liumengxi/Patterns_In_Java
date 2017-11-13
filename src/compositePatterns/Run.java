package compositePatterns;

import java.util.ArrayList;

import compositePatterns.book.book;
import compositePatterns.bookImpl.bookFinalType;
import compositePatterns.bookImpl.bookType;

/**
 * �������ģʽ
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//��ʼ���鼮�ķ���
		bookType bt = getAllBookType();
		
		//��ӡ���ڵ���Ϣ
		System.out.println(bt.getBookInfo());
		 
		//��ӡ��֦�ڵ��Լ�Ҷ�ӽڵ���Ϣ
		System.out.println(getbookTypeList(bt));
		
		
		

	}
	
	/**
	 * ��ʼ���鼮����
	 * @return
	 */
	public static bookType getAllBookType(){
		
		
		//���ڵ�
		bookType btRoot = new bookType("1", "ͼ��", "ͼ����ڵ�");
		
		//��֦�ڵ�
		bookType btRoot1 = new bookType("11", "��ѧ��ͼ��", "������ѧ..."); 
		bookType btRoot2 = new bookType("12", "������ͼ��", "���������..."); 
		bookType btRoot3 = new bookType("13", "�����ͼ��", "�������..."); 
		bookType btRoot4 = new bookType("14", "������ͼ��", "��������..."); 
		
		bookType btRoot11 = new bookType("111", "�ŵ���ѧ��ͼ��", "�����ŵ���ѧ");
		bookType btRoot12 = new bookType("112", "�ִ���ѧ��ͼ��", "�����ִ���ѧ");
		bookType btRoot13 = new bookType("121", "�����ͼ��", "���������");
		bookType btRoot14 = new bookType("122", "Ӳ����ͼ��", "����Ӳ����");
		bookType btRoot15 = new bookType("131", "�в���ͼ��", "�����в���");
		bookType btRoot16 = new bookType("132", "������ͼ��", "����������");
		bookType btRoot17 = new bookType("141", "̽����ͼ��", "����̽����");
		bookType btRoot18 = new bookType("142", "Ħ����ͼ��", "����Ħ����");
		
		
		bookFinalType bft1 = new bookFinalType("111A", "��¥��", "��ѩ��");
		bookFinalType bft2 = new bookFinalType("111B", "����", "�����");
		bookFinalType bft3 = new bookFinalType("112A", "Thinking in Java", "golings");
		bookFinalType bft4 = new bookFinalType("112B", "windows", "soft");
		bookFinalType bft5 = new bookFinalType("113A", "����", "�㶫");
		bookFinalType bft6 = new bookFinalType("113B", "KFC", "�´���");
		bookFinalType bft7 = new bookFinalType("114A", "̽��֮��", "Akin");
		bookFinalType bft8 = new bookFinalType("114B", "Ħ��֮��", "Akon");
		
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
	 * ��ȡ�鼮�ڵ�
	 * @return
	 */
	public static String getbookTypeList(bookType bt){
		
		
		String info = "";
		//��ȡ�����鼮�ķ��༯��
		ArrayList<book> arrayBookList = bt.getBookListInfo();
		
		//�����鼮����
		for(book b : arrayBookList){
			if(b instanceof bookFinalType){ //Ҷ�ӽڵ���Ϣ
                 info = info + b.getBookInfo() + "\n";				
				
			}else{
				info = info + b.getBookInfo()+  "\n" + getbookTypeList((bookType)b);//��֦�ڵ�
			}
			
		}
		return info;
		
		
	}

}
