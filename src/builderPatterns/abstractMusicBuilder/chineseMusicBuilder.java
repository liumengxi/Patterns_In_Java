package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.chineseMusicModel;

/**
 * �������ֽ�����
 * @author liumengxi
 *
 */
public class chineseMusicBuilder extends abstractMusicBuilder {

	/**
	 * ʵ�����������ֵ�ʵ��������ģʽ���ظ��û����ʵ���������Ѿ����ź�ִ�з���˳���ʵ����
	 */
	private chineseMusicModel cmm = new chineseMusicModel();
	
	public chineseMusicBuilder(){
		
	}
	
	
	/**
	 * �����������ִ�����ʵ��
	 */
	@Override
	public chineseMusicModel makeMusic() {
		
		return this.cmm;

	}

	/**
	 * ������������˳��
	 * �÷����������������֡�ʵ������ʲô����˳����ִ�з���
	 */
	@Override
	public void setSequeueList(ArrayList<String> sequeueMusicList) {
		
		cmm.setSequeueList(sequeueMusicList);

	}

}
