package com.nt.interviewPractice;

import java.util.Arrays;

public class CustomArrayList {
private int[] data;
private static int DEFAULT_SIZE=5;
private int size=0;
public CustomArrayList() {
	this.data=new int[DEFAULT_SIZE];
}
public void add(int num) {
	if(isFull()) {
		resize();
	}
	data[size++]=num;
}
	private void resize() {
	int temp[]=new int[data.length*2];
	//Copy the current items in the new array
	for(int i=0;i<data.length;i++) {
		temp[i]=data[i];
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
	public int remove() {
		int removed=data[--size];
		return removed;
	}
	public int get(int index) {
		return data[index];
	}
	public int size() {
		return size;
	}
	public void set(int index,int value) {
		data[index]=value;
	}
	public static void main(String[] args) {
		CustomArrayList ca=new CustomArrayList();
		ca.add(1);
		ca.add(2);
		ca.add(3);
		ca.add(4);
		ca.add(5);
		ca.display();

	}

}
