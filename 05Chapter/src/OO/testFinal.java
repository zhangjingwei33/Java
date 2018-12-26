/**
 * 1. 修饰变量: 被他修饰的变量不可改变。一旦赋了初值，就不能被重新赋值。

final  int   MAX_SPEED = 120;
      2. 修饰方法：该方法不可被子类重写。但是可以被重载!

final  void  study(){}
      3. 修饰类: 修饰的类不能被继承。
      比如：Math、String等。

final   class  A {}
 */
package OO; 
class Animal1{
	public final void shout() {
		System.out.println("叫了一声！");
	}
}
class Dog extends Animal1{
	public void shout() {//不能重写final修饰的方法
		System.out.println("旺旺旺！");
	}
}
final class Animal2{
	
}
class Dog1 extends Animal2{不能继承final修饰的类
	
}

public class testFinal {

}
