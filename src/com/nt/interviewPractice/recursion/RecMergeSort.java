package com.nt.interviewPractice.recursion;

import java.util.Arrays;

public class RecMergeSort {
	
	static int[] merge(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=merge(Arrays.copyOfRange(arr, 0, mid));
		int[] right=merge(Arrays.copyOfRange(arr, mid, arr.length));
		return mergeSort(left,right);
		
	}
	
	static int[] mergeSort(int[] left,int[] right) {
		int i=0;int j=0;int k=0;
		int[] mix=new int[left.length+right.length];
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k]=left[i];
				i++;
			}
			else {
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		return mix;
	}

	public static void main(String[] args) {
		int[] arr= {1,5,3,2,4,9,7};
	arr=merge(arr);
		System.out.println(Arrays.toString(arr));

	}

}
