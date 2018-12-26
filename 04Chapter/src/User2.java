/**
 * 测试static关键字的用法
 * @author 张敬畏
 *
 */
public class User2 {
	int id;
	String name;//账户名
	String pwd;//密码
	
	static String company = "Bilibili";//公司名称

	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany();
		System.out.println(company);
		System.out.println("登录:"+ name);
	}
	
	public static void printCompany() {
		//login();//调用非静态成员，编译就会报错
		System.out.println(company);
	}
	public static void main(String[] args) {
		User2 u = new User2(101,"zhang");
		u.printCompany();
		u.company = "Boliheng";
		u.printCompany();
	}
}
