package com.nt.msc;

public class Singletone {
	private Singletone() {
		
	}
	private static Singletone instance;
	public static Singletone getInstance() {
		if(instance==null) {
			instance=new Singletone();
		}
		return instance;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
