package com.lmzdx;
import java.util.Arrays;
public class bubble {
	public static void main(String[] args) {
		int[] values = {3,1,6,2,9,0,7,4,5,8};
		bubbleSort(values);
		System.out.println(Arrays.toString(values));
	}
	/*
	public static void bubbleSort(int[] values) {
		int temp;
		for(int i = 0;i<values.length;i++) {
			for(int j=0;j<values.length-1-i;j++) {
				if(values[j]>values[j+1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
	}
	*/
	//冒泡排序的优化算法
	public static void bubbleSort(int[] vaules) {
		int temp;
		// 外层循环：n个元素排序，则至多需要n-1趟循环
		for(int i=0;i<vaules.length;i++) {
			// 定义一个布尔类型的变量，标记数组是否已达到有序状态
			boolean flag = true;
			/*内层循环：每一趟循环都从数列的前两个元素开始进行比较，比较到无序数组的最后*/
			for(int j=0;j< (vaules.length - i -1);j++) {
				if(vaules[j]>vaules[j+1]/*所以上面减一*/) {
					temp = vaules[j];
					vaules[j] = vaules[j+1];
					vaules[j+1] = temp;
					flag = false;
				}
			}
			//根据标记量的值判断数组是否有序，如果有序，则退出；无序，则继续循环。
			if(flag) {
				break;
			}
		}
	}
}
