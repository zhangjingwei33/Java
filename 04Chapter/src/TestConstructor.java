/*1. ����һ�����㡱(Point)��������ʾ��ά�ռ��еĵ�(����������)��Ҫ�����£�

����(1) �������ɾ����ض�����ĵ����

����(2) �ṩ������������ķ�����

����(3)�ṩ���Լ���á��㡱������һ�����ķ�����
*/
class Point{
	double x,y;
	public Point(double _x,double _y)
	{
		x = _x;
		y = _y;
	}
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}

public class TestConstructor {
	public static void main(String[] args)
	{
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		System.out.println(p.getDistance(origin));
	}
}
