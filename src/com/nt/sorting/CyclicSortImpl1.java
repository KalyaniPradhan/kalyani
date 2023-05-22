package com.nt.sorting;
//Findout the missing number
public class CyclicSortImpl1 {

	public static void main(String[] args) {
		
int[] arr= {0,2,1,4,3};
int ans=missingNum(arr);
System.out.println(ans);
	}

	private static int  missingNum(int[] arr) {
	int i=0;
	while(i<arr.length) {
		int correctIndex=arr[i];
		if(arr[i]<arr.length && arr[i]!=arr[correctIndex]) {
			swap(arr,correctIndex,i);
		}else {
			i++;
		}
	}
	
	for(int index=0;index<arr.length;index++) {
		if(arr[index]!=index){
		return index;
		}
	}
	return arr.length;
		
	}
	private static void swap(int[] arr,int first,int last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}

}
