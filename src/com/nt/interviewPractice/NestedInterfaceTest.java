package com.nt.interviewPractice;
class N{
	public interface nestedInterface{
		boolean isOdd(int num);
	}
}
class M implements N.nestedInterface{

	@Override
	public boolean isOdd(int num) {
		
		return ((num & 1) ==1);
	}
	
}
public class NestedInterfaceTest {

	public static void main(String[] args) {
		M b=new M();
		System.out.println(b.isOdd(9));

	}

}
