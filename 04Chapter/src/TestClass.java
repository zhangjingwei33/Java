/**
 * 2018.11.1
 * @author dell
 *
 */
//ÿһ��Դ�ļ���������ֻ��һ��public class
//�����������ļ�������һ��
class Seat{
		int number;
	}
public class TestClass {
	//���Ը�����
	//���ԣ���Ա������
	static String brand;
	int vaule;
	String country;
	static Seat seats;
	void introduce() {
		System.out.println("����"+TestClass.brand+"����"+
	seats.number+"��");
	}
	class Tyre{//һ��java�ļ�����ͬʱ������class
		
	}
	class Engine{
		//����
		void form() {
			System.out.println("�������Ե¹��ķ�����");
		}
	}
	
	//���췽��
	TestClass(){
		
	}
	public static void main(String[] args) {
		TestClass car1 = new TestClass();
		car1.brand = "����";
		
		Seat seat1 = new Seat();//�������TestClass()������
		seat1.number = 7;
		TestClass.seats = seat1;
		car1.introduce();
	}
}
