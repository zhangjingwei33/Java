package OO;
/**外部类Outer*/
class Outer{
	private int age = 10;
	public void show() {
		System.out.println(age);//10
	}
	
	/*内部类Inner*/
    public class Inner {
		//内部类中可以声明与外部类同名的属性与方法
		private int age = 20;
		
		public void show() {
			int age = 30;
			System.out.println(age);//30
			System.out.println("内部类方法里的局部变量age:"+age);//30
			System.out.println("内部类的成员变量age:"+this.age);//20
			System.out.println("外部类的成员变量age"+Outer.this.age);//10
		}
	}
}

public static void TestInner() {
	public static void main(String[] args) {
		//先创建外部类实例，然后使用该外部类实例创建内部类实例
		Outer outer= new Outer();
		Outer.Inner inn= outer.new Inner();
		inn.show();
		
		Outer.Inner inner= new Outer().new Inner();
		
	}
}
