/*
 * ���췽������׷��ִ�в���
 */
package OO;

public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("��ʼ����һ��ChildClass���󡣡���");
		new ChildClass1();
	}
}
class FatherClass1{
	public FatherClass1() {
		System.out.println("����FatherClass");
	}
}
class ChildClass1 extends FatherClass1{
	public ChildClass1() {
		//super();�����Ĭ����super()�������
		System.out.println("����ChildClass");
	}
}