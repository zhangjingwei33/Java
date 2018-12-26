/**
 * 测试if
 * @author 张敬畏
 *
 */
public class TestIf {
	public static void main(String[] args) {
		//通过掷三个骰子看看今天手气如何？
		int i = (int)(6*Math.random())+1;
		//通过Math.random()产生[0,1)随机数
		//System.out.println(i);//测试下
		int j = (int)(6*Math.random())+1;
		int k = (int)(6*Math.random())+1;
		int count = i+j+k;
		//如果三个骰子之和大于15，则手气不错
		if(count > 15) {
			System.out.println("今天手气不错");
		}
		//如果三个骰子之和在10到15之间，则手气一般
		if(count >= 10 && count <= 15) {
			System.out.println("今天手气很一般");
		}
		//如果三个骰子之和小于10，则手气不怎么样
		if(count < 10) {
			System.out.println("今天手气不怎么样");
		}
		System.out.println("得了"+count+"分");
			
			
	}
}
