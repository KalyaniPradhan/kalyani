package com.nt.msc;

public class ArmStrongNum {

	public static void main(String[] args) {
		int n=153;
		boolean ans= isArmStrong(n);
		System.out.println(ans);

	}
	public static boolean  isArmStrong(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		return original==sum;
	}

}
