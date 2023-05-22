package com.nt.interviewPractice;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	//System.out.println("Enter the num");
	//int monthNum=in.nextInt();
	//System.out.println("Enter the fruit name.");
	//String fruit=in.next();
	
	int day=in.nextInt();
	/*
	switch(monthNum) {
	case 1:{
		System.out.println("january");
		break;
	}
	case 2:
		System.out.println("february");
		System.out.println("Jay jagannath");
		break;
	
	case 3:{
		System.out.println("March");
		break;
	}
	case 4:{
		System.out.println("April");
		break;
	}
	default :{
		System.out.println("Enter valid month number.");
	}
	}
	*/
	
	/*
	switch("fruit") {
	case "mango"->{System.out.println("king of fruits.");}
	case "orange"->{System.out.println("Orange fruits.");}
	case "apple"->{System.out.println("Apple fruits.");}
	case "grapes"->System.out.println("Grapes fruits");
	                  
	default ->System.out.println("enter valid fruits");
	}
	*/
	
	/*
	switch(day) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:System.out.println("Week days"); 
	        break;
	case 6:
	case 7:
		System.out.println("Weekend");
		break;
		default:
			System.out.println("Invalid week day");
	
	}
	*/
	switch(day) {
	
	case 1,2,3,4 ,5 ->System.out.println("Weak days");
	case 6, 7 ->{System.out.println("Week Ends"); System.out.println("Jay jagannath."); }
	default->   System.out.println("Plz enter valid week day");
	}
	
	

}
}