package com.talentech.interfaces;

public class VehicleCompany {
	
	

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle (); // u cant instantitate an object of an interface since it's not a fully implemented class(not concrete) 
		Vehicle vehicle = new Car ();

		vehicle.start();
		vehicle.stop();
		System.out.println(vehicle.dummyversion);
	}

}
