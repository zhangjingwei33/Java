/**
 * 没有封装的代码会出现一些问题
 */
package OO;
class Person2{
	String name;
	int age;
	@Override
	public String toString() {
		return "Person [name="+name+"age="+age+"]";
	}
}
public class TestEncapsulation {
	public static void main(String[] args) {
		Person2 p = new Person2();
		p.name = "小红";
		p.age = -45;//年龄可以通过这种方式随意赋值，没有任何限制
		System.out.println(p);
	}
}
