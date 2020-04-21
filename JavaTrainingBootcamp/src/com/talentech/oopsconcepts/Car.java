package com.talentech.oopsconcepts;

public class Car extends Vehicle{
	
	private int id;
	private String make;
	private String model;
	private int year;
	
	
	
	
	private String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public void startVehicle(){
		
		System.out.println("Car Started");
	}
	
	
	public void stopVehicle(){
		
		System.out.println("Car Stopped");
	}

	
    

}
