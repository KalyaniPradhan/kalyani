package com.nt.stack;

public class DynamicStack extends CustomStack {
	public DynamicStack() {
		
	}
	public DynamicStack(int size) {
		super(size);
	}
	@Override
	public boolean push(int val) throws StackException {
	if(isFull()) {
			int[] temp=new int[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i];
			}
		}
		return super.push(val);
	}

}
