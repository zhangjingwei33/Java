package OO;
/**�ⲿ��Outer*/
class Outer{
	private int age = 10;
	public void show() {
		System.out.println(age);//10
	}
	
	/*�ڲ���Inner*/
    public class Inner {
		//�ڲ����п����������ⲿ��ͬ���������뷽��
		private int age = 20;
		
		public void show() {
			int age = 30;
			System.out.println(age);//30
			System.out.println("�ڲ��෽����ľֲ�����age:"+age);//30
			System.out.println("�ڲ���ĳ�Ա����age:"+this.age);//20
			System.out.println("�ⲿ��ĳ�Ա����age"+Outer.this.age);//10
		}
	}
}

public static void TestInner() {
	public static void main(String[] args) {
		//�ȴ����ⲿ��ʵ����Ȼ��ʹ�ø��ⲿ��ʵ�������ڲ���ʵ��
		Outer outer= new Outer();
		Outer.Inner inn= outer.new Inner();
		inn.show();
		
		Outer.Inner inner= new Outer().new Inner();
		
	}
}
