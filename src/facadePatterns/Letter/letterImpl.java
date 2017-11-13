package facadePatterns.Letter;

/**
 * �ż���ʵ����
 * @author liumengxi
 *
 */
public class letterImpl implements ILetter {

	/**
	 * �ż�����
	 */
	@Override
	public void letterContext(String context) {
		
		System.out.println(context);

	}
    /**
     * �ŷ�����
     */
	@Override
	public void fillEnvelope(String address) {
		
		System.out.println(address);

	}

	/**
	 * �ż������ŷ�
	 */
	@Override
	public void letterIntoEnvelope() {
		
		System.out.println("���ż������ŷ��У�׼������..");

	}

	/**
	 * �����ż�
	 */
	@Override
	public void sendLetter() {
		System.out.println("�����ż�....");

	}

}
