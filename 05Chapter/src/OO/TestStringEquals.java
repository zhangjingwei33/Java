package OO;

public class TestStringEquals {
	public static void main(String[] args) {
		String g1 = "New york";
		String g2 = "New york";
		String g3 = new String("New york");
		System.out.println(g1 == g2);//ture ָ��ͬ�����ַ�����������
		System.out.println(g1 == g3);//false g3���´��µĶ���
		System.out.println(g1.equals(g3));//ture g1��g3������ַ���������һ����
		//���Դ�Сд���ַ����Ƚ�
		System.out.println("Hello".equalsIgnoreCase("hello"));//true
	}
}
