package com.nt.interviewPractice;

public class DynamicStack extends CustomStack{
	public DynamicStack() {
		
	}
	public DynamicStack(int size) {
		super(size);
	}
	@Override
	public boolean push(int item) {
		int temp[]=new int[data.length*2];
		for(int i=0;i<temp.length;i++) {
			temp[i]=data[i];
		}
		return super.push(item);
	}

}
