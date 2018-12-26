/**
 * 方法的重写需要符合下面的三个要点：

      1.“==”： 方法名、形参列表相同。

      2.“≤”：返回值类型和声明异常类型，子类小于等于父类。

      3.“≥”： 访问权限，子类大于等于父类。
 */
package OO;

public class testOverride {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Horse();
		Vehicle v3 = new Plane();
		v1.run();
		v2.run();
		v3.run();
		v2.stop();
		v3.stop();
	}
}
class Vehicle{//交通工具类
	public void run() {
			System.out.println("跑...");
		}
	public void stop() {
		System.out.println("停止不动");
	}
}
class Horse extends Vehicle{//马也是交通工具
	public void run() {//重写父类方法
		System.out.println("四蹄翻飞，嘚嘚嘚...");
	}
}
class Plane extends Vehicle{
	public void run() {//重写父类方法
		System.out.println("天上飞");
	}
	public void stop() {
		System.out.println("空中不能停，坠毁了！");
	}
}