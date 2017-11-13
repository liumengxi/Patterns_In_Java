package builderPatterns;

import builderPatterns.abstractMusic.chineseMusicModel;
import builderPatterns.abstractMusic.englishMusicModel;
import builderPatterns.director.directorMusic;

/**
 * 测试创造各类音乐
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		directorMusic dm = new directorMusic();
		
		//创造中国风音乐
		chineseMusicModel cmm = dm.makeChineseMusic();
		
		cmm.produceMusic();
		
		//创造英伦范音乐
		englishMusicModel emm = dm.makeEnglishMusic();
		
		emm.produceMusic();
		
	}

}
