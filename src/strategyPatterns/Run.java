package strategyPatterns;

import strategyPatterns.computerImpl.lenovoComputer;
import strategyPatterns.computerImpl.thinkingPadComputer;
import strategyPatterns.computerImpl.waiXingComputer;
import strategyPatterns.context.context;

/**
 * 策略模式测试类
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
		 * 適用與學習型的機器
		 */
		thinkingPadComputer tpc = new thinkingPadComputer();
		
		con = new context(tpc);
		
        con.use();		
        
        System.out.println("**********************************");
		
        /**
         * 適用於辦公型的機器
         */
        lenovoComputer lc = new lenovoComputer();
        
        con = new context(lc);
        
        con.use();
        
        System.out.println("**********************************");
		
		
        /**
         * 適用於遊戲型的機器
         */
        waiXingComputer wxc = new waiXingComputer();
        
        con = new context(wxc);
        
        con.use();
		
		
	}

}
