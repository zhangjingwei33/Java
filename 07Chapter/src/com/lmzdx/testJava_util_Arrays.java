package com.lmzdx;
import java.util.Arrays;
/*
 * JDK�ṩ��java.util.Arrays�࣬�����˳��õ����������
 * ���������ճ�������Arrays������ˣ�
 * ���򡢲��ҡ���䡢��ӡ���ݵȳ����Ĳ�����
 */
public class testJava_util_Arrays {
	public static void main(String args[]) {
		
		//��ӡ����
		int[] a = {1,2};
		System.out.println(a);//��ӡ�������õ�ֵ��
		System.out.println(Arrays.toString(a));//��ӡ����Ԫ�ص�ֵ
		//����Ԫ�ص�����
		int[] s = {1,3,53,4,56,89,10};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		//���ַ�����
		int b[]= {54,34,45,3,8,10,21,67,88};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);//ʹ�ö��ַ����ң������ȶ������������
		System.out.println(Arrays.toString(b));
		//����������µ�����λ�ã���δ�ҵ����ظ�����
		System.out.println("��Ԫ�ص�������"+Arrays.binarySearch(b, 54));
		//�������
		int tian[]= {1,2,34,5,33,66,78,99};
		System.out.println(Arrays.toString(tian));
		Arrays.fill(tian, 2,5,100);//��[2,5)������Ԫ���滻Ϊ100��
		System.out.println(Arrays.toString(tian));
	}
}
