package com.nt.interviewPractice.recursion;

public class Rec2_BinarySearch {

	public static void main(String[] args) {
	int[] arr= {10,20,30,40,50,60,70};
	int target=20;
	System.out.println(search(arr,target,0,arr.length));

	}
	static int search(int[] arr,int target,int start,int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(target==arr[mid]) {
			return mid;
		}else if(target<arr[mid]) {
			return search(arr,target,start,mid-1);
		}else {
			return search(arr,target,mid+1,end);
		}
		
		
		
	}

}
