package com.nt.sorting;

import java.util.ArrayList;
import java.util.List;

//Finding All duplicates in a given array 1---N
public class CyclicSortImpl5 {

	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
	List<Integer> list=new ArrayList<>();
	list=findDuplicates(arr);
	System.out.println(list);

	}
	public static List<Integer> findDuplicates(int[] arr){
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}//while
		List<Integer> list=new ArrayList<>();
	for(int index=0;index<arr.length;index++) {
		if(arr[index]!=index+1) {
			list.add(arr[index]);
		}
	}
	return list;
	}
	public static void swap(int[] arr,int i1,int i2) {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
	}

}
