package commandPatterns.army;

/**
 * ½��ʵ����
 * @author liumengxi
 *
 */
public class landArmy extends Army {

	@Override
	public void rest() {

		System.out.println("½����������...");
	}

	@Override
	public void back() {
		
		System.out.println("½������...");

	}

	@Override
	public void come() {
		
		System.out.println("½���M���ݾ�.....");
	}

}
