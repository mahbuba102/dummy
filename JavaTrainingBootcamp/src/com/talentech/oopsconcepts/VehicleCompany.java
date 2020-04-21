package com.talentech.oopsconcepts;

public class VehicleCompany {
	
	
	public static Vehicle getCar(){
		
		  Car car = new Car();
		  car.setMake("Nissan");
		  return car;
	}
	
//	public static void printCarInfo(Vehicle car){
//		
//		  System.out.println("Make of the car is  : "+ car.getMake());
//	}
//	
//	
	
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle ();
		
		vehicle.startVehicle();
		vehicle.stopVehicle();
		
		
		Car car = new Car ();
		car.startVehicle();
		car.stopVehicle();
		
		car.setMake("Ford");
		//printCarInfo(car);
		
		
		
//		BiCycle biCycle = new BiCycle();
//		
//		biCycle.startVehicle();
//		biCycle.stopVehicle();
//		
//		
//		Vehicle car2 = new Car();
//		car2.startVehicle();
//		
//		Vehicle bicycle = new BiCycle();
//		biCycle.startVehicle();
//		
//		
//		
//		Car car3 = (Car) getCar(); // vehicle type 
//		
		
	}

}
