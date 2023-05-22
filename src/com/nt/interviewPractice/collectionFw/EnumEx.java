package com.nt.interviewPractice.collectionFw;

public class EnumEx {
	enum Week{
		Monday,TuesDay,WednessDay,ThurseDay,Friday,SaterDay,Sunday;
		Week(){
			System.out.println("Constructor called :"+this);
		}
	}

	public static void main(String[] args) {
	Week w=Week.Monday;
	/*
	for(Week weekday:Week.values()) {
		System.out.println(weekday);
	}
	System.out.println(w.ordinal());
	Enum can implement many no of interfaces but cant extended from any classes.
*/
	
	}

}
