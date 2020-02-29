package com.talentech.methodoverride;

public class Trip {
	
	
	public void processPaymentForTrip(double totalcost){
		
		//String tempTransport = tripType;
		double amount = totalcost;
		
		System.out.println("Inside Super Class");
		System.out.println( "The total amount spent on the trip "  + " : "+ amount);
		
		
		
	}

}
