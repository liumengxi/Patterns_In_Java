package mediatorPatterns.mediator;

/**
 * �н��ߵ�ʵ����(�����н��߽�ɫͨ��Э������ɫʵ��Э����Ϊ����������������ڸ���ͬ�½�ɫ��)
 * 
 * @author liumengxi
 *
 */
public class psBookMediator extends mediator {

	/**
	 * ִ�г�������
	 */
	@Override
	public void excucte() {
	
		super.bp.bookProduce();
		super.bs.saleBook();
	
	}
	
	

}
