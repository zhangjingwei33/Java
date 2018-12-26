/**
 * 2018.11.1
 * @author dell
 *
 */
//每一个源文件必须有且只有一个public class
//并且类名和文件名保持一致
class Seat{
		int number;
	}
public class TestClass {
	//测试个车类
	//属性（成员变量）
	static String brand;
	int vaule;
	String country;
	static Seat seats;
	void introduce() {
		System.out.println("我是"+TestClass.brand+"，有"+
	seats.number+"座");
	}
	class Tyre{//一个java文件可以同时定义多个class
		
	}
	class Engine{
		//方法
		void form() {
			System.out.println("我是来自德国的发动机");
		}
	}
	
	//构造方法
	TestClass(){
		
	}
	public static void main(String[] args) {
		TestClass car1 = new TestClass();
		car1.brand = "奔驰";
		
		Seat seat1 = new Seat();//这个类在TestClass()对象外
		seat1.number = 7;
		TestClass.seats = seat1;
		car1.introduce();
	}
}
