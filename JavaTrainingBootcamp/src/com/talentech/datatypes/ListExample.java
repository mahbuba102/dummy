package com.talentech.datatypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		int a = 10; //primitive type
		Integer b = 10 ; //non - primitve type


		//int -> Integer
		//ddouble -> Double
		//float -> Float
		//long -> Long

		Integer intData = new Integer (10);
		int result = intData+10; // Integer is getting converted to int = primitive data type : unboxing


		System.out.println("result of addition : " + result);

		List<Integer> listOfNumbers =   new ArrayList<Integer> ();

		listOfNumbers.add(0,10);
		listOfNumbers.add(1,20);
		listOfNumbers.add(2,30);
		listOfNumbers.add(40);  //primitive to wrapper class type conversion - autoboxing


//		for(int number : listOfNumbers){
//
//			System.out.println(" Number is : " +  number);
//		}
//
//        listOfNumbers.remove(1);
//         
//        
//        for(int number : listOfNumbers){
//
//			System.out.println(" Number is : (after deletion)" +  number);
//		}
		
		
		for(int i = 0 ; i<listOfNumbers.size(); i++){
			
			System.out.println("Number at index - "+ i +" = "+ listOfNumbers.get(i));
			
			
		}

        
        System.out.println("Length of the list : " + listOfNumbers.size());
		/*Iterator<Integer>  it = listOfNumbers.iterator();


		while(it.hasNext()){

			System.out.println("Number is (using iterator) : " + it.next());

		}*/


	}

}
