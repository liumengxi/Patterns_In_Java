package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.chineseMusicModel;

/**
 * 中文音乐建造者
 * @author liumengxi
 *
 */
public class chineseMusicBuilder extends abstractMusicBuilder {

	/**
	 * 实例化中文音乐的实例，建造模式返回给用户后的实例，就是已经安排好执行方法顺序的实例。
	 */
	private chineseMusicModel cmm = new chineseMusicModel();
	
	public chineseMusicBuilder(){
		
	}
	
	
	/**
	 * 返回中文音乐创造者实例
	 */
	@Override
	public chineseMusicModel makeMusic() {
		
		return this.cmm;

	}

	/**
	 * 设置制作音乐顺序
	 * 该方法决定“中文音乐”实例按照什么样的顺序来执行方法
	 */
	@Override
	public void setSequeueList(ArrayList<String> sequeueMusicList) {
		
		cmm.setSequeueList(sequeueMusicList);

	}

}
