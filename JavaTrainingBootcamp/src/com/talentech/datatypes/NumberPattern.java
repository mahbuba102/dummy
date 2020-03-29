package com.talentech.datatypes;

public class NumberPattern {

	public static void main(String[] args) {
		int N = 4, i, j, min; 
		System.out.println("Value of N: " + N); 

		for (i = 1; i <= N; i++)  
		{ 
			for (j = 1; j <= N; j++)  
			{ 
				min = i < j ? i : j; 
				System.out.print(N - min + 1); 
			} 

			for (int k= N-1;k>=1;k--){
				min = i < k ? i : k; 
				System.out.print(N - min + 1); 
			}

			System.out.println();
		}


		for (i = N - 1; i >= 1; i--)  
		{ 
			for (j = 1; j <= N; j++)  
			{ 
				min = i < j ? i : j; 
				System.out.print(N - min + 1); 
			} 
			for (j = N - 1; j >= 1; j--)  
			{ 
				min = i < j ? i : j; 
				System.out.print(N - min + 1); 
			} 
			System.out.println(); 
		} 
	}




}
