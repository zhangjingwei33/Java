package OO;
import java.util.InputMismatchException;
import  java.util.Scanner;//使用Scanner获取键盘输入
public class TestHomeWork {
	/*
	public static void main(String args[]) {
        try {
            System.out.print("try");           
            return;
        } catch(Exception e){
            System.out.print("catch");
        }finally {
            System.out.print("finally");
        }
    }//结果为try finally
    */
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("请输入数字：");
	        try {
	            int num = input.nextInt();
	            if (num < 1 || num > 4) {
	                throw new Exception("必须在1-4之间！");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("InputMismatchException");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
