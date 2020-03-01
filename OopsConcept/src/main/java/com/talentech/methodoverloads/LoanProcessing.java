package com.talentech.methodoverloads;

public class LoanProcessing {


	public static void main(String[] args) {

		boolean houseLoanApproved = approveLoan(100000,650.00,18);
		boolean creditCardApproved = approveLoan(100000,650.00);

		if (houseLoanApproved){

			System.out.println("House Loan Approved");

		}

		if (creditCardApproved){

			System.out.println("Credit Card Approved");

		}
	}

	private static boolean approveLoan(int income, double creditscore) {

		boolean approved = false;

		if(income>=35000){

			if(creditscore >= 620.00){

				approved = true;

				System.out.println(" Dear Customer, You are Aapproved for a loan !"); //Happy Path

			}
			else{
				System.out.println(" Ooops !, You are not eligible for a House Loan !"); //Sad Path
			}

		}


		else{

			System.out.println(" Ooops !, You are not eligible for a House Loan !"); //Sad Path
		}

		return approved;
	}

	private static boolean approveLoan(int income, double creditscore, int age) {
		boolean approved = false;

		if(income>=35000){

			if(creditscore >= 620.00 && age >18){

				approved = true;

				System.out.println(" Dear Customer, You are Aapproved for a loan !"); //Happy Path

			}
			else{


				System.out.println(" Ooops !, You are not eligible for a House Loan !"); //Sad Path
			}

		}


		else{

			System.out.println(" Ooops !, You are not eligible for a House Loan !"); //Sad Path
		}

		return approved;
	}


}
