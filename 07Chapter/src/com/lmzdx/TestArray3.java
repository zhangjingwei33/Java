package com.lmzdx;
import java.util.Arrays;
public class TestArray3 {
	public static void main(String[] args) {
		/*
		//二维数组的声明
		//Java中多维数组的声明和初始化应按低维到高维的顺序进行
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		//int a1[][] = new int[][4];//非法
		*/
		/*
		//二维数组的静态初始化
		int[][] a = {{1,2,3},{3,4},{3,4,5,6,7}};
		System.out.println(a[2][2]);
		*/
		//二维数组的动态初始化
		int[][] a = new int[3][];
		//a[0] = {1,2,4};//错误，没有声明类型就初始化
		a[0] = new int[] {1,2};
		a[1] = new int[] {1,2,3};
		a[2] = new int[] {1,2,3,4};
		System.out.println(a[2][2]);
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println(Arrays.toString(a[2]));
		//获取的二维数组第一维数组的长度。
		System.out.println(a.length);//3
		//获取第二维第一个数组长度。
		System.out.println(a[0].length);
	}

}
