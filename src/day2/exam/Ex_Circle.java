package day2.exam;

import java.util.Scanner;

public class Ex_Circle {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		String color = input.next();
		int radius = input.nextInt();

		Circle c = new Color_Circle(color, radius);

		c.show();

	}

}

//Circle클래스를 이용하여 Color_Circle클래스를 설계합니다. 
class Color_Circle extends Circle {

	String color;

	public Color_Circle() {

	}

	public Color_Circle(String color, int radius) {
		this.color = color;
		this.setRadius(radius);
	}

	public void show() {
		super.show();
		System.out.println("color = " + this.color);
	}
}

//기존에 만들어져 있는 Circle 클래스 
class Circle {
	private int radius;
	public String name;

	public Circle() {
	}

	public Circle(int r, String name) {
		this.radius = r;
		this.name = name;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}

	public void show() {
		System.out.println("radius : " + this.radius);
		System.out.println("area : " + getArea());
	}
}
