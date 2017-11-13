package commandPatterns.army;

/**
 * 陆军实现类
 * @author liumengxi
 *
 */
public class landArmy extends Army {

	@Override
	public void rest() {

		System.out.println("陆军进行休整...");
	}

	@Override
	public void back() {
		
		System.out.println("陆军撤退...");

	}

	@Override
	public void come() {
		
		System.out.println("陆军進行演練.....");
	}

}
