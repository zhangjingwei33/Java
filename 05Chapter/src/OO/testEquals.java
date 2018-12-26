package OO;

public class testEquals {
	public static void main(String[] args) {
		Person1 p1 = new Person1(123,"高淇");
		Person1 p2 = new Person1(123,"高小七");
		System.out.println(p1==p2);//false,不是同一个对象
		System.out.println(p1.equals(p2));//ture,两个字符串内容相同
	}
	
}
class Person1{
	int id;
	String name;
	public Person1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		else {
			if(obj instanceof Person1) {
				Person1 c = (Person1)obj;
				if(c.id==this.id) {
					return true;
				}
			}
		}
		return false;
	}
}
