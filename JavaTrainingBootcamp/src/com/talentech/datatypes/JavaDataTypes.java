package com.talentech.datatypes;

public class JavaDataTypes {



	public static void main(String[] args) {


		//String employeeName = "Mahbuba";
		int a;
		double b; //decalration 

		a = 10;
		b = 20.32d; //initialization 


		String employeeName = "Mahbuba"; //declare variables with initialization 

		int age = 30; 

		int salary = 16000;

		boolean isActive = false; 

		float fee = 24.92f;

		//double feeDouble = 24.92d;

		// Write a program to check the range of the slaries of an active employee


		if(isActive){ //checkpoint 1: active status check

			//**********************Salary Range Check starts.............***//
			if(salary < 15000){

				System.out.println("Below Average Salary ");

			}


			else if (salary >= 15000 && salary <25000){   // and - &&
				//or - ||

				System.out.println("Good Salary ");
			}

			else{

				System.out.println("Very Good Salary ");

			}

			//**********************Salary Range Check ends .............***//

		}


		else{  //this else is associated with the checkpoint 1

			System.out.println("Employee is not active - no need to check salary");

		}



		System.out.println("End of program");




		// I want to print from 0 to 10 


		int initialvalue = 0;
		

		//System.out.println( "Name : " + employeeName);

		//System.out.println("Age = " + age);


		System.out.println(" Name = " +  employeeName + ", Age : " + age + ", Salary : "+salary + ", Fee: " + fee );

		//age=29
		if(age>30){

			System.out.println("Age is greater than 30");

		}

		else if(age == 30){ //true or false

			System.out.println("Age is 30");

		}

		else{

			System.out.println("Age is less than 30");

		}



		///


		//less than 15k

		if(salary < 15000){

			System.out.println("Below Average Salary ");

		}


		else if (salary >= 15000 && salary <2500){   // and - &&
			                                         //or - ||

			System.out.println("Good Salary ");
		}

		else{

			System.out.println("Very Good Salary ");

		}





      //find the people whose age is less than 30 or salary is greater than 15k
		//age = 29,salary = 16000
		if(age <30 || salary >15000){
			
			System.out.println(" Condition true");
			
		}






		for(int i = 0 ; i <= 10 ; i=i+2){ //print 0 to 10  

			System.out.println("Iteration/Count = " + i);

		}
		
		for(int i = 10 ; i>=0 ; i-- ){
			
			//System.out.println("Iteration/Count = " + i);
			
		}
		
		
		//while loop 





		//max - limit 10

		//for loops 

		//int i = 0;

//		for(i = 0 ; i <= 10 ; i=i+1){
//
//			System.out.println("Iteration/Count = " + i);
//
//		}


		
		
		//int i = 0;
		
//		while (i <= 10){
//			
//			System.out.println("Iteration/Count = " + i);
//
//			i++; 
//		}
		
		
//		for(int i = 11 ; i <= 10 ; i=i+2){ //print 0 to 10  
//
//			System.out.println("Iteration/Count = " + i);
//
//		}
           
		
		
		//do while -- even if the condition is false it will execute at least once
		
		int j = 11;
		do {
			
			System.out.println("Iteration/Count = " + j);
			j++;
		}
		
		while (j<=10);




	}



}
