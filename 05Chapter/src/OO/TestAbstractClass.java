/**
 * ·抽象方法

      使用abstract修饰的方法，没有方法体，只有声明。定义的是一种“规范”，就是告诉子类必须要给抽象方法提供具体的实现。

·抽象类

      包含抽象方法的类就是抽象类。通过abstract方法定义规范，然后要求子类必须定义具体实现。通过抽象类，我们就可以做到严格限制子类的设计，使子类之间更加通用。
 */
package OO;
//抽象类
abstract class Animal2{
	abstract public void shout();//抽象方法
}
class Dog2 extends Animal2{
	//子类必须实现父类的抽象方法，否则编译错误
	public void shout() {
		System.out.println("旺旺旺！");
	}
}
//测试抽象类
public class TestAbstractClass {
	public static void main(String[] args) {
		new Animal2();//抽象类不能实例化，即不能用new来实例化抽象类。
		Dog2 a=new Dog2();
		a.shout();
	}
}
