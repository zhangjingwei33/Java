package com.lmzdx;
import java.util.Arrays;
//������������һά����
public class TestArray {
	public static void main(String args[]) {
		int[] s = null;//�������飻
		s = new int[10];//���������ռ䣻
		for(int i = 0;i < 10;i++) {
			s[i] = i;//������Ԫ�ظ�ֵ��
			System.out.println(s[i]);
		}
		/*//��ȷ
		int c[];
		c = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(c));
		*/
		/*
		int c[4] = {1,2,3,5};//��ģ����벻��
		System.out.println(Arrays.toString(c));
		*/
		int c[]={1,2,3,4};
		System.out.println(Arrays.toString(c));
	}
}
