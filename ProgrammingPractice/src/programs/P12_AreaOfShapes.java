package programs;

import java.util.Scanner;

abstract class Shape {
	Scanner sc = new Scanner(System.in);
	double area;
	abstract void input();
	abstract void calculate();
	void display()
	{
		System.out.println(area);
	}
}

class Circle extends Shape {
	private double radius;
	@Override
	void input() {
	System.out.println("Enter the radius :");
	radius = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = 3.147 * (radius * radius);
	}	
}

class Square extends Shape {

	private double side;
	@Override
	void input() {
	System.out.println("Enter the side :");
	side = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = side * side;
	}	
}

class Rectangle extends Shape {
	private double length;
	private double width;
	@Override
	void input() {
	System.out.println("Enter the length :");
	length = sc.nextDouble();
	System.out.println("Enter the width :");
	width = sc.nextDouble();
	}
	@Override
	void calculate() {
		area = length * width;
	}	
}

class Geomerty {
	
	void allow(Shape s) {
		s.input();
		s.calculate();
		s.display();
	}
}

public class P12_AreaOfShapes {

	public static void main(String[] args) {
		Circle c = new Circle();
		Square s = new Square();
		Rectangle r = new Rectangle();
		Geomerty geo = new Geomerty();
		geo.allow(c);
		geo.allow(s);
		geo.allow(r);
	}

}
