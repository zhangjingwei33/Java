//this()�������ع��췽��
public class TestThis {
	int a,b,c;
	
	TestThis(){
		System.out.println("��Ҫ��ʼ��һ��Hello����");
	}
	TestThis(int a, int b){
		//TestThis();//�������޷����ù��췽���ģ�
		this();//�����޲����Ĺ��췽�������ұ���λ�ڵ�һ�У�
		a = a;//���ﶼ��ָ�ľֲ�����������this�ĳ�Ա������
		System.out.println(a);
		System.out.println(this.a);
		//�����������˳�Ա�����;ֲ��������������ռ��thisʹ����������
		this.a = a;
		this.b = b;
	}
	TestThis(int a,int b,int c)
	{
		this(a,b);//���ô��εĹ��췽�������ұ���λ�ڵ�һ�У�
		this.c = c;
	}
	void sing() {
		System.out.println("����sing");
	}
	void eat() {
		this.sing();//���ñ����е�sing();
		System.out.println("�����躰��ؼҳԷ���");
	}
	public static void main(String[] args) {
		TestThis hi = new TestThis(2,3);
		hi.eat();
	}
	
}
