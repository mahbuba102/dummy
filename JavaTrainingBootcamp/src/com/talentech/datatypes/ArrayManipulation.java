package com.talentech.datatypes;

public class ArrayManipulation {

	public static void main(String[] args) {

		int arr[] = new int [10]; //declaring an array 

		arr[0] = 20;  ///inserting the value
		arr[1] = 30;
		arr[2] = 10;

		arr[3] = 20;
		arr[4] = 30;
		arr[5] = 10;
		arr[6] = 20;
		arr[7] = 30;
		arr[8] = 10;
		arr[9] = 10;

		//System.out.println(" the value in the 7th position is " + arr[6] );


		int arr2 [] = new int [20]; //defined the array
		//10*20 = 200

		for(int i = 0 ; i<arr2.length ; i++){

			arr2[i] = (i+1)*10;   //inserted the data

			//--->   arr2[0] = (0+1) *10 = 10
			//--->   arr2[1] = (1+1) *10 = 20

			//--->   arr2[2] = (2+1) *10 = 30

			//.........//

			//--> arr2[19] = (19+1)*10 = 200

			//System.out.println("Value at index - " + i + " = " + arr2[i]); //printing the data 
		}




		int arr3 [] = new int [] {10,11,12,13,14} ;  //define an array with initial values 
		
		


		for(int i = 0 ; i<arr3.length ; i++){

			System.out.println("The value at index - " + i + " = " + arr3[i]);
		}










		//		for(int i = 0; i<arr.length ; i++){
		//			
		//			int value = 0;
		//			
		//			value = arr[i];
		//			
		//			System.out.println("The value in the " + i + " th position is = " + value );
		//		}
		//	


	}

}
