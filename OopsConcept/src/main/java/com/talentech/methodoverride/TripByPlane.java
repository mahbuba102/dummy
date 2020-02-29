package com.talentech.methodoverride;

public class TripByPlane extends Trip {

	public void processPaymentForTrip(double totalcost){

		//String tempTransport = tripType;
		double amount = totalcost;

        System.out.println("Inside Child Class -1 ");
		System.out.println( "The total amount spent on the trip by Plane : " + amount);



	}

}
