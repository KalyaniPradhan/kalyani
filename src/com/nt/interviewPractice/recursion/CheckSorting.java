package com.nt.interviewPractice.recursion;

public class CheckSorting {

	static boolean sorted(int[] arr,int index) {
		if(arr[index]==arr.length-1) {
			return true;
		}
	
			return arr[index]<arr[index+1] && sorted(arr,index+1);
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,7,5};
		System.out.println(sorted(arr,0));
		

	}

}
