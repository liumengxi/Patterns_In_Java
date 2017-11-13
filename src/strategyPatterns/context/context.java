package strategyPatterns.context;

import strategyPatterns.computer.computer;

/**
 * 策略类，具体使用某种电脑机型
 * Strategy是属于设计模式中 对象行为型模式,主要是定义一系列的算法,把这些算法一个个封装成单独的类.
 * Stratrgy应用比较广泛,比如, 公司经营业务变化图, 可能有两种实现方式,一个是线条曲线,一个是框图(bar),这是两种算法,可以使用Strategy实现.
 * Stratrgy优点：体现了高内聚低耦合的特性，增强扩展性
 * 
 * Strategy适合下列场合:
 * 1.以不同的格式保存文件;
 * 2.以不同的算法压缩文件;
 * 3.以不同的算法截获图象;
 * 4.以不同的格式输出同样数据的图形,比如曲线 或框图bar等
 * @author liumengxi
 *
 */
public class context {
	
	private computer com;
	
	public context(computer com){
		this.com = com;
	}
	
	/**
	 * 使用電腦機型
	 */
	public void use(){
		
		this.com.useageOf();
	}

}
