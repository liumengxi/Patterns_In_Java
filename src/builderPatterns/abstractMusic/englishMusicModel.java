package builderPatterns.abstractMusic;

/**
 * Ӣ�ĸ�����������
 * @author liumengxi
 *
 */
public class englishMusicModel extends abstractMusic {

	@Override
	protected void musicName() {
		System.out.println("Ӣ�ĸ�������.");

	}

	@Override
	protected void musicWord() {
		System.out.println("Ӣ�ĸ�����.");

	}

	@Override
	protected void musicDesc() {
		System.out.println("Ӣ�ĸ�����������.");

	}

	@Override
	protected void musicVideo() {
		System.out.println("Ӣ�ĸ���MV.");

	}

}
