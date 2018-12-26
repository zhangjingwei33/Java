package com.lmzdx;
/**
 * 包装类的使用
 * @author dell
 *
 */
public class testPackage {
	/**测试Integer的用法，其他包装类与Integer类似*/
	void testInteger() {
		//基本类型转换成Integer对象
		Integer int1 = new Integer(10);
		Integer int2 = Integer.valueOf(20);//官方推荐这种写法
		//Integer对象转化成int
		int a = int1.intValue();
		//字符串转化成Integer对象
		Integer int3 = Integer.parseInt("334");
		Integer int4 = new Integer("999");
		//Integer对象转化成字符串
		String str1 = int3.toString();
		//一些常见int类型相关的常量
		System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		testPackage test = new testPackage();
		test.testInteger();
		//包装类的缓存问题
		Integer in1 = -128;
		Integer in2 = -128;
		System.out.println(in1 == in2);//true 因为123在缓存范围内
		System.out.println(in1.equals(in2));//true
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.println(in3 == in4);//false 因为1234不在缓存范围内
		System.out.println(in3.equals(in4));
	}
}
