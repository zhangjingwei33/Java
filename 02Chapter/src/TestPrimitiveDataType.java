/**
 * �����ַ�����
 * @author �ž�η
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//char a = 'T';
		//char b = '��';
		char c = '\u0061';
		System.out.println(c);
		
		//ת���ַ�
		//System.out.println(""+'a'+'\n'+'b');
		//System.out.println(""+'a'+'\t'+'b');
		//System.out.println(""+'a'+'\''+'b');
		
		//String�����ַ�����
		String d = "abc";
		System.out.println(d);
		//����һԪ�����++��--
		int a = 3;
		int b = a++;//ִ�����b ==3���ȸ�b��ֵ����������
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;
		System.out.println("a="+a+"\nb="+b);
		
	}
}
