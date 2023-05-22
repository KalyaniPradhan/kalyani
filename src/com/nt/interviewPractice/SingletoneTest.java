package com.nt.interviewPractice;
class Singletone{
	private static Singletone instance;
	private Singletone() {
		
	}
	public static  Singletone getInstance() {
		if(instance==null) {
			instance=new Singletone();
		}
		return instance;
	}
	
	
}
public class SingletoneTest {

	public static void main(String[] args) {
		Singletone s=Singletone.getInstance();
		System.out.println(s);
		Singletone s1=Singletone.getInstance();
		System.out.println(s1);

	}

}
