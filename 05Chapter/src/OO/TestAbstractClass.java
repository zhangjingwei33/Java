/**
 * �����󷽷�

      ʹ��abstract���εķ�����û�з����壬ֻ���������������һ�֡��淶�������Ǹ����������Ҫ�����󷽷��ṩ�����ʵ�֡�

��������

      �������󷽷�������ǳ����ࡣͨ��abstract��������淶��Ȼ��Ҫ��������붨�����ʵ�֡�ͨ�������࣬���ǾͿ��������ϸ������������ƣ�ʹ����֮�����ͨ�á�
 */
package OO;
//������
abstract class Animal2{
	abstract public void shout();//���󷽷�
}
class Dog2 extends Animal2{
	//�������ʵ�ָ���ĳ��󷽷�������������
	public void shout() {
		System.out.println("��������");
	}
}
//���Գ�����
public class TestAbstractClass {
	public static void main(String[] args) {
		new Animal2();//�����಻��ʵ��������������new��ʵ���������ࡣ
		Dog2 a=new Dog2();
		a.shout();
	}
}
