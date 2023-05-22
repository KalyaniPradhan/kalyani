package com.nt.interviewPractice.recursion;

public class Rec2 {

	public static void main(String[] args) {
		int n=1;
     funBoth(n);

	}
	static void fun(int n) {
		if(n==0) {
			
			return;
		}
		System.out.println(n);
		fun(n-1);
	}
	static void revFun(int n) {
		if(n==5) {
			System.out.println(n);
			return ;
		}
		revFun(n+1);
		System.out.println(n);
	}
	static void funBoth(int n) {
		if(n==5) {
			System.out.println(n);
			return ;
		}
		System.out.println(n);
		funBoth(n+1);
		System.out.println(n);
	}

}
