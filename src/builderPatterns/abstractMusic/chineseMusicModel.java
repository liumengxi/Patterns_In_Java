package builderPatterns.abstractMusic;

/**
 * 中文音乐制作过程
 * @author liumengxi
 *
 */
public class chineseMusicModel extends abstractMusic {

	@Override
	protected void musicName() {

		System.out.println("中文歌曲名称.");
	}

	@Override
	protected void musicWord() {
		System.out.println("中文歌曲词.");
	}

	@Override
	protected void musicDesc() {
		System.out.println("中文歌曲描述.");
	}

	@Override
	protected void musicVideo() {
		System.out.println("中文歌曲MV.");
	}

}
