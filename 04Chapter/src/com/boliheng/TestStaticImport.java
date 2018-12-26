/**
 * 测试静态导入使用
 */
package com.boliheng;
//以下两种静态导入的方式二选一即可
import static java.lang.Math.*;//导入Math类的所有静态属性
import static java.lang.Math.PI;//导入Math类的PI属性
public class TestStaticImport {
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(random());
	}
}
