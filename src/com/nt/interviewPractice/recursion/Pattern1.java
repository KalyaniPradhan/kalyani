package com.nt.interviewPractice.recursion;

public class Pattern1 {
	static void tringle(int row,int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			System.out.print("*");
			tringle(row,col+1);
		}else {
			System.out.println();
			tringle(row-1,0);
		}
	}
	
	static void normalTringle(int row,int col) {
		if(row==0) {
			return ;
		}
		if(col<row) {
			normalTringle(row,col+1);
			System.out.print("*");
		}
		else {
			normalTringle(row-1,0);
			System.out.println();
		}
	}

	public static void main(String[] args) {
	//	tringle(4,0);
    normalTringle(4,0);

	}

}
