package com.nt.interviewPractice.recursion;

public class RecProduct {

	public static void main(String[] args) {
		int n=1234;
		int ans=prod(n);
		System.out.println(ans);

	}
	static int prod(int n) {
		if(n%10==n) {
			return n;
		}
		return n%10*prod(n/10);
	}

}
