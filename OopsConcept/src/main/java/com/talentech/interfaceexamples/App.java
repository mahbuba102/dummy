package com.talentech.interfaceexamples;

public class App {
	
	
	public static void main(String[] args) {
		
//		Vehicle vehicle = new Vehicle() ;
		Vehicle bicycle2 = new Bicycle();
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(5);
		bicycle.printState();
		
		Bike bike = new Bike();
		bike.changeGear(15);
		bike.speedUp(20);
		bike.printState();
		
		
		
		
			
	}

}
