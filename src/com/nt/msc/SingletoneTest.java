package com.nt.msc;

public class SingletoneTest {

	public static void main(String[] args) {
		Singletone obj=Singletone.getInstance();
		System.out.println(obj);
		Singletone obj1=Singletone.getInstance();
		System.out.println(obj1);

	}

}
