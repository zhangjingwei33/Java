//this代表“当前对象”示例
public class TestThisUser {
	int id; //id
	String name;//账户名
	String pwd;//密码
	
	public TestThisUser() {
		
	}
	public TestThisUser(int id,String name) {
		System.out.println("正在初始化已经创建好的对象："+this);
		this.id = id;//不写this,无法区分局部变量id和成员变量id
		this.name = name;
	}
	public void login() {
		System.out.println(this.name+",要登录");//不写this效果一样,
		//因为已经构造好了
	}
	public static void main(String[] args) {
		TestThisUser u3 = new TestThisUser(1,"张敬畏");
		TestThisUser u54 = new TestThisUser(1,"王晋阳");
		System.out.println("打印张敬畏对象："+ u3);
		u54.login();
	}
}
