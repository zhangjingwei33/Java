package com.lmzdx;

//创建引用类型一维数组
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
	//静态初始化数组
	
	int[] a = {1, 2, 3};//静态初始化基本类型数组；
	Man[] mans = {new Man(1, 1),new Man(2, 2)};//静态初始化引用类型数组；
	
	/*
	//动态初始化数组
	int[] a1 = new int[2];//动态初始化数组，先分配空间；
	a1[0] = 1;//给数组元素赋值；
	a1[1] = 0;
	//数组的默认初始化
	int a2[] = new int[2];//默认值：0,0
	boolean[] b = new boolean[2];//默认值：false,false
	String[] s = new String[2];//默认值：null,null
	
	//增强for循环（for-eash）
	String[] ss = {"a","b","c","d"};
	for(String temp: ss) {
		System.out.println(temp);
	}
	*/
	//数组拷贝
	 /*System类里也包含了一个
	  * static void arraycopy(object src，int srcpos，object dest， int destpos，int length)方法，
	  * 该方法可以将src数组里的元素值赋给dest数组的元素，其中srcpos指定从src数组的第几个元素开始赋值，
	  * length参数指定将src数组的多少个元素赋给dest数组的元素。
	  */
	String[] src= {"ALi","SXT","JD","SH","WY"};
	String[] dest=new String[6];
	System.arraycopy(src,0,dest,0,src.length);
	for(int i = 0;i<dest.length;i++) {
		System.out.print(dest[i]+"\t");
	}
	
	}
}