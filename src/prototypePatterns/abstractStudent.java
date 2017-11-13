package prototypePatterns;

import java.util.ArrayList;

/**
 * ԭ�����ģʽ
 * ���壺��ԭ��ʵ��ָ��������ַ��������࣬����ͨ��������Щԭ�ʹ����µĶ���
 * ����ԭ��ͨ����һ��ԭ�Ͷ��󴫸��Ǹ�Ҫ���������Ķ������Ҫ����������������ԭ�Ͷ��󿽱������Լ���ʵʩ�����ġ�
 * ��ͨ��new�ؼ���������һ�����󣬶���ͨ�����󿽱���ʵ�ֵ�ģʽ�ͽ���ԭ��ģʽ��
 * 
 * ��JAVA��ʹ��ԭ��ģʽ����clone()��������ע�������:
 * 1�����󿽱�ʱ����Ĺ��캯���ǲ��ᱻִ�еġ�
 * 2��ǳ���������
 * ��ǳ��������Object���ṩ�ķ���cloneֻ�ǿ���������������ڲ������飬���ö���ȶ���������
 * ����ָ��ԭ��������ڲ�Ԫ�ص�ַ���������ͱ���int��long��String�ȶ��ᱻ������
 * ���������object���е�clone������������������ö�����е���������ʵ����ȫ������������¡�Ķ����еı����ͻụ��Ӱ�졣
 * 
 * ��ʵ�ʿ��������У�����Ҫ��ǳ����������ֿ�ʵ�֡�
 * @author liumengxi
 *
 */
public class abstractStudent implements Cloneable {
	
	private String name;
	private String sex;
	private ArrayList<String> arrayList = new ArrayList<String>();
	
	public abstractStudent(){
		
		System.out.println("���캯����ִ��");
		
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
	 * ��д��¡����
	 * ��ʵJava�е�prototypeģʽ����clone(���󿽱�)������ʹ��
	 */
	@SuppressWarnings("unchecked")
	@Override
	public abstractStudent clone(){
		
		abstractStudent abstudent = null;
		
		try {
			//ִ�и���Object�е�clone���������������
			abstudent = (abstractStudent) super.clone();
			this.arrayList = (ArrayList<String>) this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return abstudent;
	}
	

}
