package com.talentech.methodoverloading;

public class Calculator {
	
	


	public int add (int a ,int b) {  //defining our first method
		
		System.out.println(" Main addition method");

		return a+b;
	}


	public float add (float a ,float b ){  // changing data type of the parameters
		
		System.out.println("Polymorph -1 ");

		return a+b;

	}


	public int add (int a , int b , int c ){  // changing number of parameters
		
		System.out.println("Polymorph - 2");

		return a+b+c;
	}

	


	
//	public int add (int c , int b , int a ){  // changing the order of the parameters will cause compilation error 
//
//		return a+b+c;
//	}


}
