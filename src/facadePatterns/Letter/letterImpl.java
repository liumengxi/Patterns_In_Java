package facadePatterns.Letter;

/**
 * 信件的实现类
 * @author liumengxi
 *
 */
public class letterImpl implements ILetter {

	/**
	 * 信件内容
	 */
	@Override
	public void letterContext(String context) {
		
		System.out.println(context);

	}
    /**
     * 信封内容
     */
	@Override
	public void fillEnvelope(String address) {
		
		System.out.println(address);

	}

	/**
	 * 信件封入信封
	 */
	@Override
	public void letterIntoEnvelope() {
		
		System.out.println("将信件封入信封中，准备发送..");

	}

	/**
	 * 发送信件
	 */
	@Override
	public void sendLetter() {
		System.out.println("发送信件....");

	}

}
