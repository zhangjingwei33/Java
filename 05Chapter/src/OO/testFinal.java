/**
 * 1. ���α���: �������εı������ɸı䡣һ�����˳�ֵ���Ͳ��ܱ����¸�ֵ��

final  int   MAX_SPEED = 120;
      2. ���η������÷������ɱ�������д�����ǿ��Ա�����!

final  void  study(){}
      3. ������: ���ε��಻�ܱ��̳С�
      ���磺Math��String�ȡ�

final   class  A {}
 */
package OO; 
class Animal1{
	public final void shout() {
		System.out.println("����һ����");
	}
}
class Dog extends Animal1{
	public void shout() {//������дfinal���εķ���
		System.out.println("��������");
	}
}
final class Animal2{
	
}
class Dog1 extends Animal2{���ܼ̳�final���ε���
	
}

public class testFinal {

}
