package javaTest_0630;

class Circle {
	double rad = 0;
	final double PI = 3.14;

	public Circle(double r) {
		setRad(r);
	}

	public double getArea() {
		return (rad * rad) * PI;
	}

	public void setRad(double r) {
		if (r > 0) {
			rad = r;
		} else if (r < 0) {
			rad = -r;
		}
	}
}

public class javaTest_0630_6 {

	public static void main(String[] args) {

		System.out.println("---------------1번 문제-----------------");
		
		Circle c = new Circle(3);
		Circle d = new Circle(-4);

		System.out.println(String.format("반지름 = %.2f, 원의 넓이 = %.2f", c.rad, c.getArea()));
		System.out.println(String.format("반지름 = %.2f, 원의 넓이 = %.2f", d.rad, d.getArea()));
	}
	
}
