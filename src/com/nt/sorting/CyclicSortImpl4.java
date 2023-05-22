package com.nt.sorting;
//Finding Duplicate Elements
public class CyclicSortImpl4 {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2};
		int duplicate=findDuplicate(arr);
		System.out.println(duplicate);

	}
	public static int findDuplicate(int[] arr ) {
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=i+1) {
				int correctIndex=arr[i]-1;
//The inner if..else used for the situation such as: arr[1] and arr[2], both have
//same elements ,else block will return that element.				
				if(arr[i]!=arr[correctIndex]) {
					swap(arr,i,correctIndex);
				}else {
					return arr[i];
				}
			}else {
				i++;
			}
		}//while
		return -1;
	}
	private static void swap(int[] a,int i1,int i2) {
		int temp=a[i1];
		a[i1]=a[i2];
		a[i2]=temp;
	}

}
