package com.nt.interviewPractice;

import com.nt.stack.StackException;

public class CustomStack {

protected int[] data;
private static final int DEFAULT_SIZE=10;
int ptr=-1;
public CustomStack() {
	this(DEFAULT_SIZE);
}
public CustomStack(int size) {
	this.data=new int[size];
}
public boolean push(int item) {
	if(isFull()) {
		return false;
	}
	ptr++;
	data[ptr]=item;
	return true;
	
}
public int pop() throws StackException {
	if(isEmpty()) {
		throw new StackException("Cant pop from an empty stack.");
	}
	int removed=data[ptr];
	ptr--;
	return removed;
}
public int peek()throws StackException {
	if(isEmpty()) {
		throw new StackException("Cant peek from an empty stack");
	}
	int item=data[ptr];
	return item;
	
}
public void display() {
	for(int i=0;i<data.length;i++) {
		System.out.print(data[i]+" ");
	}
}
private boolean isFull() {
	return ptr==data.length-1;
}
private boolean isEmpty() {
	return ptr==-1;
}

}
