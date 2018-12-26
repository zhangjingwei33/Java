package com.lmzdx;
import java.util.Arrays;
/*
 * JDK提供的java.util.Arrays类，包含了常用的数组操作，
 * 方便我们日常开发。Arrays类包含了：
 * 排序、查找、填充、打印内容等常见的操作。
 */
public class testJava_util_Arrays {
	public static void main(String args[]) {
		
		//打印数组
		int[] a = {1,2};
		System.out.println(a);//打印数组引用的值；
		System.out.println(Arrays.toString(a));//打印数组元素的值
		//数组元素的排序
		int[] s = {1,3,53,4,56,89,10};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		//二分法查找
		int b[]= {54,34,45,3,8,10,21,67,88};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);//使用二分法查找，必须先对数组进行排序
		System.out.println(Arrays.toString(b));
		//返回排序后新的索引位置，若未找到返回负数。
		System.out.println("该元素的索引："+Arrays.binarySearch(b, 54));
		//数组填充
		int tian[]= {1,2,34,5,33,66,78,99};
		System.out.println(Arrays.toString(tian));
		Arrays.fill(tian, 2,5,100);//将[2,5)索引的元素替换为100；
		System.out.println(Arrays.toString(tian));
	}
}
