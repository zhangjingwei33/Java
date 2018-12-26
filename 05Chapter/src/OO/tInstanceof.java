/**
 *  instanceof是二元运算符，左边是对象，右边是类；
 *  当对象是右面类或子类所创建对象时，返回true；
 *  否则，返回false
 */
package OO;

public class tInstanceof {
	public static void main(String[] args) {
		Student s = new Student("zjw",173,"java");
		System.out.println(s instanceof Person);
		
	
	}
}
