/**
 * static��ʼ��
 * @author dell
 *1.���ݵ�Object�࣬��ִ��Object�ľ�̬��ʼ���飬
 *������ִ������ľ�̬��ʼ���飬ֱ�����ǵ���ľ�̬��ʼ����Ϊֹ��

����2. ���췽��ִ��˳�������˳��һ��!!
 */
public class User3 {
	int id;
	String name;//�˻���
	String pwd;//����
	static String company;//��˾����
	static {
		System.out.println("ִ����ĳ�ʼ������");
		company = "Boliheng";
		printCompany();
	}
	public static void printCompany() {
		System.out.println(company);
	}
	public static void main(String[] args) {
		User3 u3 = new User3();
	}
}
