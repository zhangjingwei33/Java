package OO;

public class TestInterface {
	public static void main(String[] args) {
		Volant volant = new Angel();
		volant.fly();
		System.out.println(Volant.FLY_HIGHT);
	}
}
/**���нӿ�*/
interface Volant{
	int FLY_HIGHT = 100;//���ǣ�public static final ���͵ģ�ʡ��Ҳ��һ����
	void fly();//���ǣ�public abstract void fly();
}
/**�����ӿ�*/
interface Honest{
	void helpOther();
}
/**Angle��ʵ�ַ��нӿں������ӿ�*/
class Angel implements Volant,Honest{
	public void fly() {
		System.out.println("������ʹ���������ˣ�");
	}
	public void helpOther() {
		System.out.println("�������̹���·��");
	}
}
class GoodMan implements Honest{
	public void helpOther() {
		System.out.println("�������̹���·��");
	}
}
class BirdMan implements Volant{
	public void fly() {
		System.out.println("�������ˣ����ڷɣ�");
	}
}
