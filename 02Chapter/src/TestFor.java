public class TestFor{
	public static void mian/*mianд���ˣ���main*/(String args[]) {
		int sum = 0;
		//1.��1-100֮����ۼӺ�
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum= " + sum);
		//2.ѭ�����9-1֮�����
		for(int i = 9; i > 0; i--) {
			System.out.print(i+",");
		}
		System.out.println();
		//3.���90-1֮���ܱ�3��������
		for(int i = 90; i > 0;i -= 3) {
			System.out.print(i + ",");
		}
		
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2){
			System.out.println("i= " + i + "j= " + j);
		}
	}
}