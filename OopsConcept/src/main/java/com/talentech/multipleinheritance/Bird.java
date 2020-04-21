package com.talentech.multipleinheritance;

//Bird class will implement interfaces and extend Color class
class Bird extends Color implements IFlyable,IEatable
{
	//Implement method of interfaces
	public void fly(){
		System.out.println("Bird flying");
	}
	public void eat()
	{
		System.out.println("Bird eats");
	}
	//It can have more own methods.
}
