package com.talentech.abstractionexamples;

public class Rectangle extends Shape {
	

	double height;
	double width;
	
	public Rectangle(String color,double height , double width) {
		super(color);  // 1st line is a call to super class constructor
		this.height = height;
		this.width = width;
		System.out.println("Constructor of rectangle class");
		
		
	}

	@Override
	protected double calculateArea() {
		return height*width;
	}
	
	
	

}
