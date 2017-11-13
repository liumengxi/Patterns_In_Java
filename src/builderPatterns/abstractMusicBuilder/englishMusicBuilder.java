package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.englishMusicModel;

/**
 * 英文歌曲建造者
 * @author liumengxi
 *
 */
public class englishMusicBuilder extends abstractMusicBuilder {

	/**
	 * 实例化英文音乐的实例，建造模式返回给用户后的实例，就是已经安排好执行方法顺序的实例。
	 */
	private englishMusicModel emm = new englishMusicModel();
	
	public englishMusicBuilder(){
		
	}
	
	/**
	 * 返回英文歌曲实例
	 */
	@Override
	public englishMusicModel makeMusic() {
		return this.emm;
	}

	/**
	 * 设置制作音乐的顺序
	 * 该方法决定“中文音乐”实例按照什么样的顺序来执行方法
	 */
	@Override
	public void setSequeueList(ArrayList<String> sequeueMusicList) {
		
		this.emm.setSequeueList(sequeueMusicList);

	}

}
