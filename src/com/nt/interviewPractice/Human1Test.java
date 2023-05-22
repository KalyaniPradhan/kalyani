package com.nt.interviewPractice;

import java.util.Arrays;

class Human1 implements Cloneable{
	int age;
	String name;
	int[] arr;
	public Human1(int age,String name) {
		this.age=age;
		this.name=name;
this.arr=new int[] {3,4,5,6,9,1};
	}
	public Human1(Human1 h) {
	this.age=h.age;
	this.name=h.name;
	this.arr= h.arr;
	}

	@Override
	public String toString() {
		return "Human1 [age=" + age + ", name=" + name + ", arr=" + Arrays.toString(arr) + "]";
	}
	public Object clone() throws CloneNotSupportedException{
		Human1 jagan=new Human1(23,"jagan");
		Human1 jagannath=new Human1(jagan);//This is swallow copy
		//Deep copy
		jagannath.arr=new int[jagan.arr.length];
		for(int i=0;i<jagannath.arr.length;i++) {
			jagannath.arr[i]=this.arr[i];
		}
		return jagannath;
		//return super.clone();
	}
	
}
public class Human1Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	Human1 jaga=new Human1(21,"jaga");
	//Human1 kalia=new Human1(jaga);
	Human1 kalia=(Human1)jaga.clone();
	System.out.println(jaga);
	//System.out.println(kalia);
	System.out.println(kalia.age+" "+kalia.name+Arrays.toString(kalia.arr));
	kalia.arr[0]=100;
	System.out.println(Arrays.toString(jaga.arr));
	

	}

}
