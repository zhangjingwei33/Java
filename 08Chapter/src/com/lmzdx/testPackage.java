package com.lmzdx;
/**
 * ��װ���ʹ��
 * @author dell
 *
 */
public class testPackage {
	/**����Integer���÷���������װ����Integer����*/
	void testInteger() {
		//��������ת����Integer����
		Integer int1 = new Integer(10);
		Integer int2 = Integer.valueOf(20);//�ٷ��Ƽ�����д��
		//Integer����ת����int
		int a = int1.intValue();
		//�ַ���ת����Integer����
		Integer int3 = Integer.parseInt("334");
		Integer int4 = new Integer("999");
		//Integer����ת�����ַ���
		String str1 = int3.toString();
		//һЩ����int������صĳ���
		System.out.println("int�ܱ�ʾ�����������"+Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		testPackage test = new testPackage();
		test.testInteger();
		//��װ��Ļ�������
		Integer in1 = -128;
		Integer in2 = -128;
		System.out.println(in1 == in2);//true ��Ϊ123�ڻ��淶Χ��
		System.out.println(in1.equals(in2));//true
		Integer in3 = 1234;
		Integer in4 = 1234;
		System.out.println(in3 == in4);//false ��Ϊ1234���ڻ��淶Χ��
		System.out.println(in3.equals(in4));
	}
}
