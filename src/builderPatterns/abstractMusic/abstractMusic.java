package builderPatterns.abstractMusic;

import java.util.ArrayList;

/**
 * 建造者模式 抽象音乐类
 * 
 * @author liumengxi
 * 
 */
public abstract class abstractMusic {

	private ArrayList<String> sequeueList = new ArrayList<String>();

	// 音乐名称
	protected abstract void musicName();

	// 音乐词
	protected abstract void musicWord();

	// 音乐描述
	protected abstract void musicDesc();

	// 音乐MV
	protected abstract void musicVideo();

	/**
	 * 根据不同的音乐顺序来创作音乐
	 */
	public final void produceMusic() {

		for (int i = 0; i < sequeueList.size(); i++) {
			// 获取音乐制作顺序
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
	 * 设置音乐制作顺序
	 * @param sequeueList
	 */
	public final void setSequeueList(ArrayList<String> sequeueList) {
		this.sequeueList = sequeueList;
	}

}
