/**
 * ����static�ؼ��ֵ��÷�
 * @author �ž�η
 *
 */
public class User2 {
	int id;
	String name;//�˻���
	String pwd;//����
	
	static String company = "Bilibili";//��˾����

	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("��¼:"+ name);
	}
	
	public static void printCompany() {
		//login();//���÷Ǿ�̬��Ա������ͻᱨ��
		System.out.println(company);
	}
	public static void main(String[] args) {
		User2 u = new User2(101,"zhang");
		u.printCompany();
		u.company = "Boliheng";
		u.printCompany();
	}
}
