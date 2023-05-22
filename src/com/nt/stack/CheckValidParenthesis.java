package com.nt.stack;

import java.util.Stack;

public class CheckValidParenthesis {
static boolean isBalanced(String s) {
	Stack<Character> st=new Stack<>();
	for(int i=0;i<s.length()-1;i++) {
		char c=s.charAt(i);
		if(c=='(' || c=='{' || c=='[') {
			st.push(c);
		}else if(c==')' || c=='}' || c==']') {
			if(st.isEmpty()) {
				return false;
			}
			char top=st.pop();
if(! (top=='(' && c==')') || !(top=='{' && c=='}') || !(top=='[' && c==']') ) {
	return false;
}else {
	return true;
}
		}
	}
	return st.isEmpty();
}
	public static void main(String[] args) {
		String s="(([()]))";
		if(isBalanced(s)) {
			System.out.println(s+" is balanced parenthesis expression. ");
		}else {
			System.out.println(s+" is not balanced parenthesis expression.");
		}

	}

}
