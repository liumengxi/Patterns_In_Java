package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.abstractMusic;

/**
 * ���ֽ����߳�����
 * ������ģʽ(Builder)
 * ��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
 * (Builder)������ģʽ��һ��һ������һ�����ӵĶ���,�������û�����ֻͨ��ָ�����Ӷ�������ͺ����ݾͿ��Թ�������.
 * �û���֪���ڲ��ľ��幹��ϸ�ڡ�
 * �÷�����Ϊ�˽��������Ӷ���Ĺ��̺����Ĳ������
 * ���������ģʽ��ʹ�ó�����
 * ��Ʒ���ǳ��ĸ��ӣ����߲�Ʒ���еĵ���˳��ͬ������ͬ��Ч�ܡ�
 * @author liumengxi
 *
 */
public abstract class abstractMusicBuilder {
	
	
	/**
	 * �����ߴ�����Ӧ�����ʵ��
	 * 
	 * �˴��Ľ�����ģʽ�빤��ģʽ�ǳ����ƣ����ǻ�����ϸ΢�Ĳ��
	 * ��𣺽�����ģʽ������Ҫ���ܾ��ǻ��������ĵ��ò��˳���ţ�Ҳ���ǻ��������Ѿ�ʵ���ˣ�
	 * �����������ص��ڴ���������װ˳���򲻹��ġ�
	 * 
	 * 
	 * @return
	 */
	public abstract abstractMusic makeMusic();
	
	public abstract void setSequeueList(ArrayList<String> arrayList);

}
