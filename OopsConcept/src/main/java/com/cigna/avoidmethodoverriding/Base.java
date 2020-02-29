package com.cigna.avoidmethodoverriding;

public class Base {

	public final String version(){
		where(); // This will call Base class where()  
		return "1.0.0";
	}

	public static String name(){
		return "Base"; 
	} 

	private void where(){ 
		System.out.println("Inside Base Class");

	}


}
