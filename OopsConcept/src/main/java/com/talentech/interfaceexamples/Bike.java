package com.talentech.interfaceexamples;

public class Bike implements Vehicle {
	

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
		
		System.out.println("Bike -  Gear : "+ this.gear+ " Speed :" + this.speed);
	}

	

}
