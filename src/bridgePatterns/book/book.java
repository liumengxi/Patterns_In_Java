package bridgePatterns.book;

import bridgePatterns.product.product;

/**
 * �鼮������
 * Bridge(����ģʽ)����:���������Ϊ���ֿ���,���Զ���,���ܶ�̬�Ľ��.
 * ����ģʽ���ŵ������Ľ��������ɫ���������Ϊ�������Լ���չ��ȥ�����ụ��Ӱ�졣��Ҳ����ocpԭ��
 * 
 * Bridgeģʽ��EJB�е�Ӧ��
 * EJB����һ��Data Access Object (DAO)ģʽ,���ǽ���ҵ�߼��;���������Դ�ֿ���,
 * ��Ϊ��ͬ�����ݿ��в�ͬ�����ݿ����.��������ͬ���ݿ����Ϊ���������һ����Ϊ�ӿ�DAO.
 * 
 * 
 * @author liumengxi
 *
 */
public abstract class book {
	
	private product pro;
	
	public book(product pro){
		this.pro = pro;
	}
	
	//�����鼮
	public  void sellBook(){
	     
		this.pro.findBookMaker();
		this.pro.publish();
	
	}

}
