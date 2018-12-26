/*
 * 构造方法向上追溯执行测试
 */
package OO;

public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象。。。");
		new ChildClass1();
	}
}
class FatherClass1{
	public FatherClass1() {
		System.out.println("创建FatherClass");
	}
}
class ChildClass1 extends FatherClass1{
	public ChildClass1() {
		//super();子类会默认有super()这个函数
		System.out.println("创建ChildClass");
	}
}