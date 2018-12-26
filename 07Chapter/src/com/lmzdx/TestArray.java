package com.lmzdx;
import java.util.Arrays;
//创建基本类型一维数组
public class TestArray {
	public static void main(String args[]) {
		int[] s = null;//声明数组；
		s = new int[10];//给数组分配空间；
		for(int i = 0;i < 10;i++) {
			s[i] = i;//给数组元素赋值；
			System.out.println(s[i]);
		}
		/*//正确
		int c[];
		c = new int[] {1,2,3,4};
		System.out.println(Arrays.toString(c));
		*/
		/*
		int c[4] = {1,2,3,5};//错的，编译不过
		System.out.println(Arrays.toString(c));
		*/
		int c[]={1,2,3,4};
		System.out.println(Arrays.toString(c));
	}
}
