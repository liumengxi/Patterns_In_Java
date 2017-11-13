package builderPatterns.director;

import java.util.ArrayList;

import builderPatterns.abstractMusic.chineseMusicModel;
import builderPatterns.abstractMusic.englishMusicModel;
import builderPatterns.abstractMusicBuilder.chineseMusicBuilder;
import builderPatterns.abstractMusicBuilder.englishMusicBuilder;


/**
 * 设置音乐创造的顺序
 * @author liumengxi
 * 此类的功能是构建什么样的音乐制作过程，如何设置一步步制作过程
 * 最终返回构建后的实例
 *
 */
public class directorMusic {
	
	
	private ArrayList<String> sequeueMusicList = new ArrayList<String>();
	//中文歌曲建造者
	private chineseMusicBuilder cmb = new chineseMusicBuilder();
	//英文歌曲建造者
	private englishMusicBuilder emb = new englishMusicBuilder();
	
	/**
	 * 创建中国风音乐总过程
	 * @return
	 */
	public chineseMusicModel makeChineseMusic(){
		
		//sequeueMusicList为全局变量，设置时，需清除掉内容
		sequeueMusicList.clear();
		
		//首先，创造音乐歌词
		sequeueMusicList.add("musicWord");
		//创造音乐名称
		sequeueMusicList.add("musicName");
		//创造音乐描述
		sequeueMusicList.add("musicDesc");
		//创造音乐MV
		sequeueMusicList.add("musicMV");
		
		this.cmb.setSequeueList(sequeueMusicList);
		
		return this.cmb.makeMusic();
		
	}
	
	
	/**
	 * 创建英伦范音乐总过程
	 * @return
	 */
	public englishMusicModel makeEnglishMusic(){
		
		//sequeueMusicList为全局变量，设置时，需清除掉内容
		sequeueMusicList.clear();
		
		//首先，创造音乐歌词
		sequeueMusicList.add("musicName");
		//创造音乐背景描述
		sequeueMusicList.add("musicDesc");
		//创造音乐名称
		sequeueMusicList.add("musicWord");
		//创造音乐MV
		sequeueMusicList.add("musicMV");
		
		this.emb.setSequeueList(sequeueMusicList);
		
		return this.emb.makeMusic();
		
	}


}
