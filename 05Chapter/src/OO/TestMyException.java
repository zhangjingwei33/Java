/**
 * �Զ����쳣��
 */
package OO;
/**IllegalAgeException:�Ƿ������쳣���̳�Exception��*/
class IllegalAgeException extends Exception{
	//Ĭ�Ϲ�����
	public IllegalAgeException() {
		
	}
	//������ϸ��Ϣ�Ĺ���������Ϣ�洢��message��
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
			throw new IllegalAgeException("�˵����䲻Ӧ��Ϊ����");
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
