package com.nt.interviewPractice.recursion;

import java.util.ArrayList;

public class FindAllIndex {
static	ArrayList<Integer> al=new ArrayList<>();

	static ArrayList<Integer> getAllIndices(int[] arr,int target,int index){
		if(index==arr.length) {
			return al;
		}
		if(arr[index]==target) {
			al.add(index);
		}
		
			return getAllIndices(arr,target,index+1);
		
	}

	public static void main(String[] args) {
		int[] arr= {1,4,3,4,2};
		int target=4;
		ArrayList<Integer> ans=getAllIndices(arr,target,0);
		System.out.println(ans);

	}

}
