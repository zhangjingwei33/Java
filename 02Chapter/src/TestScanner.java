/**
 * ���Ի�ü�������
 * @author dell
 *
 */
import java.util.Scanner;
public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������֣�");
		String name = scanner.nextLine();
		System.out.println("��������İ��ã�");
		String favor = scanner.nextLine();
		System.out.println("�������������:");
		int age = scanner.nextInt();
		
		System.out.println("################");
		System.out.println(name);
		System.out.println(favor);
		System.out.println("���������������" +age*365);
		System.out.println("�뿪�����������" +(72-age)*365);
	}

}
