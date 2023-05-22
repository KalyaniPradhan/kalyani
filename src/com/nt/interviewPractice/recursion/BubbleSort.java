package com.nt.interviewPractice.recursion;

import java.util.Arrays;

public class BubbleSort {
static void bubble(int[] arr,int r,int c) {
	if(r==0) {
		return;
	}
	if(c<r) {
		if(arr[c]>arr[c+1]) {
			//swap
			int temp=arr[c];
			arr[c]=arr[c+1];
			arr[c+1]=temp;
		}
		bubble(arr,r,c+1);
	}else {
		bubble(arr, r-1,0);
	}
	
}
static void selectionSort(int[] arr,int r,int c,int maxElementIndex) {
	if(r==0) {
		return;
	}
	if(c<r) {
		if(arr[c]>arr[maxElementIndex]) {
			selectionSort(arr,r,c+1,c);
		}else {
			selectionSort(arr,r,c+1,maxElementIndex);
		}
	}//if
	else {
		int temp=arr[maxElementIndex];
		arr[maxElementIndex]=arr[r-1];
		arr[r-1]=temp;
		selectionSort(arr,r-1,0,0);
	}
	
}
	public static void main(String[] args) {
		int[] arr= {1,3,4,2,5};
	//	bubble(arr,arr.length-1,0);//Since modification done on the same array object,hence original array is sorted.swallo copy principle works here.
		
		selectionSort(arr,4,0,0);//let the 0th element is the maximum index.
		System.out.println(Arrays.toString(arr));

	}

}
