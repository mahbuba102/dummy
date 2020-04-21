package com.talentech.methodoverloading;

public class CalculatorApp {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		float result1 = calculator.add(10.2f, 13.8f);
		System.out.println("The addition of two floating point numbers is : " + result1 );
		
		int result2 = calculator.add(10, 20, 30);
		System.out.println("The addition of 3 integers is  : " + result2 );
		
		int result3  = calculator.add(10, 20);
		System.out.println("The addition of 2 integers is  : " + result3 );
		
		
	}

}
