package com.nt.interviewPractice;

public class CarMain {

	public static void main(String[] args) {
	car c=new car();
	c.start();
	c.acc();
	c.stop();
	Media carMedia=new car();
	carMedia.stop();
	
	NiceCar car=new NiceCar();
	car.start();
	car.startMusic();
	car.stopMusic();
	//car.upgradeEnginee();
	Enginee eng=new ElectricEnginee();
	NiceCar nc=new NiceCar(eng);
	nc.start();  
	nc.startMusic();
	nc.stop();

	}

}
