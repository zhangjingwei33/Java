public class TestFor1{
	public static void main(String args[]) {
		int sum = 0;
		//1.求1-100之间的累加和
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum= " + sum);
		//2.循环输出9-1之间的数
		for(int i = 9; i > 0; i--) {
			System.out.print(i+",");
		}
		System.out.println();
		//3.输出90-1之间能被3整除的数
		for(int i = 90; i > 0;i -= 3) {
			System.out.print(i + ",");
		}
		
		for(int i = 1, j = i + 10; i < 5; i++, j = i * 2){
			System.out.println("i= " + i + "j= " + j);
		}
		long zhang = 0;
		for( ; ; ){//无限循环：相当于while(ture)
			zhang++;
			System.out.println(zhang+"上帝喜悦张敬畏");
		}
	}
}