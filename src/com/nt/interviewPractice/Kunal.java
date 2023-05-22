package com.nt.interviewPractice;

public class Kunal {
	private Node head;
	private Node tail;
	private int size;
	public Kunal() {
		this.size=0;
	}
	
	private class Node{
		private int val;
		private Node next;
		public Node(int val) {
	this.val=val;
		}
		public Node(int val,Node next) {
			this.val=val;
			this.next=next;
		}
	}
	
	
	
public void insertFirst(int val) {
	Node node=new Node(val);
	node.next=head;
	head=node;
	if(tail==null) {
		tail=head;
	}
	size++;
}
public void insertLast(int val) {
	if(tail==null) {
		insertFirst(val);
		return;
	}
	Node node=new Node(val);
tail.next=node;
tail=node;
size++;
}
public void insertAtIndex(int val,int index) {
	Node temp=head;
	for(int i=1;i<index;i++) {
		temp=temp.next;
	}
	Node node=new Node(val,temp.next);
	temp.next=node;
	size++;
}
public int deleteFirst() {
	int val=head.val;
	head=head.next;
	size--;
	return val;
}
public int deleteLast() {
	if(size<=1) {
		return deleteFirst();
	}
	Node secondLast=getReference(size-2);
	int val=tail.val;
	tail=secondLast;
	tail.next=null;
	return val;
	
}
public int deleteFromIndex(int index) {
	if(index==0) {
		return deleteFirst();
	}
	if(index==size-1) {
		return deleteLast();
	}
	Node prev=getReference(index-1);
	int val=prev.next.val;
	prev.next=prev.next.next;
	return val;
	
}
public Node findReferenceOfNodeWithValue(int val) {
	Node node=head;
	while(node!=null) {
		if(node.val==val) {
			return node;
		}
		node=node.next;
	}
	return null;
}
public Node getReference(int index) {
	Node node=head;
	for(int i=0;i<index;i++) {
		node=node.next;
	}
	return node;
}

public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.val+"--->");
		temp=temp.next;
	}
	System.out.print("END");
}
}
