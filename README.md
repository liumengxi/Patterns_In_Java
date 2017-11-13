# Patterns_In_Java
设计模式

创建模式

1、设计模式之Factory (简单工厂)
 工厂模式：提供创建对象的接口
  工厂模式的设计好处：
  
  1)、将创建实例与使用实例的工作分开，实现代码之间的松耦合。
  
  2)、创建实例的方法写入工厂类中，易于对代码的维护。
  
  3)、灵活性、扩展性更强。如果业务有改动，只需修改工厂类中的创建实例方法即可。
  
  

2、设计模式之abstractFactory(抽象工厂)
抽象工厂类：提供创建对象实例的抽象类
抽象工厂设计优点：

  1)、将创建对象实例的方法提取出在抽象类中实现，其子类更专注于何时创建实例，不用注重如何实例化。（将共同的部分封装在抽象类中，提供各种不同的子类实现）
  
  2)、实现了程序间的松耦合
  
  3)、易于维护与扩展
   
3、设计模式之prototype(原型)
定义：用原型实例指定创建地址对象的种类，并且通过拷贝这些原型创建新的对象。
工作原理：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建对象请求原型对象拷贝它们自己来实施创建的。
不通过new关键字来产生一个对象，而是通过对象拷贝来实现的模式就叫做原型模式。

在JAVA中使用原型模式就是clone()方法时，需要注意的事项：

1)、对象拷贝时，类的构造函数是不会被执行的。

2)、浅拷贝和深拷贝

浅拷贝：Object类提供的方法clone只是拷贝本对象，其对象内部的数组，引用对象等都不拷贝，还是指向原生对象的内部元素地址。其他类型比如int，long，String等都会被拷贝。

深拷贝：object类中的clone方法，对数组或者引用对象进行单独拷贝，实现完全拷贝，这样克隆的对象中的变量就会互不影响。

4、设计模式之singleton(单例)

主要作用是在Java程序中，一个类Class类只有一个实例存在

立即加载/饿汉模式

延迟加载/懒汉模式

静态内部类实现单例

5、设计模式之Builder(建造者)

将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

Builder模式是一步一步创建一个复杂的对象,它允许用户可以只通过指定复杂对象的类型和内容就可以构建它们.用户不知道内部的具体构建细节。

用法：是为了将构建复杂对象的过程和它的部件解耦。

建造者设计模式的使用场景：产品类别非常的复杂，或者产品类中的调用顺序不同产生不同的效能。


  
  
结构模式

1、设计模式之facade(外观或门面) 

facade的定义：为子系统中的一组接口提供一个一致的界面。

经典应用就是数据库JDBC的应用，每次做增删改查操作时都需要对数据库进行连接操作，大大降低了效率。通过使用门面设计模式(facade)将公共部分

抽取出一个接口，如果需要对数据库进行连接操作的时候，调用该接口。这样做既提高了效率，又大大增强了灵活性。如果更换数据库，只需修改接口中的连接信息即可。

facade模式是理清系统间的关系，降低系统间耦合度的一个常用方法。


2、设计模式之proxy(代理)

设计模式中定义: 为其他对象提供一种代理以控制对这个对象的访问.

为什么要使用Proxy?

1）、授权机制

2）、某个客户端不能直接操作到某个对象，但又必须和那个对象有所互动。

代理模式主要使用了Java的多态，被代理类主要是执行，代理类主要是接收。
 

3、设计模式之Adapter(适配器) 

定义:
将两个不兼容的类纠合在一起使用，属于结构型模式,需要有Adaptee(被适配者)和Adaptor(适配器)两个身份.

旨在将两个类组织在一起，实际上是将组合方法(composition)和继承(inheritance)方法综合运用。


4、设计模式之Composite(组合)

定义：将对象以树形结构组织起来,以达成“部分－整体” 的层次结构，使得客户端对单个对象和组合对象的使用具有一致性.

composite组合模式（也叫合成模式），有时又叫做部分-整体模式（part-whole）主要是用来描述整体与部分的关系，用的最多的地方就是树形结构。

组合体内这些对象都有共同的接口（此处使用继承抽象类），当组合体一个对象的方法被调用执行时，Composite将遍历整个树形结构，寻找同样包含这个方法的对象并实现调用执行。可以用牵一动百来形容。

Composite好处:

1)、使客户端调用简单，客户端可以一致的使用组合结构或其中单个对象，用户就不必关心自己所处理的是单个对象还是整个组合机构，这就简化了客户端代码。

2)、更容易在组合内加入对象部件，客户端不必因为加入了新的对象而更改代码。

Compostie角色：

1)、Component 定义参加组合的对象的共有方法和属性，可以定义一些默认的行为或属性。比如例子中的getBookInfo()就封装在抽象类中。该方法是获取书籍分类信息。

