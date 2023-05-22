package com.nt.interviewPractice;

public class subseqAscii {
	static void subseqAsci(String p,String up) {
		if(up.isEmpty()) {
			System.out.print(p+" ");
			return ;
		}
		char ch=up.charAt(0);
		subseqAsci(p+ch,up.substring(1));
		subseqAsci(p,up.substring(1));
		subseqAsci(p+" "+(ch+0),up.substring(1));
	}

	public static void main(String[] args) {
		subseqAsci("","abc");

	}

}
