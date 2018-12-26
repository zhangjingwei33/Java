/**
 * 测试递归
 * @author dell
 *
 */
public class TestRecurrence {
	public static void main(String[] args) {
		long d1=System.currentTimeMillis();
		System.out.printf("%d阶乘的结果：%s%n", 10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时：%s%n",d2-d1);
	}
	/** 求阶乘的方法*/
	static long factorial(int n)
	{
		if(n==1)
		{//递归头，也就是判断调用结束时
			return 1;
		}else {//递归体
			return n*factorial(n-1);
		}
	}
}
