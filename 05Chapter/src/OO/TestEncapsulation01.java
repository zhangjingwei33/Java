package OO;

class Person3{
	String name;
	private int age;
	public void setAge(int age)
	{
		if(age<0 || age>154)
		{
			System.out.println("请输入正确年龄！");
			return;
		}
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name="+name+"age="+age+"]";
	}
}
public class TestEncapsulation01 {
	public static void main(String[] args) {
		Person3 p = new Person3();
		p.name = "小红";
		//p.setAge(20);
		p.setAge(155);
		//p.age = -45;//年龄不可以通过这种方式随意赋值，有限制
		
		System.out.println(p);
	}
}