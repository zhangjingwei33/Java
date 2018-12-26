package com.lmzdx;
import java.util.Arrays;
public class binarySearch {
	public static void main(String[] args) {
		int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
		int searchWord = 50;//Ҫ���ҵ���
		Arrays.sort(arr);//���ַ�����֮ǰ��һ��Ҫ������Ԫ������
		System.out.println(Arrays.toString(arr));
		System.out.println(searchWord+"Ԫ�ص�������"+binarySearch(arr,searchWord));
	}
	
	public static int binarySearch(int[] array,int value) {
		int low = 0;//���鿪ʼ�±�
		int high = array.length -1;//����β��
		while(low <= high) {
			int middle = (low + high)/2;
			if(value == array[middle]) {
				return middle;
			}
			if(value < array[middle]) {
				high = middle-1;
			}
			if(value > array[middle]) {
				low = middle+1;
			}
		}
		return -1;
	}
}
