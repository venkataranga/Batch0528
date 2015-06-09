package com.training.classes;

public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String name;
	public int age;
	
	public void giveMeTheName(){
		System.out.println(this.name);
	}
	
}
