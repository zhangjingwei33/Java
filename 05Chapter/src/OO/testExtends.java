/**
 * 测试使用extends实现继承
 * @author dell
 *
 */
package OO;

public class testExtends {
	public static void main(String[] args) {
		Student s = new Student("张敬畏",173,"java");
		s.rest();
		s.study();
	}
}

class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("休息一会！");
	}
}

class Student extends Person{
	String major;//专业
	public void study() {
		System.out.println("跟高淇老师学java");
	}
	public Student(String name,int height,String major) {
		//天然拥有父类的属性
		this.name = name;
		this.height = height;
		this.major = major;
	}
}