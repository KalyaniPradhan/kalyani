package com.nt.interviewPractice;

import java.util.ArrayList;

public class subseqAsci2 {
	static ArrayList<String> fun(String p,String up){
		if(up.isEmpty()) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		char ch=up.charAt(0);
ArrayList<String> first=fun(p+ch,up.substring(1));
ArrayList<String> second=fun(p,up.substring(1));
ArrayList<String> third=fun(p+" "+(ch+0),up.substring(1));
first.addAll(second);
first.addAll(third);
return first;
	}

	public static void main(String[] args) {
	ArrayList<String> s=fun("","abc");
	System.out.println(s);

	}

}
