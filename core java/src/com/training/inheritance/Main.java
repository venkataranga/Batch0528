package com.training.inheritance;

public class Main {

	Dog dog;
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.name="puppy";
		d.age=2;
		d.type=d.getClass().getName();
		d.weight=12;
		
		d.bark();
		
		Cat c = new Cat();
		c.name="cat";
		c.eat();
		
	}
	
}
