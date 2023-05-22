package com.nt.interviewPractice;

import java.util.Random;

class A10{
	int n=10;
	public A10(int x) {
		this.n=x;
	}
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("Object is destroyed.");
	}
}
public class oop2WrapperClasses {
	

	public static void main(String[] args) {
	//final	int n=10;
		//n=100; not possible in case of prmitives
		// A  a=new A();
		//a.n=20;//possible as here a not primitive rather Reference type variable.Here this ref.var is fixed for this object only.
//You cant reassign a again to another object i...e a=new A() not possible .But u can modify the values of the object of the reference variable.		

	//a=new A(); error
		//System.out.println("a="+a);
		A10 obj;
		for(int i=0;i<1000000;i++) {
			obj=new A10(i);
		}
		
	

	}

}
