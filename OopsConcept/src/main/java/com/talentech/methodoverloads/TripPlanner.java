package com.talentech.methodoverloads;

/**
 * This application is written by Mahbuba Nimme as a USE CASE for Java olymorphism COncept (Method Overloading)
 *
 */
public class TripPlanner 
{
	

	
    public static void main( String[] args )
    {
        double tripToMiamiCost = 100.21;
        double tripToLACost = 200.41;
        double tripToMexicoCost = 150.54;
        double tripToLVCost = 160.29;
        
       // double totalcost = calculateRoundTripTotalCost (tripToMiamiCost,tripToLACost);
        double totalcost = calculateRoundTripTotalCost (tripToMiamiCost,tripToLACost,tripToMexicoCost);
       // System.out.println(" Total Cost for 2- Destinations Trip : " + totalcost );
        System.out.println(" Total Cost for 3 - Destination Trip : " + totalcost);
        
    }

	private static double calculateRoundTripTotalCost(double tripToMiamiCost, double tripToLACost,
			double tripToMexicoCost) {
		// TODO Auto-generated method stub
		return tripToMiamiCost+tripToLACost+tripToMexicoCost;
	}

	private static double calculateRoundTripTotalCost(double tripToMiamiCost, double tripToLACost) {
		// TODO Auto-generated method stub
		return tripToMiamiCost+tripToLACost;
	}
}
