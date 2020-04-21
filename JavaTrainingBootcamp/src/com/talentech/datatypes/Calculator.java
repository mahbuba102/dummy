package com.talentech.datatypes;

public class Calculator {



	private int age ;



	private static int add (int x,int y){

		int sum = 0;
		sum = x+y;

		return sum;
	}


	protected static int sub (int x,int y){ 

		int diff = 0; // local variable 
		diff = x-y;


		return diff;
	}


	private static int multiplication(int x, int y) {
		int mul = 0; // local variable 
		mul = x*y;


		return mul;
	}



	private static double division(int a, int b) {
		double div = 0; // local variable 
		div =(double) a/b;


		return div;
	}

	/// multiplication and division 

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		//		int x = 20;
		//		int y = 30;

		int sum= 0;
		//int sum_x_y = 0;
		int diff = 0;

		sum = add(10,20); // add method call
		
	
		//sum_x_y = add (10,20);

		diff = sub(b,a); //sub method call


		System.out.println("Sum = " + sum);

		System.out.println(" Difference = " + diff);


		int mul = 0;

		mul = multiplication(a,b);

		System.out.println(" Multiplication of 2 numbers = " + mul);

		double div = division(a,b);
		
		System.out.println(" div " + div);



	}









}
