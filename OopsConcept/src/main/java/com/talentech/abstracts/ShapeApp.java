package com.talentech.abstracts;

public class ShapeApp {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
        
        System.out.println("Area of a Circle : " + s1.area());
        System.out.println("Area of a Rectangle : " + s2.area());
          
//        System.out.println(s1.toString()); 
//        System.out.println(s2.toString()); 
	}

}
