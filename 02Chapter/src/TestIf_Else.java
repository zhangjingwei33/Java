/**
 * ����If-else
 * @author �ž�η
 *
 */
public class TestIf_Else {
	public static void main(String[] args) {
		//�������һ��[0.0,4.0)����İ뾶�������ݰ뾶��Բ��������ܳ�
		double r = 4*Math.random();
		//Math.pow(r,2)��뾶r��ƽ��
		double area = Math.PI * Math.pow(r, 2);
		double circle = 2*Math.PI*r;
		System.out.println("�뾶Ϊ��"+r);
		System.out.println("���Ϊ��"+area);
		System.out.println("�ܳ�Ϊ��"+circle);
		//������>=�ܳ����������������ڵ����ܳ�������������ܳ��������
		if(area >= circle) {
			System.out.println("������ڵ����ܳ�");
		}else {
			System.out.println("�ܳ��������");
		}
	}
}
