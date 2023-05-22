package com.nt.interviewPractice.recursion;

import java.util.ArrayList;

public class FindIndicesOfATarget {

	static ArrayList<Integer> findIndices(int[] arr,int target,int index,ArrayList<Integer> list){
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		return findIndices(arr,target,index+1,list);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,4,8};
		int target=4;
	//	ArrayList<Integer> ans=findIndices(arr,target,0,new ArrayList<>());
	//	System.out.println(ans);
		//or
		/*
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> a=findIndices(arr,target,0,al);
		System.out.println(a);
        */
	}

}
