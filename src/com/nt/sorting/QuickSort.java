package com.nt.sorting;

import java.util.Arrays;

public class QuickSort {
static void sort(int[] nums,int low,int hi) {
	if(low>=hi) {
		return;
	}
	int s=low;
	int e=hi;
	int m=s+(e-s)/2;
	int pivot=nums[m];
	while(s<=e) {
	while(nums[s]<pivot) {
		s++;
	}
	while(nums[e]>pivot) {
		e--;
	}
	if(s<=e) {
		int temp=nums[s];
		nums[s]=nums[e];
		nums[e]=temp;
		s++;
		e--;
	}
	
	}//outer while
	//Now my pivot is at corect index.Then sort the left arr part and right arr part of the pivot.
	sort(nums,low,e);//In this step, start=low,end=end
	sort(nums,s,hi);//In this step, start=start,end=hi
	
}
	public static void main(String[] args) {
		int[] arr= {4,5,2,3,1};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
