
public class TestDataOverflow {
	public static void main(String[] args){
		int money = 1000000000;//10��
		int years = 20;
		//���ص�total�Ǹ�����������int�ķ�Χ
		int total = money*years;
		System.out.println("total="+total);
		/*���ص�total��Ȼ�Ǹ�������˽����ת��intֵ����ת��long
		���Ѿ����������ݶ�ʧ*/
		long total1 = money*years;
		System.out.println("total="+total1);
		//���ص�total2��ȷ���Ƚ�һ�����ӱ��long,�������ʽ����������
		//ȫ����long������
		long total2 = money*((long)years);
		System.out.println("total2="+total2);
	}
}
