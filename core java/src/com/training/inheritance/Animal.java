package com.training.inheritance;

public class Animal extends LivingThing{
	
	public String name;
	public int age;
	public int weight;
	public String type;
	
	public void eat(){
		System.out.println(name+" is eating");
	}

}