2)、bookFinlType：叶子对象，其下再也没有其他的分支

3)、bookType：树枝对象，它的作用是组合树枝节点和叶子节点。

Composite分类：

1)、透明模式(把用来组合使用的方法放到抽象类中，比如add()、remove()等)

2)、安全模式


5、设计模式之Decorator（装饰）

Decorator(装饰模式)定义:动态给一个对象添加一些额外的职责，就像是在墙上刷油漆，使用Decorator模式相比用生成子类方式达到功能的扩充显的更加灵活。
使用Decorator的理由是:这些功能需要由用户动态决定加入的方式和时机.Decorator提供了"即插即用"的方法,在运行期间决定何时增加何种功能.
装饰类是对继承的有力补充，继承可以解决实际问题，但在项目中需要考虑到易用性、复用性、扩展性、所以装饰模式可以替代继承，动态的增加功能。


6、设计模式之bridge(桥梁)

Bridge定义 :

将抽象和行为划分开来,各自独立,但能动态的结合.

桥梁模式的优点是类间的解耦，两个角色（抽象和行为）可以自己扩展下去，不会互相影响。这也符合ocp原则。

Bridge模式在EJB中的应用

EJB中有一个Data Access Object (DAO)模式,这是将商业逻辑和具体数据资源分开的,因为不同的数据库有不同的数据库操作.将操作不同数据库的行为独立抽象成一个行为接口DAO.

7、设计模式之Flyweight（享元）

Flyweight定义:

避免大量拥有相同内容的小类的开销(如耗费内存),使大家共享一个类(元类).

Flyweight模式是一个提高程序效率和性能的模式,会大大加快程序的运行速度.

应用场合很多:比如你要从一个数据库中读取一系列字符串,这些字符串中有许多是重复的,那么我们可以将这些字符串储存在Flyweight池(pool)中.



行为模式

1、设计模式之Template(模板方法)

定义一个操作中算法的骨架，将一些步骤的执行延迟到其子类中。其实java的抽象类本来就是Template模式

模板方法模式
	 
	 * 定义了方法的执行顺序，此方法为final，子类无法修改该类，这个方法就叫做模板方法
	
	 * produceWaiShe、produceZhuJ、produceScreen这三个方法是子类必须实现的，并且对应不同的类，叫做基本方法。
	 
	 * 基本方法分为三种：
	 
	 * 抽象类中实现的方法叫做“具体方法”
	 
	 * 抽象类没有实现，子类实现的方法叫做“抽象方法”
	 
	 * 抽象类实现的方法，子类可以重写的，叫做“钩子方法”
	 

2、设计模式之Memento(备忘机制)

Memento定义:

memento是一个保存另外一个对象内部状态拷贝的对象.这样以后就可以将该对象恢复到原先保存的状态.

Memento模式在Jsp+Javabean中的应用

在Jsp应用中,我们通常有很多表单要求用户输入,比如用户注册,需要输入姓名和Email等, 如果一些表项用户没有填写或者填写错误,我们希望在用户按"提交Submit"后,通过Jsp程序检查,发现确实有未填写项目,则在该项目下红字显示警告或错误,同时,还要显示用户刚才已经输入的表项.


3、设计模式之Observer(观察者)

Observer(观察者)模式是比较常用的一个模式,尤其在界面设计中应用广泛
如何使用：

Java的API还为为我们提供现成的Observer接口Java.util.Observer.我们只要直接使用它就可以.

1.提供Add/Delete observer的方法;

2.提供通知(notisfy) 所有observer的方法;

观察者模式有另一个名称叫做发布/订阅模型(Publish/Subscribe)
 *  使用场景：
 *  实现消息的广播，一个消息可以出发多个事件。
 *  观察者模式需要解决的两个重点问题：
 *  广播链的问题。（一个观察者模式最多出现一个对象既是观察者也是被观察者。）
 *  异步处理问题。（如果观察者较多，可以使用异步处理方式。）
 
4、设计模式之Chain of Responsibility(职责链)

Chain of Responsibility定义
Chain of Responsibility(CoR) 是用一系列类(classes)试图处理一个请求request,这些类之间是一个松散的耦合,唯一共同点是在他们之间传递request. 
也就是说，来了一个请求，A类先处理，如果没有处理，就传递到B类处理，如果没有处理，就传递到C类处理，就这样象一个链条(chain)一样传递下去。

5、设计模式之Command(命令)

Command定义

