/**
 * û�з�װ�Ĵ�������һЩ����
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
		p.name = "С��";
		p.age = -45;//�������ͨ�����ַ�ʽ���⸳ֵ��û���κ�����
		System.out.println(p);
	}
}
