package com.nt.sorting;

import java.util.Arrays;

//In a given array find one number which is missing and one num which is duplicated i..e 1---n
public class CyclicSortImpl6 {

	public static void main(String[] args) {
		
int[] arr= {4,3,5,6,2,2};
int[] ans=findMissingAndDuplicateNums(arr);
System.out.println(Arrays.toString(ans));
	}

	private static int[] findMissingAndDuplicateNums(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i]-1;
			if(arr[i]!=arr[correctIndex] ){
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}
	for(int index=0;index<arr.length;index++) {
		if(arr[index]!=index+1) {
			return new int[] {arr[index],index+1};
		}
	}
		
	
		return new int[] {-1,-1};
	}

	private static void swap(int[] arr, int i, int correctIndex) {
   int temp=arr[i];
   arr[i]=arr[correctIndex];
   arr[correctIndex]=temp;
		
	}

}
