package com.nt.interviewPractice;

public class ExceptionTest {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			//int c=a/b;
			int ans=divide(a,b);
		}//catch(ArithmeticException e) {
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("From normal exception class.");
		}
		
		finally {
			System.out.println("From finally block.");
		}

	}
	static int divide(int a,int b) {
		if(b==0) {
			throw  new ArithmeticException("Plz dont divide by zero.");
		}
		return a/b;
	}

}
