package com.nt.interviewPractice;

public class NiceCar {

	private Enginee enginee;
	private Media player=new CDPlayer();
	public NiceCar() {
		enginee=new PowerEnginee();
	}
	public NiceCar(Enginee enginee) {
		this.enginee=enginee;
	}
	public void start() {
		enginee.start();
	}
	public void stop() {
		enginee.stop();
	}
	public void startMusic() {
		player.start();
	}
	public void stopMusic() {
		player.stop();
	}
	public void upgradeEnginee() {
		this.enginee=new ElectricEnginee();
	}

}
