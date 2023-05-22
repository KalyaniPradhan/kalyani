package com.nt.interviewPractice;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empId:");
		int empId=sc.nextInt();
		String dept=sc.next();
		/*
		switch(empId) {
		case 1:
			 System.out.println("Emp Id: 1");
			 break;
		case 2:
			System.out.println("Emp id: 2");
			break;
		case 3:
			System.out.println("Enter dept name:");
			switch("dept") {
			case "admin":
				System.out.println("Emp id: 3");
				System.out.println("Dept is: Admin");
			     break;
			case "Purchase":
				System.out.println("Emp id: 3");
				System.out.println("dept is: purchase");break;
				default:
					System.out.println("Emp belongs to normal employee.");
				
			}//inner switch
			break;
			
		default:
			System.out.println("Please enter valid empId");
			
		}
		*/
		switch(empId) {
		case 1->System.out.println("Emp id is:1");
		case 2->System.out.println("Emp id is: 2");
		case 3->{
			System.out.println("Enter dept name:");
			
			switch("dept") {
			case "admin"->System.out.println("admin dept");
			case "purchase"->System.out.println("Purchase dept.");
			default ->System.out.println("Employee id 3 belongs to normal employee.");
			}
			
			break;
		}
		default->System.out.println("plz enter valid empId such as 1/2/3");
		}

	}

}
