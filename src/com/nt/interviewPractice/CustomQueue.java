package com.nt.interviewPractice;

public class CustomQueue {

	protected int[] data;
	private static final int DEFAULT_SIZE=5;
	private int end=-1;
	public CustomQueue() {
		this(DEFAULT_SIZE);
	}
 public CustomQueue(int size) {
	 this.data=new int[size];
 }
 public boolean insert(int item) {
	 if(isFull()) {
		 return false;
	 }
	 end++;
	 data[end]=item;
	 return true;
 }
 private boolean isFull() {
	 return end==data.length;
 }
 public int remove() throws Exception{
	 if(isEmpty()) {
		 throw new Exception("Queue is empty.");
	 }
	 int item=data[0];
	 for(int i=1;i<=end;i++) {
		 data[i-1]=data[i];
		 System.out.print(data[i]+" ");
		 
	 }
	 System.out.println();
	 end--;
	 
	 return item;
 }
 public int front() throws Exception{
	 if(isEmpty()) {
		 throw new Exception("Queue is Empty.");
	 }
	 return data[0];
 }
 private boolean isEmpty() {
	 return end==0;
 }
 public void display() {
	 for(int i=0;i<data.length;i++) {
		System.out.print(data[i]+" ");
	 }
 }
}
