package facadePatterns.Letter;

/**
 * 写信的过程接口
 * @author liumengxi
 *
 */
public interface ILetter {
	
	//写信的内容
	public void letterContext(String context);
	
	//填写信封内容
	public void fillEnvelope(String address);
	
	//将信封入信封
	public void letterIntoEnvelope();
	
	//发送信件
	public void sendLetter();

}
