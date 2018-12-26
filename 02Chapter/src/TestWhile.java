
public class TestWhile{
	public static void main(String[] argx){
		int i = 0;
		int sum = 0;
		//1+2+3+4+...+100=?
		while(i <=100)
		{
			sum += i;
			i++;
		}
		System.out.println("Sum= "+ sum);
	}
}