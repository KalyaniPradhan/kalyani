package com.nt.sorting;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
	int[] arr= {2,1,5,4,3};
	cyclicSort(arr);
	System.out.println(Arrays.toString(arr));

	}
	static void cyclicSort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i]-1;
			if(arr[correctIndex]!=arr[i] ){
			swap(arr,correctIndex,i);	
			}
			else {
				i++;
			}
		}
	}
public static void swap(int[] arr,int correctIndex,int i) {
	int temp=arr[correctIndex];
	arr[correctIndex]=arr[i];
	arr[i]=temp;
}
}
