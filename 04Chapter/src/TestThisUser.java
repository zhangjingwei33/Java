//this������ǰ����ʾ��
public class TestThisUser {
	int id; //id
	String name;//�˻���
	String pwd;//����
	
	public TestThisUser() {
		
	}
	public TestThisUser(int id,String name) {
		System.out.println("���ڳ�ʼ���Ѿ������õĶ���"+this);
		this.id = id;//��дthis,�޷����־ֲ�����id�ͳ�Ա����id
		this.name = name;
	}
	public void login() {
		System.out.println(this.name+",Ҫ��¼");//��дthisЧ��һ��,
		//��Ϊ�Ѿ��������
	}
	public static void main(String[] args) {
		TestThisUser u3 = new TestThisUser(1,"�ž�η");
		TestThisUser u54 = new TestThisUser(1,"������");
		System.out.println("��ӡ�ž�η����"+ u3);
		u54.login();
	}
}
