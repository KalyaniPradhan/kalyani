package com.nt.interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B{
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int ans=0;
	while(true) {
		System.out.println("Enter the operator:");
		char ch=sc.next().trim().charAt(0);
         if(ch =='+' || ch == '-' ||ch=='*' || ch=='/' || ch=='%') {
			System.out.println("Enter two numbers:");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			if(ch=='+') {
				ans=num1+num2;
				}
			if(ch=='-') {
				ans=num1-num2;
			}
			if(ch=='*') {
				ans=num1*num2;
			}
			if(ch=='/') {
				if(num2!=0) {
					ans=num1/num2;
				}
			}
			if(ch=='%') {
				ans=num1%num2;
			}
		}
		else if(ch=='x' || ch=='X') {
			System.out.println("program finished.");
			//System.exit(0);
			break;
			
		}else {
			System.out.println("Please enter valid operator to continue.");
		}
	System.out.println(ans);
	}
	

		
	}
}
