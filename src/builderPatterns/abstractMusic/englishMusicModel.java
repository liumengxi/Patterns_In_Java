package builderPatterns.abstractMusic;

/**
 * 英文歌曲制作过程
 * @author liumengxi
 *
 */
public class englishMusicModel extends abstractMusic {

	@Override
	protected void musicName() {
		System.out.println("英文歌曲名称.");

	}

	@Override
	protected void musicWord() {
		System.out.println("英文歌曲词.");

	}

	@Override
	protected void musicDesc() {
		System.out.println("英文歌曲背景描述.");

	}

	@Override
	protected void musicVideo() {
		System.out.println("英文歌曲MV.");

	}

}
