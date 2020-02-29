package com.cigna.avoidmethodoverriding;

public class TestOverriding {
	
	public static void main(String args[]) { 
		// Reference variable of type Base - Object of type Derived 
		
		 Base b = new Derived(); 
		 System.out.println(b.version()); 
		 System.out.println(b.name()); 
		 
	}
	

		

}
