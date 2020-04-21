package com.talentech.interfaceexamples;

public class Bicycle implements Vehicle  {
	
	
	int speed;
	int gear;
	

	public void speedUp(int increment) {
		
		this.speed = this.speed + increment;
		
	}

	public void changeGear(int a) {
		
		this.gear = a;
		
	}

	public void applyBrake(int decrement) {
		
		this.speed = this.speed - decrement;
		
	}
	
	public void printState(){
		
		System.out.println("Bicycle -  Gear : "+ this.gear+ " Speed :" + this.speed);
	}

}
