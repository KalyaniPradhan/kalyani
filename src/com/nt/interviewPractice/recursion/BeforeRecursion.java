package com.nt.interviewPractice.recursion;

public class BeforeRecursion {

	public static void main(String[] args) {
		message();

	}
	static void message() {
		System.out.println("Hello world1");
		message1();
	}
	static void message1() {
		System.out.println("Hello World2");
		message2();
	}
	static void message2() {
		System.out.println("Hello world3");
		message3();
	}
	static void message3() {
		System.out.println("Hello world4");
		message4();
	}
	static void message4() {
		System.out.println("Hello world completed.");
	}

}
