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
	//ð��������Ż��㷨
	public static void bubbleSort(int[] vaules) {
		int temp;
		// ���ѭ����n��Ԫ��������������Ҫn-1��ѭ��
		for(int i=0;i<vaules.length;i++) {
			// ����һ���������͵ı�������������Ƿ��Ѵﵽ����״̬
			boolean flag = true;
			/*�ڲ�ѭ����ÿһ��ѭ���������е�ǰ����Ԫ�ؿ�ʼ���бȽϣ��Ƚϵ�������������*/
			for(int j=0;j< (vaules.length - i -1);j++) {
				if(vaules[j]>vaules[j+1]/*���������һ*/) {
					temp = vaules[j];
					vaules[j] = vaules[j+1];
					vaules[j+1] = temp;
					flag = false;
				}
			}
			//���ݱ������ֵ�ж������Ƿ���������������˳������������ѭ����
			if(flag) {
				break;
			}
		}
	}
}
