package com.nt.interviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class A{
	static void convert(StringBuffer sb) {
		
		for(int i=0;i<sb.length();i++) {
		Character ch=sb.charAt(i);
		if(Character.isLowerCase(ch)) {
			sb.setCharAt(i, Character.toUpperCase(ch));
		}else {
			sb.setCharAt(i, Character.toLowerCase(ch));
		}
		}
		System.out.println(sb);
	}
	static void convert1(StringBuffer sb) {
		System.out.println("Length of the string is:="+sb.length());
		for(int i=0;i<sb.length();i++) {
			Character ch=sb.charAt(i);
			if(ch==' ')
				continue;
			if(Character.isLowerCase(ch)) {
				
				
				Character upperCase=(char)(ch-32);
				
				
				sb.setCharAt(i, upperCase);
			}else {
				
				Character lowerCase=(char)(ch+32);
				
				sb.setCharAt(i, lowerCase);
			}
		}
		System.out.println(sb);
	}
	static void convert2(StringBuffer sb) {
		for(int i=0;i<sb.length();i++) {
			Character ch=sb.charAt(i);
			if(ch==' ') {
				System.out.print(" ");
			}
			if(Character.isLowerCase(ch)) {
				Character upperCase=(char)(ch-32);
				sb.setCharAt(i, upperCase);
			}else {
				
			if(Character.isUpperCase(ch)) {
				Character lowerCase=(char)(ch+32);
				sb.setCharAt(i, lowerCase);
			}
			}
		}
		System.out.print(sb);
	}
	
		public static void main(String[] args) {
	
	
  
	}

}
