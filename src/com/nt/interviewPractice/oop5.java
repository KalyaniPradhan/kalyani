package com.nt.interviewPractice;

public class oop5 {
	
	static class Inner{
	//class Inner{
		 String name;
		public Inner(String name) {
			this.name=name;
		}
	}

	public static void main(String[] args) {
		oop5 obj=new oop5();
		Inner i1=new Inner("jaga");
		Inner i2=new Inner("kalia");
		System.out.println(i1.name);
		System.out.println(i2.name);
		
		

	}

}
