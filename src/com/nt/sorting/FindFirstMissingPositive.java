package com.nt.sorting;
//Implementing Cyclic Sort here
public class FindFirstMissingPositive {

	public static void main(String[] args) {
		int[] arr= {3,4,-1,1};
		int ans=findMissingPositive(arr);
		System.out.println(ans);
	}
	public static int findMissingPositive(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex=arr[i]-1;
		if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correctIndex]) {
			swap(arr,i,correctIndex);
		}else {
			i++;
		}
		}//while
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=index+1) {
				return index+1;
			}
		}
		return arr.length+1;
	}
	public static void swap(int[] arr,int i1,int i2) {
		int temp=arr[i1];
		arr[i1]=arr[i2];
		arr[i2]=temp;
	}

}
