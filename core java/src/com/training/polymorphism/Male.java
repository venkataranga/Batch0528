package com.training.polymorphism;

public class Male extends Person{

	public String maleString="";
	public Male(){
		this.sex = 'M';
	}
	
	public void dance(){
		System.out.println(this.firstName+" is dancing");
	}
	
	@Override
	public void speak(){
		System.out.println("Male "+this.firstName+" is speaking");
	
	}

	@Override
	public void eat(String food, int quantity) {
		System.out.println("Male is eating "+food);		
	}
	
	public void eat(){
		System.out.println("Male is eating generically");
	}
	
	//@Override
	public Male getInstance(){ return new Male();}
	
}
