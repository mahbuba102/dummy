package com.talentech.methodoverloading;

public class Loan { 
	
	
	int creditscore;
	long salary;
	int age ;
	
	/// ------------constructor overloading ---------------
	public Loan(){
		this(780,10500,30);
		System.out.println("inside no parm constructor");
	}
	
	public Loan(int creditscore, long salary){
		
		this.creditscore = creditscore;
		this.salary = salary;
		
		System.out.println("inside second constructor");
		//nothing
	}
	
	public Loan(int creditscore, long salary,int age){
		
		this.creditscore = creditscore;
		this.salary = salary;
		this.age = age;
		
		System.out.println("inside third constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		Loan loan1=  new Loan();
//		
//		Loan loan2 = new Loan(780,105000);
//		
//		Loan loan3 = new Loan(780,105000,30);
		
	}
	
	


}
