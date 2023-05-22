package com.nt.interviewPractice;

public class ClassDerivedFromGenericInterface  implements GenericInterface<Integer>{

	public static void main(String[] args) {
	ClassDerivedFromGenericInterface c=new ClassDerivedFromGenericInterface();
	c.display(10);
	

	}

	@Override
	public void display(Integer value) {
		System.out.println(value);
		
	}

}
