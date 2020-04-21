package com.talentech.datatypes;

public class ArrayHomeWork {


	private static float calculateAverage(int[] numberArr) {

		float avg = 0;
		int sum = 0;

		for(int i = 0 ; i< numberArr.length ; i++){

			sum = sum+numberArr[i];
		}

		avg = (float) sum/numberArr.length;
		return avg;
	}



	private static int findIndex(int a, int[] numberArr) {

		int index = 0;

		for(int i = 0 ; i <numberArr.length ; i++){

			//System.out.println("Looping");

			if (numberArr[i] == a) {
				index = i;
				break;

			}
		}

		return index;
	}


	private static boolean checkIfPresent(int a, int[] numberArr) {

		boolean exists = false;

		for(int i = 0 ; i <numberArr.length ; i++){

			//System.out.println("Looping");

			if (numberArr[i] == a) {
				exists = true;
				break;

			}
		}

		return exists;
	}



	private static int[] insertValue(int val, int position, int[] numberArr) {

		int modifiedArr[] = new int [numberArr.length+1];

		for (int i = 0 ;i<modifiedArr.length ; i++){
			
			if(i<position-1){
			modifiedArr[i] = numberArr[i];
			
			}
			
			else if ( i == position-1){
				
				modifiedArr[i] = val;
			}
			
			else{
				
				modifiedArr[i] = numberArr[i-1];
			}


		}

		return modifiedArr;
	}


	public static void main(String[] args) {

		int numberArr [] = new int [] {20,50,10,15,70,36};

		///////////////////////////average//////////////////////////////////

		float avg = calculateAverage(numberArr);

		System.out.println(" The average value of the array elements is : " + avg);

		///////////////////////////average//////////////////////////////////



		//////////////////////////////////////value is present////////////////////////

		boolean containsValue = checkIfPresent(70,numberArr);

		if (containsValue){

			System.out.println("The array contains the value ");
		}
		else{
			System.out.println("The array does not contain the value ");

		}

		//////////////////////////////////////value is present////////////////////////



		///////////////////////////////find index of an element////////////////////////

		int index = findIndex(50,numberArr);

		System.out.println("Index : " + index);
		///////////////////////////////find index of an element////////////////////////




		///////////////////////////////Insert a value///////////////////////////////////

		int modifiedNumberArray[] = insertValue(90,3,numberArr);

		for (int i = 0 ;i<modifiedNumberArray.length ; i++){

			System.out.println(" Value @ position " + i + " = " + modifiedNumberArray[i]);

		}

		///////////////////////////////Insert a value///////////////////////////////////


	}





}
