package com.talentech.abstractionexamples;

public class Circle extends Shape {

	  double radius;	
		
		
		public Circle(String color,double radius){
			super(color);  // special method in java 
			//super.color
		    this.radius = radius;
		    
		    System.out.println("Constructor in circle class is called ");
		}


		@Override
		protected double calculateArea() {
			// TODO Auto-generated method stub
			return Math.PI * Math.pow(this.radius, 2);  //pi * r^2
		}

}
