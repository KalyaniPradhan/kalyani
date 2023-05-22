package com.nt.sorting;

import java.util.ArrayList;
import java.util.List;

//Finding List of missing nums in an array containing 0--N elemnts.Here missing nums are duplicated form of many existing nums.
public class CyclicSortImpl2 {

	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
		   List<Integer> missingList =missingNums(arr);
	System.out.println(missingList);

	}
public static List<Integer> missingNums(int[] arr){
	int i=0;
	while(i<arr.length) {
		int correctIndex=arr[i]-1;
		if( arr[i]!=arr[correctIndex]) {
			swap(arr,i,correctIndex);
		}else {
			i++;
		}
	}
	List<Integer> list=new ArrayList<>();
	for(int index=0;index<arr.length;index++) {
		if(arr[index]!=index+1) {
			list.add(index+1);
		}
		
	}
	return list;
}
public static void swap(int[] arr,int index1,int index2) {
	int temp=arr[index1];
	arr[index1]=arr[index2];
	arr[index2]=temp;
}
}
