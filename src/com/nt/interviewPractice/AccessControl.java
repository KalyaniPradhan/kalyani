package com.nt.interviewPractice;

import java.util.Arrays;

class Access{
	int num;
	String name;
	int[] arr;
	public Access(int num,String name) {
	this.name=name;
this.num=num;
arr=new int[num];
	}
}
public class AccessControl {

	public static void main(String[] args) {
		Access ac=new Access(10,"jaga");
		ac.arr[0]=12;
		ac.arr[1]=20;
		System.out.println(ac.num+" "+ac.name+" "+Arrays.toString(ac.arr));

	}

}
