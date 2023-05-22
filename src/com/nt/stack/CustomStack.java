package com.nt.stack;

public class CustomStack {
	//Array Implementation of stack
	protected int[] arr;
	protected static final int default_size=5;
	int ptr=-1;
	public CustomStack() {
		this(default_size);
	}
	public CustomStack(int size) {
		this.arr=new int[size];
	}
	public boolean push(int val) throws StackException {
		if(isFull()) {
			System.out.println("Stack is already fulled");
			return false;
			
		}
		ptr++;
		arr[ptr]=val;
		return true;
	}
	  boolean isFull()throws StackException {
		return ptr==arr.length-1;
	}
	 boolean isEmpty() {
		return ptr==-1;
	}
	public  int pop() throws StackException{
		if(isEmpty()) {
			System.out.println("Cant do a pop opeartion from an empty stack");
		}
		int item=arr[ptr];
		ptr--;
		return item;
	}
	public int peek() throws StackException{
		int item=arr[ptr];
		return item;
		
	}
	public void display() {
	//int item=arr[ptr];
	for( ptr=0;ptr<arr.length;ptr++) {
		System.out.print(arr[ptr]+" ");
		
	}
	}
	public static void main(String[] args) throws StackException {
		CustomStack cs=new CustomStack(4);
		//cs.push(10);
		//cs.push(13);
		//cs.push(19);
		//cs.push(23);

	//	System.out.println(cs.peek());
	//	System.out.println(cs.pop());
	//	System.out.println(cs.peek());
	//	System.out.println("----------------------");
		//cs.display();
		//cs.push(12);
		//cs.push(14);
		DynamicStack ds=new DynamicStack();
		ds.push(1);
		ds.push(2);
		ds.push(3);
		ds.push(4);
		ds.push(5);
		ds.push(7);
		ds.push(6);
		ds.display();
		

	}

}

