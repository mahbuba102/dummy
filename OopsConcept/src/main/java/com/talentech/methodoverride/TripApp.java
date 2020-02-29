package com.talentech.methodoverride;

public class TripApp {
	
	public static void main(String[] args) {
		
		Trip trip = new TripByPlane();
		
		trip.processPaymentForTrip(1200.92);
	}

}
