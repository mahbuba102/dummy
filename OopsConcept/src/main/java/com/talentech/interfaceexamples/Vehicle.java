package com.talentech.interfaceexamples;

public interface Vehicle {
	
	final static int noOfwheels = 2;
	
    void speedUp(int increment);
	void changeGear(int a);
	void applyBrake(int decrement);
	

}
