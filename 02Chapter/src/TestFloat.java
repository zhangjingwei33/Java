
public class TestFloat {
	
	public static void main(String[] args) {
		double f = 314e2;//314*10^2--->31400.0
		double f2 = 314e-2;//314*10(-2)--->3.14
		System.out.println(f);
		System.out.println(f2);
		float f3 = 3.14F;
		double d1 = 3.14;
		double d2 = 3.14D;
		float f4 = 0.1f;
		double d = 1.0/10.0;
		System.out.println(f==d);//½á¹ûÎªfalse
	}
}
