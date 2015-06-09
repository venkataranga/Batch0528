package com.training.polymorphism;

public abstract class Person {

	public String firstName;
	public String middleInitial;
	public String lastName;
	public char sex;
	
	public void speak(){
		System.out.println("Person is speaking");
	}
	
	public void walk(){
		speak();
		System.out.println("person is walking");
	}
	
	public  abstract void eat(String foodType, int quantity);
	
	public abstract Person getInstance();
	
}
