package com.lmzdx;

//������������һά����
class Man{
	private int age;
	private int id;
	
	public Man(int age, int id) {
		super();
		this.age = age;
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
public class TestArray2 {
	public static void main(String args[]) {
		/*
		Man[] mans = new Man[3];
		mans[0] = new Man(15,1);
		mans[1] = new Man(20,2);
		mans[2] = new Man(25,3);
		
		for(int i = 0; i < mans.length; i++) {
			System.out.println(mans[i].getAge());
		}
		*/
	//}
	//��̬��ʼ������
	
	int[] a = {1, 2, 3};//��̬��ʼ�������������飻
	Man[] mans = {new Man(1, 1),new Man(2, 2)};//��̬��ʼ�������������飻
	
	/*
	//��̬��ʼ������
	int[] a1 = new int[2];//��̬��ʼ�����飬�ȷ���ռ䣻
	a1[0] = 1;//������Ԫ�ظ�ֵ��
	a1[1] = 0;
	//�����Ĭ�ϳ�ʼ��
	int a2[] = new int[2];//Ĭ��ֵ��0,0
	boolean[] b = new boolean[2];//Ĭ��ֵ��false,false
	String[] s = new String[2];//Ĭ��ֵ��null,null
	
	//��ǿforѭ����for-eash��
	String[] ss = {"a","b","c","d"};
	for(String temp: ss) {
		System.out.println(temp);
	}
	*/
	//���鿽��
	 /*System����Ҳ������һ��
	  * static void arraycopy(object src��int srcpos��object dest�� int destpos��int length)������
	  * �÷������Խ�src�������Ԫ��ֵ����dest�����Ԫ�أ�����srcposָ����src����ĵڼ���Ԫ�ؿ�ʼ��ֵ��
	  * length����ָ����src����Ķ��ٸ�Ԫ�ظ���dest�����Ԫ�ء�
	  */
	String[] src= {"ALi","SXT","JD","SH","WY"};
	String[] dest=new String[6];
	System.arraycopy(src,0,dest,0,src.length);
	for(int i = 0;i<dest.length;i++) {
		System.out.print(dest[i]+"\t");
	}
	
	}
}