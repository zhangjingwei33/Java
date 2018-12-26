package com.boliheng;
import java.sql.Date;
import java.util.*;

public class TestPack {
	public static void main(String[] args) {
		//这里指的是java.sql.Date
		Date now;
		//java.util.Date因为和java.sql.Date类同名，需要完整路径
		java.util.Date now2 = new java.util.Date();
		System.out.println(now2);
		//java.util包的非同名类不需要完整路径
		Scanner input = new Scanner(System.in);
	}
}
