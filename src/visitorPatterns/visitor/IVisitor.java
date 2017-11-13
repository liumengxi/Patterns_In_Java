package visitorPatterns.visitor;

import visitorPatterns.book.computerBook;
import visitorPatterns.book.letterBook;

/**
 * �����߽ӿڣ����������߿��Է�����ЩԪ��
 * ������ģʽ
 * Visitor����
 * ������ĳ������Ⱥ�и�������Ĳ���. ������ʹ���ڲ��ı���Щ������������,������������Щ������²���.
 * ��Java��,Visitorģʽʵ�����Ƿ�����collection�ṹ�е�Ԫ�غͶ���ЩԪ�ؽ��в�������Ϊ.
 * 
 * ������ģʽ���ŵ㣺
 * 1�����ϵ�һְ��ԭ��
 * 2������ְ��ֿ����������Ӷ����ݵĲ����ǳ�����
 * 
 * 
 * ��������չ������
 * 1��ͳ�ƹ���
 * 2�����������
 * 3��������
 * @author liumengxi
 *
 */
public interface IVisitor {
	
	//������ʼ������ͼ��
	public void visit(computerBook comb);
	//���������ѧ��ͼ��
	public void visit(letterBook lb);

}
