package com.talentech.abstracts;

//Java program to illustrate the 
//concept of Abstraction 
abstract class Shape  
{ 
	String color; 

	// these are abstract methods 
	abstract double area(); 

	// abstract class can have constructor 
	public Shape(String color) { 
		System.out.println("Shape constructor called"); 
		this.color = color; 
	} 

	// this is a concrete method 
	public String getColor() { 
		return color; 
	} 
} 