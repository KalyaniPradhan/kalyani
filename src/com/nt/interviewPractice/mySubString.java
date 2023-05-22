package com.nt.interviewPractice;

public class mySubString {

	public static void main(String[] args) {
	//skip(" ","baccdah");
	//String s=	skip1("jagannath");
	//System.out.println(s);
		//String s=skipApple("jagappleei");
		//System.out.println(s);
		String s=skip3("jagapplehe");
		System.out.println(s);

	}
static void skip(String p,String up) {
	if(up.isEmpty()) {
		System.out.println(p);
		return;
	}
	char ch=up.charAt(0);
	if(ch=='a') {
		skip(p,up.substring(1));
	}else {
		skip(p+ch,up.substring(1));
	}
}
static String skip1(String s) {
	if(s.isEmpty()) {
		return "";
	}

	char ch=s.charAt(0);
	if(ch=='a') {
		return skip1(s.substring(1));
	}else {
		return ch+skip1(s.substring(1));
	}
}
//Skip a perticular word in a given string
static String skipApple(String s) {
	if(s.isEmpty()) {
		return "";
	}
	char ch=s.charAt(0);
	if(s.startsWith("apple")) {
		return skipApple(s.substring(5));
	}
	else {
		return ch+skipApple(s.substring(1));
	}
}
//skip a perticular word(app) only if it is not part of apple
static String skip3(String s) {
	if(s.isEmpty()) {
		return "";
	}
	if(s.startsWith("app") && !s.startsWith("apple")) {
		return skip3(s.substring(3));
	}else {
		return s.charAt(0)+skip3(s.substring(1));
	}
}

}
