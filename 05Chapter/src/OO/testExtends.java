/**
 * ����ʹ��extendsʵ�ּ̳�
 * @author dell
 *
 */
package OO;

public class testExtends {
	public static void main(String[] args) {
		Student s = new Student("�ž�η",173,"java");
		s.rest();
		s.study();
	}
}

class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("��Ϣһ�ᣡ");
	}
}

class Student extends Person{
	String major;//רҵ
	public void study() {
		System.out.println("�������ʦѧjava");
	}
	public Student(String name,int height,String major) {
		//��Ȼӵ�и��������
		this.name = name;
		this.height = height;
		this.major = major;
	}
}