package com.nt.interviewPractice;

public class car implements Enginee, Brake,Media {

	@Override
	public void brake() {
	System.out.println("I brake like a normal car.");	

	}

	@Override
	public void start() {
		System.out.println("I start like a normal car.");
		
	}

	@Override
	public void stop() {
		System.out.println("I stop like normal car.");
		
	}

	@Override
	public void acc() {
		System.out.println("I accelerate like normal car.");
		
			}

}
