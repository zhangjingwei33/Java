/**
 * ���Եݹ�
 * @author dell
 *
 */
public class TestRecurrence {
	public static void main(String[] args) {
		long d1=System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ����%s%n", 10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n",d2-d1);
	}
	/** ��׳˵ķ���*/
	static long factorial(int n)
	{
		if(n==1)
		{//�ݹ�ͷ��Ҳ�����жϵ��ý���ʱ
			return 1;
		}else {//�ݹ���
			return n*factorial(n-1);
		}
	}
}
