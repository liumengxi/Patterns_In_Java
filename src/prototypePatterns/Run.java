package prototypePatterns;

/**
 * ԭ�����ģʽ�Ĳ���
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		abstractStudent abs = new abstractStudent();
		
		abs.setName("С��");
		
		abstractStudent abs1 = abs.clone();//ִ�п�¡�����󣬸���Ĺ��췽�����ᱻִ�С�
		
		abs1.setName("С��");
		
		/**
		 * ǳ����
		 * int,long,String�����ͻ������ȫ���������������ֵ����Ӱ�졣
		 */
		System.out.println(abs.getName());
		
		System.out.println(abs1.getName());
		
		
		/**
		 * ����clone()�������޷�������������������͵�ֵ���������������ֵΪ��[С��,С��]��
		 * �����Ҫ������ȫ����(���)������Ҫ����д��clone������������������
		 * this.arrayList = (ArrayList<String>)this.arrayList.clone();
		 * �ͻ�ʵ����ȫ�������ٴ����г��򣬾�ֻ�����[С��]
		 * 
		 */
		abs.addListElement("С��");
		
		abs1.addListElement("С��");
		
		System.out.println(abs.getListElement());
		
		
	}

}
