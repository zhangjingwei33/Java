/**
 * 自定义异常类
 */
package OO;
/**IllegalAgeException:非法年龄异常，继承Exception类*/
class IllegalAgeException extends Exception{
	//默认构造器
	public IllegalAgeException() {
		
	}
	//带有详细信息的构造器，信息存储在message中
	public IllegalAgeException(String message) {
		super(message);
	}
}
class Person5{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) throws IllegalAgeException{
		if(age < 0) {
			throw new IllegalAgeException("人的年龄不应该为负数");
		}
		this.age = age;
	}
	
	public String toString() {
		return "name is "+name+" and age is "+age;
	}
}

public class TestMyException {
	public static void main(String[] args) {
		Person5 p = new Person5();
		try {
			p.setName("zjw");
			p.setAge(-22);
		}catch(IllegalAgeException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println(p);
	}
}
