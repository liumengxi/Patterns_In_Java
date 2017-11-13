package facadePatterns.Letter;

/**
 * д�ŵĹ��̽ӿ�
 * @author liumengxi
 *
 */
public interface ILetter {
	
	//д�ŵ�����
	public void letterContext(String context);
	
	//��д�ŷ�����
	public void fillEnvelope(String address);
	
	//���ŷ����ŷ�
	public void letterIntoEnvelope();
	
	//�����ż�
	public void sendLetter();

}
