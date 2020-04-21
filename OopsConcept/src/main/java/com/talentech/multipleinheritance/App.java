package com.talentech.multipleinheritance;

public class App {

	public static void main(String[] args) {

        Bird b = new Bird();
        //Interface implemented methods by Bird class
        b.eat();
        b.fly();
        //Color extended method by Bird class
        b.red();
	}

}
