package strategyPatterns;

import strategyPatterns.computerImpl.lenovoComputer;
import strategyPatterns.computerImpl.thinkingPadComputer;
import strategyPatterns.computerImpl.waiXingComputer;
import strategyPatterns.context.context;

/**
 * ����ģʽ������
 * @author liumengxi
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		context con;
		
		/**
		 * �m���c�W���͵ęC��
		 */
		thinkingPadComputer tpc = new thinkingPadComputer();
		
		con = new context(tpc);
		
        con.use();		
        
        System.out.println("**********************************");
		
        /**
         * �m����k���͵ęC��
         */
        lenovoComputer lc = new lenovoComputer();
        
        con = new context(lc);
        
        con.use();
        
        System.out.println("**********************************");
		
		
        /**
         * �m����[���͵ęC��
         */
        waiXingComputer wxc = new waiXingComputer();
        
        con = new context(wxc);
        
        con.use();
		
		
	}

}
