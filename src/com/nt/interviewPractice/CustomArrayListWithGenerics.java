package com.nt.interviewPractice;

import java.util.Arrays;
import java.util.List;

public class CustomArrayListWithGenerics<T> {
//public class CustomArrayListWithGenerics<T extends Number> i.e we restricted upto numbers such as integer
//float etc.It will not accept String type.It is known as wild card characters.	
private Object[] data;
private static int DEFAULT_SIZE=5;
private int size=0;
public CustomArrayListWithGenerics() {
	this.data=new Object[DEFAULT_SIZE];
}
public void add(T num) {
	if(isFull()) {
		resize();
	}
	data[size++]=num;
}
//For wild cards:
public void getList(List<? extends Number> list) {
	//do something
	
}
	private void resize() {
	Object temp[]=new Object[data.length*2];
	//Copy the current items in the new array
	for(int i=0;i<data.length;i++) {
		temp[i]= data[i];
	}
	data=temp;
	
}
	private boolean isFull() {
	
	return size==data.length;
}
	public void display() {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
	}
	public Object remove() {
		Object removed=data[--size];
		return removed;
	}
	public Object get(int index) {
		return  data[index];
	}
	public int size() {
		return size;
	}
	public void set(int index,  T value) {
		data[index]=value;  //Here T is smaller type and data[] is of Object type
	}
	public static void main(String[] args) {
		CustomArrayListWithGenerics ca=new CustomArrayListWithGenerics();
		ca.add(1);
		ca.add(2);
		ca.add(3);
		ca.add(4);
		ca.add(5);
	//	ca.display();
		ca.add("jaga");
		ca.add(23.0f);
		ca.add(12.9);
		ca.add(true);
		//ca.display();
		//System.out.println(ca.get(6));
		//System.out.println(ca.size());
		//ca.set(1, "Jagannath");
		ca.add("kalia");
		ca.add(12);

		ca.set(1, "jagannath");
		ca.display();
		

	}

}
