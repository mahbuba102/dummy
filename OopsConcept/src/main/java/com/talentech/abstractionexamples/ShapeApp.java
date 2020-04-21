package com.talentech.abstractionexamples;

public class ShapeApp {
	
	public static void main(String[] args) {
		
	//	Shape shape = new Shape();
		
		Shape circle =  new Circle("Green",8.92);
		Shape rectangle = new Rectangle("Orange", 6.7, 8.9);
		
		System.out.println(" The area of the circle is : " + circle.calculateArea());
		
	}

}
