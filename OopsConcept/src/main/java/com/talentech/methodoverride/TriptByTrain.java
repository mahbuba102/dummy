package com.talentech.methodoverride;

public class TriptByTrain extends Trip {

	public void processPaymentForTrip(double totalcost){

		//String tempTransport = tripType;
		double amount = totalcost;
         
		
		 System.out.println("Inside Child Class -2 ");
		System.out.println( "The total amount spent on the trip by train : " + amount);



	}


}
