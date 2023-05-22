package com.nt.interviewPractice;
class Shape{
void area() {
	System.out.println("I am in Shape.");
}
static void m1() {
	System.out.println("from shape of m1.");
}
}
class Circle extends Shape{
void area() {
	System.out.println("Area of circle is: pi*r*r");
}

static void m1() {
	System.out.println("from circle of m1");
}
	
}
class Tringle extends Shape{
	void area() {
		System.out.println("Area of tringle=0.5*h*b");
	}
	
}
class Square extends Shape{
	void area() {
		System.out.println("Area is squre of the side.");
	}
	void segment() {
		System.out.println("from segment of square.");
	}
	
}
public class ShapesTest {

	public static void main(String[] args) {
	//Shape shape=new Shape();
	//Circle c=new Circle();
	//Square sq=new Square();
	Shape shape=new Shape();
	shape.m1();
	Circle c=new Circle();
	c.m1();
	
	
	

	}

}
