package com.boliheng;

public class TestHomeWork {
	 int count=9;
	    public void count1(){
	        count=10;
	        System.out.print("count1="+count);
	    }
	    public void count2(){
	        System.out.print("count2="+count);
	    }
	    public static void main(String[ ] args) {
	    	TestHomeWork t=new TestHomeWork();
	        t.count1();
	        t.count2();
	    }
	 /*int x, y;
	    TestHomeWork(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }
	    public static void main(String[] args) {
	    	TestHomeWork pt1, pt2;
	        pt1 = new TestHomeWork(3, 3);
	        pt2 = new TestHomeWork(4, 4);
	        System.out.print(pt1.x + pt2.x);
	    }//answer = 7
	    */
}
