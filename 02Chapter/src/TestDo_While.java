
public class TestDo_While{
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		do{
			sum += i;//sum = sum + i
			i++;
		}while(i <= 100);//�˴���;����ʡ��
		System.out.println("Sum= " + sum);

		//whileѭ�������ж���ִ��
		int a = 0;
		while (a < 0){
			System.out.println(a);
			a++;
		}
		System.out.println("-----------------");
		//do-whileѭ������ִ�����ж�
		a = 0;
		do {
			System.out.println(a);
			a++;
		}while (a < 0);
	}
}