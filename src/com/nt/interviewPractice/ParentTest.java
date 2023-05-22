package com.nt.interviewPractice;
abstract class Parent {
	int age;
	abstract void career(String profession);
	abstract void partner(String name,int age);
	public Parent(int age) {
		this.age=age;
	}
}
class Daughter extends Parent{
	public Daughter(int age) {
		super(age);
	}
	@Override
	void career(String profession) {
	System.out.println("I want to be doctor.");
		
	}
	@Override
	void partner(String name, int age) {
System.out.println("I want to marry a scientiest."+name+" whohas age of "+age);
		
	}
}
class Son extends Parent{
   public Son(int age) {
	super(age);
}
	@Override
	void career(String profession) {
	System.out.println("I want to be Engineer.");
		
	}

	@Override
	void partner(String name, int age) {
	System.out.println("I want to marry a journalist."+name+" who has age of "+age);
		
	}
	
}
public class ParentTest {

	public static void main(String[] args) {
	Son son=new Son(9);
	son.career("Jaga");
	Daughter d=new Daughter(6);
	d.career("kuni");

	}

}
