package OO;
/*
class Outer1{
	//�൱���ⲿ���һ����̬��Ա
	static class Inner1{
		}
}
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//ͨ��new �ⲿ����.�ڲ�����() �������ڲ������
		Outer1.Inner1 inner = new Outer1.Inner1();
	}
}
*/
//�����е��ڲ���
public class TestStaticInnerClass{
	public void show() {
		//����������ڸ÷���
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