不少Command模式的代码都是针对图形界面的,它实际就是菜单命令,我们在一个下拉菜单选择一个命令时,然后会执行一些动作
将这些命令封装成在一个类中,然后用户(调用者)再对这个类进行操作,这就是Command模式,换句话说,
本来用户(调用者)是直接调用这些命令的,如菜单上打开文档(调用者),就直接指向打开文档的代码,使用Command模式,就是在这两者之间增加一个中间者,
将这种直接关系拗断,同时两者之间都隔离,基本没有关系了.

6、设计模式之state（状态模式）

State的定义: 不同的状态,不同的行为;或者说,每个状态有着相应的行为.


何时使用：

State模式在实际使用中比较多,适合"状态的切换".因为我们经常会使用If elseif else 进行状态切换, 
如果针对状态的这样判断切换反复出现,我们就要联想到是否可以采取State模式了.
不只是根据状态,也有根据属性.如果某个对象的属性不同,对象的行为就不一样,这点在数据库系统中出现频率比较高,我们经常会在一个数据表的尾部,
加上property属性含义的字段,用以标识记录中一些特殊性质的记录,这种属性的改变(切换)又是随时可能发生的,就有可能要使用State.

7、设计模式之Strategy（策略模式）

Strategy是属于设计模式中 对象行为型模式,主要是定义一系列的算法,把这些算法一个个封装成单独的类.

Stratrgy应用比较广泛,比如, 公司经营业务变化图, 可能有两种实现方式,一个是线条曲线,一个是框图(bar),这是两种算法,可以使用Strategy实现.

Stratrgy优点：体现了高内聚低耦合的特性，增强扩展性


Strategy适合下列场合:

1).以不同的格式保存文件;

2).以不同的算法压缩文件;

3).以不同的算法截获图象;

4).以不同的格式输出同样数据的图形,比如曲线 或框图bar等

8、设计模式之Mediator(中介者)
Mediator定义:
用一个中介对象来封装一系列关于对象交互行为.

为何使用Mediator?
各个对象之间的交互操作非常多;每个对象的行为操作都依赖彼此对方,修改一个对象的行为,同时会涉及到修改很多其他对象的行为,如果使用Mediator模式
,可以使各个对象间的耦合松散,只需关心和 Mediator的关系,使多对多的关系变成了一对多的关系,可以降低系统的复杂性,提高可修改扩展性.
Mediator模式在事件驱动类应用中比较多,例如界面设计GUI.;聊天,消息传递等,

 什么情况下使用中介者模式:
 
   1)、 N 个对象之间产生了相互的依赖关系，其中N 大于2，注意是相互的依赖；
   
   2)、 多个对象有依赖关系，但是依赖的行为尚不确定或者有发生改变的可能，在这种情况下一般建议采用中介者模式，降低变更引起的风险扩散；
   
   3)、 产品开发。其中一个明显的例子就是MVC 框架，把这个应用到产品中，可以提升产品的性能和扩展性，但是作为项目开发就未必，项目是以交付投产为目标，而产品以稳定、高效、扩展为宗旨。
   

9、设计模式之Interpreter(解释器)
Interpreter定义:
定义语言的文法 ,并且建立一个解释器来解释该语言中的句子.


10、设计模式之Visitor(访问者)

Visitor定义
作用于某个对象群中各个对象的操作. 它可以使你在不改变这些对象本身的情况下,定义作用于这些对象的新操作.

11、设计模式之iterator(迭代)

继承java.util.Iterable接口，通过iterator()方法去遍历聚集类中的所有方法和属性。



最后补充下类的设计原则

六大设计原则：

1、单一设计原则(Single Responsibility Principle)

单一设计原则：应该有且仅有一个原因引起类的变更

单一原则的好处：

1)、类的复杂性降低

2)、可读性提高

3)、可维护性提高

4)、变更引起的风险降低

2、里氏替换原则(Liskov Substitution Principle)

里氏替换原则:所有引用基类的地方必须能透明地使用其子类的对象。

1)、子类必须完全的实现父类的方法。

2)、子类可以有自己的个性。

3)、覆盖或实现父类的方法时输入参数可以被放大。（子类中方法的前置条件必须与超类中被覆盖的方法的前置条件相同或者更宽松。）

4)、覆盖或实现父类的方法是输出结果可以被缩小。

3、依赖倒置原则(Dependence Inversion Principle)

4、接口隔离原则(Interface Segregation Principle)


1)、接口尽量小。

2)、接口要高内聚。

3)、定制服务

4)、接口设计是有限度的。

5、迪米特法则(Low Of Demeter)

只和朋友交流。

朋友间也是有距离的。

是自己的就是自己的。

谨慎使用Serializable。

迪米特法则就要求类“小气”一点，尽量不要对外公布太多的public 方法和非静态的public 变量，尽量内敛，多使用private,package-private、protected 等访问权限

6、开闭原则
