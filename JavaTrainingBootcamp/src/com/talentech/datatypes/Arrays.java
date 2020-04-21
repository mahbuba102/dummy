package com.talentech.datatypes;

public class Arrays {

	public static void main(String[] args) {


		int numbers [] = new int [10];

		for(int i = 0; i <numbers.length; i++){

			numbers[i] = i;

		}


		for(int j = 0; j <numbers.length; j++){

			System.out.printf("Printing value of location %d  = %d" ,j,numbers[j]);
			System.out.println();

		}

		////////////////////////////////////////////////////////////////////////////////////

		//multi-dimensional array 

		// declaring and initializing 2D array 
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 

		// printing 2D array 
		for (int i=0; i< 3 ; i++) 
		{ 
			for (int j=0; j < 3 ; j++) 
				System.out.print(arr[i][j] + " "); 

			System.out.println(); 
		} 


	}

}
