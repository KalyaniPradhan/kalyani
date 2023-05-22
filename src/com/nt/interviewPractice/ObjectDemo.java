package com.nt.interviewPractice;

import java.util.Objects;

class MyObject {
	String name;
	int num;

	public MyObject(String name,int num) {
this.name=name;
this.name=name;
	}

	@Override
	public String toString() {
		return "MyObject [name=" + name + "num="+num+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		return this.num==((MyObject)obj).num;
	}
@Override
protected void finalize() throws Throwable {

	super.finalize();
}
@Override
protected Object clone() throws CloneNotSupportedException {
	
	return super.clone();
}
  
}

public class ObjectDemo {

	public static void main(String[] args) {
		MyObject mo=new MyObject("jay",10);
		//System.out.println(mo);
		//System.out.println(mo.hashCode());
		MyObject mo1=new MyObject("jaya",20);
		//System.out.println(mo==mo1);
		System.out.println(mo.hashCode());
		System.out.println(mo1.hashCode());
		System.out.println(mo1.equals(mo));
		System.out.println(mo1==mo);
		if(mo==mo1) {
			System.out.println("mo is equal to mo1");
		}
		if(mo.equals(mo1)) {
			System.out.println("mo content is equal to mo1");
		}
		System.out.println(mo instanceof MyObject);
		System.out.println(mo.getClass());

	}

}
