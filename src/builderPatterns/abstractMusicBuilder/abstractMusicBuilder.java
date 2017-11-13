package builderPatterns.abstractMusicBuilder;

import java.util.ArrayList;

import builderPatterns.abstractMusic.abstractMusic;

/**
 * 音乐建造者抽象类
 * 建造者模式(Builder)
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * (Builder)建造者模式是一步一步创建一个复杂的对象,它允许用户可以只通过指定复杂对象的类型和内容就可以构建它们.
 * 用户不知道内部的具体构建细节。
 * 用法：是为了将构建复杂对象的过程和它的部件解耦。
 * 建造者设计模式的使用场景：
 * 产品类别非常的复杂，或者产品类中的调用顺序不同产生不同的效能。
 * @author liumengxi
 *
 */
public abstract class abstractMusicBuilder {
	
	
	/**
	 * 建造者创建相应对象的实例
	 * 
	 * 此处的建造者模式与工厂模式非常相似，但是还是又细微的差别
	 * 差别：建造者模式的最主要功能就是基本方法的调用差别顺序安排，也就是基本方法已经实现了，
	 * 而工厂方法重点在创建对象，组装顺序则不关心。
	 * 
	 * 
	 * @return
	 */
	public abstract abstractMusic makeMusic();
	
	public abstract void setSequeueList(ArrayList<String> arrayList);

}
