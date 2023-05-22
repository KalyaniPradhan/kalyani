package com.nt.msc;

import java.util.Arrays;

public class MyPr {

	public static void main(String[] args) {
		int[][] arr= {{10,2,6,23},{1,2,8,9},{1,9,6,5}};
		//reverse(arr);
	//	System.out.println(Arrays.toString(arr));
		//System.out.println(findMaxInARange(arr,1,3));
		int target=23;
		int[] ans=searchElement(arr,target);
		System.out.println(Arrays.toString(ans));
		}
	public static int[] searchElement(int[][] arr,int target) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static int searchMax(int[][] arr) {
		int min=arr[0][0];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]<min) {
					min=arr[row][col];
				}
			
			}
		
		}
		return min;
	}
	public static int searchMaxElement(int[][] arr) {
		int min=Integer.MIN_VALUE;
		for(int[] r:arr) {
			for(int e:r) {
			if(e<min)
				min=e;
		}
		}
		return min;
	}
}