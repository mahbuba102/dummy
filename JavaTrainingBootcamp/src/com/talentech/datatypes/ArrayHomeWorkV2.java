package com.talentech.datatypes;

public class ArrayHomeWorkV2 {


	public static void main(String[] args) {

		int numberArray [] = new int [] {10,43,9,76,89,21};


		/////////////////////////////calculate average///////////////////////////////////

		float average = calculateAvg(numberArray);

		System.out.println("Average of array elements  = " + average);


		/////////////////////////////calculate average///////////////////////////////////



		/////////////////////////////check if a value is available ////////////////////////



		boolean isAvailable = checkIfValPresentInArray(80, numberArray);

		if(isAvailable){
			System.out.println("Present");

		}

		else{

			System.out.println("Not present");
		}

		///////////////////////////check if a value is available ////////////////////////


		
		
		int newArr[] = insertValue (12,3,numberArray);
		
		for(int i = 0 ; i < newArr.length ; i++){
			System.out.print(newArr[i]+" : ");
			
		}




	}



	//val = 9 , arr = {10,43,9,76,89,21}
	//checkIfValPresentInArray(val,arr)


	private static boolean checkIfValPresentInArray(int val, int arr[]){  //val =6

		boolean isPresent = false;  //initialize a value


		for(int i = 0; i< arr.length ; i++){ //write the logic to compute or detrmine the value and change the initial vaue if required

			// 0: arr[0] == 9 => 10==9 :false
			// 1: arr[1] == 9 => 43==9 : false
			// 2: arr[2] == 9 => 9==9: True
			// 3: arr[3] == 9 => 76==9:False


			if(arr[i] == val){

				isPresent = true;
				break;

			}

		}



		return isPresent;  //return the same variable 


	}


	private static float calculateAvg(int numberArray []){


		float avg = 0;
		int sum = 0;

		for(int i = 0 ; i <numberArray.length ; i++){  //length = 6

			sum = sum + numberArray [i];

			//->> 0-iteration :sum =  0+numberArray[0] = 10
			//->>1st iteration :sum =  10+numbersArray[1] = 10+43 = 53
			//->>2nd iteration : sum  53+numberArray[2] = 53+9 = 62

		}

		avg = (float)sum/numberArray.length;   //sum -> int  : length of array -> int



		return avg;

	}

//  insertValue(val = 12,pos = 3,arr = {10,43,9,76,89,21})
	private static int [] insertValue (int value, int position , int arr[] ){
		
		int modifiedArray[] = new int [arr.length+1];
		
		
		
		for(int i= 0 ; i <modifiedArray.length; i++){
			
			if(i<position){
				
				modifiedArray[i] = arr[i];
				
			}
			
			
			else if (i==position){
				modifiedArray[i] = value;
				
			}
			
			else{
				
				modifiedArray[i] = arr[i-1];
				
			}
			
			
			
			
			
		}
		
		
		
		
		return modifiedArray;
      
		
		

	} 

}
