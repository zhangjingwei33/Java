/**
 * static初始化
 * @author dell
 *1.上溯到Object类，先执行Object的静态初始化块，
 *再向下执行子类的静态初始化块，直到我们的类的静态初始化块为止。

　　2. 构造方法执行顺序和上面顺序一样!!
 */
public class User3 {
	int id;
	String name;//账户名
	String pwd;//密码
	static String company;//公司名称
	static {
		System.out.println("执行类的初始化工作");
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
