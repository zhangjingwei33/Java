package com.lmzdx;
import java.util.Arrays;
public class TestArray3 {
	public static void main(String[] args) {
		/*
		//��ά���������
		//Java�ж�ά����������ͳ�ʼ��Ӧ����ά����ά��˳�����
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		//int a1[][] = new int[][4];//�Ƿ�
		*/
		/*
		//��ά����ľ�̬��ʼ��
		int[][] a = {{1,2,3},{3,4},{3,4,5,6,7}};
		System.out.println(a[2][2]);
		*/
		//��ά����Ķ�̬��ʼ��
		int[][] a = new int[3][];
		//a[0] = {1,2,4};//����û���������;ͳ�ʼ��
		a[0] = new int[] {1,2};
		a[1] = new int[] {1,2,3};
		a[2] = new int[] {1,2,3,4};
		System.out.println(a[2][2]);
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
		//��ȡ�Ķ�ά�����һά����ĳ��ȡ�
		System.out.println(a.length);//3
		//��ȡ�ڶ�ά��һ�����鳤�ȡ�
		System.out.println(a[0].length);
	}

}
