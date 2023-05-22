package com.nt.interviewPractice.recursion;

public class PallindromeNumByRec {
	static int rev(int n) {
		
		int digits=(int)(Math.log10(n))+1;
		return helper(n,digits);
	
	}
	static int helper(int n,int digits) {
		if(n%10==n) {
			return n;
		}
		int rem=n%10;
return (int) (rem*(Math.pow(10, digits-1))+helper(n/10,digits-1));
	}

	public static void main(String[] args) {
		int n=122;
		System.out.println(isPalli(n));

	}
	static boolean isPalli(int n) {
		if(n==rev(n)) {
			return true;
		}
		return false;
	}

}
