package commandPatterns.command;

import commandPatterns.army.landArmy;
import commandPatterns.army.seaArmy;
import commandPatterns.army.skyArmy;

/**
 * �������������
 * Command����
 * ����Commandģʽ�Ĵ��붼�����ͼ�ν����,��ʵ�ʾ��ǲ˵�����,������һ�������˵�ѡ��һ������ʱ,Ȼ���ִ��һЩ����
 * ����Щ�����װ����һ������,Ȼ���û�(������)�ٶ��������в���,�����Commandģʽ,���仰˵,
 * �����û�(������)��ֱ�ӵ�����Щ�����,��˵��ϴ��ĵ�(������),��ֱ��ָ����ĵ��Ĵ���,ʹ��Commandģʽ,������������֮������һ���м���,
 * ������ֱ�ӹ�ϵ�ֶ�,ͬʱ����֮�䶼����,����û�й�ϵ��.
 * @author liumengxi
 *
 */
public abstract class command {
	
	//½��
	protected landArmy la = new landArmy();
	//����
	protected seaArmy sa = new seaArmy();
	//�վ�
	protected skyArmy skya = new skyArmy();
	
	//ִ������
	public abstract void execute();
	

}
