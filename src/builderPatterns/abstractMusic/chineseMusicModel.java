package builderPatterns.abstractMusic;

/**
 * ����������������
 * @author liumengxi
 *
 */
public class chineseMusicModel extends abstractMusic {

	@Override
	protected void musicName() {

		System.out.println("���ĸ�������.");
	}

	@Override
	protected void musicWord() {
		System.out.println("���ĸ�����.");
	}

	@Override
	protected void musicDesc() {
		System.out.println("���ĸ�������.");
	}

	@Override
	protected void musicVideo() {
		System.out.println("���ĸ���MV.");
	}

}
