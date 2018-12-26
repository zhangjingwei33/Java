package com.lmzdx;
import java.util.Arrays;
public class TestArray4 {
	public static void main(String[] args) {
		Object[] a1 = {1001,"张敬畏",18,"学生","2001-5-4"};
		Object[] a2 = {1002,"秋羽",20,"工人","1998-8-28"};
		Object[] a3 = {1003,"耶稣",2018,"神","0000-0-0"};
		Object[][] emps = new Object[3][];
		emps[0] = a1;
		emps[1] = a2;
		emps[2] = a3;
		System.out.println(Arrays.toString(emps[0]));
		System.out.println(Arrays.toString(emps[1]));
		System.out.println(Arrays.toString(emps[2]));
	}
}
