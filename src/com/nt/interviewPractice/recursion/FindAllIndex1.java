package com.nt.interviewPractice.recursion;

import java.util.ArrayList;

public class FindAllIndex1 {
	
	static ArrayList<Integer> searchIndices(int[] arr,int target,int index){
		ArrayList<Integer> al=new ArrayList<>();
		if(index==arr.length) {
			return al;
		}
		if(arr[index]==target) {
			al.add(index);
		}
		ArrayList<Integer> ansFromBelowCalls=searchIndices(arr,target,index+1);
		al.addAll(ansFromBelowCalls);
		return al;
	}
	
	
	

	public static void main(String[] args) {
		int[] arr= {1,3,2,4,5,4};
		int target=4;
		ArrayList<Integer> ans=searchIndices(arr,target,0);
		System.out.println(ans);	
		}

}
