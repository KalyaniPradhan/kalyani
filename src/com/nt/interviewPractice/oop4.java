package com.nt.interviewPractice;

public class oop4 {
    static int a=10;
    static int b;
    static {
    	System.out.println("I am in static block.");
    	b=a*5;
    	System.out.println(b);
    }
	public static void main(String[] args) {
	oop4 obj1=new oop4();
	oop4.a=20;
	oop4.b=a+2;
	System.out.println("a="+a+" "+"b="+b);
		

	}
	/*
	public  static void fun() {
		//greeting();
		oop4 obj=new oop4();
		obj.greeting();
	}
	public void greeting() {
		System.out.println("from greeting.");
		//fun();
	}
	*/

}
