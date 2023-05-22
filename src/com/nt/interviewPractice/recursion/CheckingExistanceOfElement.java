package com.nt.interviewPractice.recursion;

public class CheckingExistanceOfElement {

	static boolean find(int[] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || find(arr,target,index+1);
	}
	static boolean findIndex(int[] arr,int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || findIndex(arr,target,index+1);
	}
	static int searchIndexFromLast(int[] arr,int target,int index) {
		if(index==-1) {
			return -1;
		}
		if(arr[index]==target) {
			return index ;
		}else {
			return searchIndexFromLast(arr,target,index-1);
		}
	}
	public static void main(String[] args) {
	int[] arr= {1,3,2,4,5};
	int target=5;
	System.out.println(searchIndexFromLast(arr,target,arr.length-1));

	}

}
