package com.nt.interviewPractice;
class Box{
private 	double l;
	double b;
	double h;
	
	public Box() {
	this.l=-1;
	this.b=-1;
	this.h=-1;
	}
	public Box(double side) {
		this.l=side;
		this.b=side;
		this.h=side;
	}
	public Box(double b,double h) {
		this.b=b;
		this.h=h;
	}
	public Box(double l,double b,double h) {
		this.l=l;
		this.b=b;
		this.h=h;
		}
	public Box(Box old) {
		this.l=old.l;
		this.b=old.b;
		this.h=old.h;
	}
	public void info() {
		System.out.println("From Box class method.");
	}
}

class BoxWeight extends Box{
	double weight;
	public BoxWeight() {
		this.weight=-1;
		
		
	}
	public BoxWeight(double l,double b,double h,double weight) {
		super(l,b,h);
		this.weight=weight;
		
	}
	public BoxWeight(double b,double h,double weight) {
		super(b,h);
		this.weight=weight;
	}
	public BoxWeight(BoxWeight bw) {
		super(bw);
		weight=bw.weight;
	}
	public BoxWeight(double side,double weight) {
		super(side);
		this.weight=weight;
	}

	
}


class BoxPrice extends BoxWeight{
	double cost;
	public BoxPrice() {
		super();
		this.cost=-1;
	}
	public BoxPrice(BoxPrice other) {
		super(other);
	}
	public BoxPrice(BoxWeight bw) {
		super(bw);
	
	}
	public BoxPrice(double l, double b, double h, double weight,double cost) {
		super(l, b, h, weight);
		this.cost=cost;
		
	}
	
	public BoxPrice(double side,double weight,double cost) {
		super(side,weight);
		this.cost=cost;
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		/*
		Box b=new Box();
		System.out.println(b.l+" "+b.b+" "+b.h);
		Box c=new Box(3);
		System.out.println(c.l+" "+c.b+" "+c.h);
		Box d=new Box(2,3,4);
		System.out.println(d.l+" "+d.b+" "+d.h);
		Box e=new Box(c);
		System.out.println(e.l+" "+e.b+" "+e.h);
		e.info();
		
		BoxWeight bw=new BoxWeight();
		System.out.println(bw.weight+" "+bw.h);
		BoxWeight bw1=new BoxWeight(2,3,4,5);
		*/
		Box b=new BoxWeight(3,5,9);
		BoxWeight bw=new BoxWeight();
		

	}

}
