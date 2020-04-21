package com.talentech.abstractionexamples;

public abstract class Shape {
	
	String color;
	
	
	public Shape(String color){
		System.out.println("Constructor in Parent  class called");
		this.color = color;
		
	}
	
	public String getColor(){
		return this.color;
	}
	
	
	
	abstract protected double calculateArea(); // declaration of the method with no body 

}
