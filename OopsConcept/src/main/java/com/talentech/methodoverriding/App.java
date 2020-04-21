package com.talentech.methodoverriding;

public class App {
	
	public static void main(String[] args) {
		
		
		Human human = new Human ();
		
		Human christian = new Christians();
		Human muslims = new Muslims ();
		
		
		human.celebrateFestivals();
		christian.celebrateFestivals();
		
		
		
		
	}

}
