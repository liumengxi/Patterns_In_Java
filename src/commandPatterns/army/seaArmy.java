package commandPatterns.army;

/**
 * 海军
 * @author liumengxi
 *
 */
public class seaArmy extends Army {

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("海軍进行休整...");

	}

	@Override
	public void back() {
		// TODO Auto-generated method stub

		System.out.println("海軍进行撤退...");
	}

	@Override
	public void come() {
		// TODO Auto-generated method stub
		System.out.println("海軍进行進行演練...");

	}

}
