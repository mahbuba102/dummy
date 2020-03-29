package com.talentech.datatypes;

public class PositiveNegativeCheck {
	
	public static void main(String[] args) {
		
		double number=0;
		
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
		
	}

}
