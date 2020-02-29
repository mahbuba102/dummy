package com.cigna.avoidmethodoverriding;

public class Derived extends Base {

	// Compilation Error : Final method can't be overridden in Java 
	// public final String version(){ 
	// return "2.0.0"; 
	// } 

	// Hidden static method - Same Signature but bonded at compile time 
	public static String name()
	{ 
		return "Derived";
	} 

	// Hidden private method - Same signature but resolved at compile time 
	private void where(){
		System.out.println("Inside Derived Class");
	}



}
