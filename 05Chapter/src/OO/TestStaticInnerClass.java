package OO;
/*
class Outer1{
	//相当于外部类的一个静态成员
	static class Inner1{
		}
}
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//通过new 外部类名.内部类名() 来创建内部类对象
		Outer1.Inner1 inner = new Outer1.Inner1();
	}
}
*/
//方法中的内部类
public class TestStaticInnerClass{
	public void show() {
		//作用域局限于该方法
		class Inner2{
			public void fun() {
				System.out.println("hello zjw");
			}
		}
		new Inner2().fun();
	}
	public static void main(String[] args) {
		new TestStaticInnerClass().show();
	}
}
