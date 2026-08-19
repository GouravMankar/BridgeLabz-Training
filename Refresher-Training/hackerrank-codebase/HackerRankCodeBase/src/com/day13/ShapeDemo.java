package com.day13;

class Shape{
	public double area() {
		return 0;
	}
}
class Circle extends Shape{
	double redius;
	
	
	public Circle(double redius) {
		super();
		this.redius = redius;
	}


	public double area() {
		
		return 2*Math.PI*Math.pow(redius, 2);
	}
}
class Rectangle extends Shape{
	double length,width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
	
	
}
class Triangle extends Shape{
	double base,height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double area() {
		return 0.5*base*height;
	}
}
public class ShapeDemo {

	public static void main(String[] args) {
		Shape[] shapes=new Shape[3];
		shapes[0]=new Circle(5);
		shapes[1]=new Rectangle(5, 7);
		shapes[2]=new Triangle(4, 8);
		for(Shape sp:shapes) {
			System.out.println(sp.area());
		}

	}

}
