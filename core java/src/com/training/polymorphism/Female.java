package com.training.polymorphism;

public class Female extends Person{

	public Female(){
		this.sex = 'F';
	}
	

	@Override
	public void eat(String food, int quantity) {
		System.out.println("female is eating veg");
		
	}


	@Override
	public Person getInstance() {
		return new Female();
	}
	
}
