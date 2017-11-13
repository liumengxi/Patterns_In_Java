package observerPatterns.pojo;

import java.util.Observable;


/**
 * �۲���ģʽ(observer)
 * �鼮��(���۲���)
 * �̳�observable
 * ���ʹ�ã�
 *   Java��API��ΪΪ�����ṩ�ֳɵ�Observer�ӿ�Java.util.Observer.����ֻҪֱ��ʹ�����Ϳ���.
 *   1.�ṩAdd/Delete observer�ķ���;
 *   2.�ṩ֪ͨ(notify) ����observer�ķ���;
 *  �۲���ģʽ����һ�����ƽ�������/����ģ��(Publish/Subscribe)
 *  ʹ�ó�����
 *  ʵ����Ϣ�Ĺ㲥��һ����Ϣ���Գ�������¼���
 *  �۲���ģʽ��Ҫ����������ص����⣺
 *  �㲥�������⡣��һ���۲���ģʽ������һ��������ǹ۲���Ҳ�Ǳ��۲��ߡ���
 *  �첽�������⡣������۲��߽϶࣬����ʹ���첽����ʽ����
 * @author liumengxi
 *
 */
public class book extends Observable{
	
	private String name;
	
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//�������Ʊ仯��
		setChanged();
		notifyObservers(name);
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
		//���ü۸�仯��
		setChanged();
		notifyObservers(price);
	}
	
	

}
