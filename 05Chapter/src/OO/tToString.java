package OO;
class Man{
	String name;
	int age;
	@Override
	public String toString() {
		return name+",ƒÍ¡‰:"+age;
	}
}
public class tToString {
	public static void main(String[] args) {
		 Man p = new Man();
		 p.age=21;
		 p.name="’≈æ¥Œ∑";
		 System.out.println("info:"+p);
		 
		 tToString t = new tToString();
		 System.out.println(t);
	}
	
}
