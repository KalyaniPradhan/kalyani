package com.nt.interviewPractice;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
	//	fun(1,2,3,4,5,6,7,8);
		//func("Jay ","jagannath ","swami ","nayan ","pathagami ","vaba ","tume");
		multipleTypeArg(10,20,"jaga","jagan","jagannath");
		

	}
static void fun(int  ...v) {//fun(int...v) It is known as variable length of Arguments
	System.out.println(Arrays.toString(v));//Internally all values of the variables will be stored in the form of array.
	//Here Arrays.toString() is of int[] type
}
static void func(String ...v) {
	System.out.println(Arrays.toString(v));//Here we have used Arrays.toString() of Object[] type.
}
static void multipleTypeArg(int a,int b,String ...v) {
	System.out.println("a="+a+" b="+b+" "+Arrays.toString(v)); //Variable length Argument must be in the last ar in the list.
}
}
