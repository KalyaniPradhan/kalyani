package com.nt.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
	int[] arr= {1,9,6,5,4,3,2,8};
	selectionSort(arr);
	System.out.println(Arrays.toString(arr));

	}
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int start=0;
			int end=arr.length-1-i;
		int	maxElementIndex=getIndex(arr,start,end);
		
			swap(arr,maxElementIndex,end);
		}
	}
	private static int getIndex(int[] a,int start,int end) {
		int maxIndex=start;
	for(int i=start;i<=end;i++) {
		if(a[maxIndex]<a[i]) {
			maxIndex=i;
		}
		}
	return maxIndex;
	}
private static void swap(int[] a,int maxElementIndex,int i) {
	int temp=a[maxElementIndex];
	a[maxElementIndex]=a[i];
	a[i]=temp;
	
}

}
