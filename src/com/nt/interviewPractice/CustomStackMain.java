package com.nt.interviewPractice;

import com.nt.stack.StackException;

public class CustomStackMain {

	public static void main(String[] args) throws StackException {
		CustomStack cs=new CustomStack(4);
		cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(40);
		//System.out.println(cs);
		cs.display();
		System.out.println(cs.pop());
		System.out.println(cs.pop());
		System.out.println(cs.peek());
		//cs.display();

	}

}
