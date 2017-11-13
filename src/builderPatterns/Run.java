package builderPatterns;

import builderPatterns.abstractMusic.chineseMusicModel;
import builderPatterns.abstractMusic.englishMusicModel;
import builderPatterns.director.directorMusic;

/**
 * ���Դ����������
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		directorMusic dm = new directorMusic();
		
		//�����й�������
		chineseMusicModel cmm = dm.makeChineseMusic();
		
		cmm.produceMusic();
		
		//����Ӣ�׷�����
		englishMusicModel emm = dm.makeEnglishMusic();
		
		emm.produceMusic();
		
	}

}
