package OO;
import java.util.InputMismatchException;
import  java.util.Scanner;//ʹ��Scanner��ȡ��������
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
    }//���Ϊtry finally
    */
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("���������֣�");
	        try {
	            int num = input.nextInt();
	            if (num < 1 || num > 4) {
	                throw new Exception("������1-4֮�䣡");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("InputMismatchException");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
