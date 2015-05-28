package com.training.classes;

public class Car {
	
	String make;
	String model;
	String color;
	String type;
	
	public void moveForward(){
		System.out.println(this.color+" Color "+this.model+ " Car is moving forward");
	}
	
	public void moveReverse(){
		System.out.println(this.color+" Color"+this.model+ " Car is moving reverse");
	}
	

}
