package com.nt.interviewPractice;
class Human{
	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	public Human(int age,String name,int sal,boolean mrd) {
		this.age=age;
		this.name=name;
		this.salary=sal;
		this.married=mrd;
		this.population=population+1;
	}
}
public class oop3 {
	public static void main(String[] args) {
		Human kunal=new Human(23,"kunal",900,true);
		Human rahul=new Human(24,"Rahul",789,false);
		
		System.out.println(Human.population);
		System.out.println(Human.population);
	}


}
