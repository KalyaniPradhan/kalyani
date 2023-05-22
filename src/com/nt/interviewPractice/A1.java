package com.nt.interviewPractice;

public class A1 {
	int a=100;

	public static void main(String[] args) {
		//System.out.println(a);
	int a;
	//System.out.println(a);
	int b=20;
	//swap(a,b);
	//System.out.println("From main():"+a+" "+b);
	String name="kunal";
	changeName(name);
	System.out.println("From main()-changeName():"+name);

	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("From swap()"+a+" "+b);
	}
	static void changeName(String name) {
		name="jagannath";
		System.out.println("From changeName()"+name);
	}


}
