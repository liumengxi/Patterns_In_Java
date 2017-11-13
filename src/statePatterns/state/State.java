package statePatterns.state;

import java.awt.Color;

import statePatterns.context.Context;

/**
 * 状态切换类
 * State的定义: 不同的状态,不同的行为;或者说,每个状态有着相应的行为.
 * 何时使用：
 * State模式在实际使用中比较多,适合"状态的切换".因为我们经常会使用If elseif else 进行状态切换, 
 * 如果针对状态的这样判断切换反复出现,我们就要联想到是否可以采取State模式了.
 * 不只是根据状态,也有根据属性.如果某个对象的属性不同,对象的行为就不一样,这点在数据库系统中出现频率比较高,我们经常会在一个数据表的尾部,
 * 加上property属性含义的字段,用以标识记录中一些特殊性质的记录,这种属性的改变(切换)又是随时可能发生的,就有可能要使用State.
 * @author liumengxi
 */
public abstract class State{

	public abstract void handlepush(Context c);
	public abstract void handlepull(Context c);
	public abstract Color getcolor();

	}
	 

