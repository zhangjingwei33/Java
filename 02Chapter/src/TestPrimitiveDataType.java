/**
 * 测试字符类型
 * @author 张敬畏
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//char a = 'T';
		//char b = '尚';
		char c = '\u0061';
		System.out.println(c);
		
		//转义字符
		//System.out.println(""+'a'+'\n'+'b');
		//System.out.println(""+'a'+'\t'+'b');
		//System.out.println(""+'a'+'\''+'b');
		
		//String就是字符序列
		String d = "abc";
		System.out.println(d);
		//测试一元运算符++与--
		int a = 3;
		int b = a++;//执行完后，b ==3。先给b赋值，再自增。
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a;
		System.out.println("a="+a+"\nb="+b);
		
	}
}
