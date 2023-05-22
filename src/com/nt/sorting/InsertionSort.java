package com.nt.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {1,3,2,4,7,8,9,6};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static  void insertionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
			}
		}
	}
	private static void swap(int[] arr,int first,int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

}
