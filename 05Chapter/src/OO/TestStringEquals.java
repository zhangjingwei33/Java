package OO;

public class TestStringEquals {
	public static void main(String[] args) {
		String g1 = "New york";
		String g2 = "New york";
		String g3 = new String("New york");
		System.out.println(g1 == g2);//ture 指向同样的字符串常亮对象
		System.out.println(g1 == g3);//false g3是新创新的对象
		System.out.println(g1.equals(g3));//ture g1和g3里面的字符串内容是一样的
		//忽略大小写的字符串比较
		System.out.println("Hello".equalsIgnoreCase("hello"));//true
	}
}
