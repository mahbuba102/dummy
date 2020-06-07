package com.talentech.datatypes;

public class StringExample {

	public static void main(String[] args) {

		String s = "I am fasting , feeling hungry today.";



		//String []  stringArrs = s.split(",");

		String []  stringArrs = s.split(" ");



		for(String item : stringArrs){

			System.out.println(item);


		}



		int len = s.length();

		System.out.println("Length of the string is : " +len);







		String s2 = "asd345*mkldg123,";

		//characters [0] = a , characters[1] = s ... so on 

		char characters [] =   s2.toCharArray();

		int length = 0 ;

		for(char c : characters){

			length++;
		}


		System.out.println("Length of the string is (without API method): " +len);


		String s3 = "asd345*mkldg123,;&&%";

		String firstString = "One";
		String secondString = "Two";

		String combined = firstString +secondString;
		String combined2 = firstString + "three";
		System.out.println("Combined : " + combined);
		//concat



		String username = "Mahbuba"; //string literals -> string pool
		String user = "Mahbuba";

		String user3 = new String ("Mahbuba").intern(); // heap area of memory 


//		if (username.equalsIgnoreCase(user)){
//			System.out.println("Yes they are same");
//
//		}
//
//
//		if(username.equalsIgnoreCase(user3)){
//			System.out.println("Yes they are same");
//
//		}

		if (username == user){

			System.out.println("Same object");
		}


		if (username == user3){

			System.out.println("Same object");
		}





	}

}
