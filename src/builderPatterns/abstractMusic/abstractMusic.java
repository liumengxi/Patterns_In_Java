package builderPatterns.abstractMusic;

import java.util.ArrayList;

/**
 * ������ģʽ ����������
 * 
 * @author liumengxi
 * 
 */
public abstract class abstractMusic {

	private ArrayList<String> sequeueList = new ArrayList<String>();

	// ��������
	protected abstract void musicName();

	// ���ִ�
	protected abstract void musicWord();

	// ��������
	protected abstract void musicDesc();

	// ����MV
	protected abstract void musicVideo();

	/**
	 * ���ݲ�ͬ������˳������������
	 */
	public final void produceMusic() {

		for (int i = 0; i < sequeueList.size(); i++) {
			// ��ȡ��������˳��
			String sequeueMusicString = sequeueList.get(i);
			if ("musicName".equals(sequeueMusicString)) {
				this.musicName();
			} else if ("musicWord".equals(sequeueMusicString)) {
				this.musicWord();
			} else if ("musicDesc".equals(sequeueMusicString)) {
				this.musicDesc();
			} else {
				this.musicVideo();
			}

		}
	}

	/**
	 * ������������˳��
	 * @param sequeueList
	 */
	public final void setSequeueList(ArrayList<String> sequeueList) {
		this.sequeueList = sequeueList;
	}

}
