package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.englishMusicModel;

/**
 * Ӣ�ĸ���������
 * @author liumengxi
 *
 */
public class englishMusicBuilder extends abstractMusicBuilder {

	/**
	 * ʵ����Ӣ�����ֵ�ʵ��������ģʽ���ظ��û����ʵ���������Ѿ����ź�ִ�з���˳���ʵ����
	 */
	private englishMusicModel emm = new englishMusicModel();
	
	public englishMusicBuilder(){
		
	}
	
	/**
	 * ����Ӣ�ĸ���ʵ��
	 */
	@Override
	public englishMusicModel makeMusic() {
		return this.emm;
	}

	/**
	 * �����������ֵ�˳��
	 * �÷����������������֡�ʵ������ʲô����˳����ִ�з���
	 */
	@Override
	public void setSequeueList(ArrayList<String> sequeueMusicList) {
		
		this.emm.setSequeueList(sequeueMusicList);

	}

}
