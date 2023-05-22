package com.nt.interviewPractice;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunctionTest {
	int sum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<>();
		for(int i=0;i<5;i++) {
			al.add(i+1);
		}
		al.forEach((item)->System.out.println(item*2));
		                     //or
		Consumer<Integer> fun= (item)->System.out.println(item*2);
		al.forEach(fun);
		Operation sum=(a,b)->a+b;
		Operation sub=(a,b)->a-b;
		Operation mul=(a,b)->a*b;
		//Operation div=(a,b)->a/b; //provided that b!=0;
		
		LamdaFunctionTest myCalculator=new LamdaFunctionTest();
		System.out.println(myCalculator.operate(3, 6, mul));
		System.out.println(myCalculator.operate(2, 8, sub));
	}
	
	private int operate(int a,int b,Operation op) {
		return op.operation(a, b);
	}

}
interface Operation{
	int operation(int a,int b);
}