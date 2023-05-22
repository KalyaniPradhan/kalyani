package com.nt.mystring;

public class MyStrBuilder {

	public static void main(String[] args) {
	//	StringBuilder sb=new StringBuilder("hello");
	/*
		sb.charAt(0);
		System.out.println(sb);
		sb.setCharAt(0, 'G');
		System.out.println(sb);
		sb.insert(0, 'C');
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		*/
		
		//sb.append('b');
		//sb.append('d');
		//sb.append("aughter");
		//System.out.println(sb);
		//System.out.println(sb.length());
//Reverse a String
		
		
		
		//String str="hello";//o/p:olleh
	//	char[] ch=str.toCharArray();
		//for(int i=str.length()-1;i>=0;i--) {
		//	System.out.print(ch[i]+" ");
		
		//}
		//Using Binary approach ,divide the whole string into two equal halfs n then exchange ist char
		//by last char
		StringBuilder sb1=new StringBuilder("hello");
		for(int i=0;i<sb1.length()/2;i++) {
			int firstIndex=i;
			int lastIndex=sb1.length()-1-i;//5-1-0=4
			char frontChar=sb1.charAt(firstIndex);
			char backChar=sb1.charAt(lastIndex);
			sb1.setCharAt(firstIndex, backChar);
			sb1.setCharAt(lastIndex, frontChar);
			
			
		}
		System.out.println(sb1);
		
sb1.insert(1,'G');
System.out.println(sb1);
	}

}
