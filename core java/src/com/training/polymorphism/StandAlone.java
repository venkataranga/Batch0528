package com.training.polymorphism;

import com.training.inheritance.Dog;

public class StandAlone {

	public static void main(String[] args) {
		int i =10;
		//Person p = new Person();
		Person m = new Male();
		Person f = new Female();
		//Object o1 = new Person();
		Object o2 = new Male();
		Object o3 = new Female();
		Object o4 = new StandAlone();
		Dog d = new Dog();
		o4=i;
		Person p4 = new EmptySubClass();
		//p = new Dog();
		//p.firstName="";
		//p.eat();
		m.eat("Chips",1);
		Male m1 = new Male();
		m1.firstName="First";
		m1.speak();
		
		Female f1 = new Female();
		f1.speak();
		
		m.firstName = "Male Object";
		f.firstName = "female object";
		
		m.speak();
		f.speak();
		System.out.println("_______________");
		speak(m);
		speak(new Person() {
			
			@Override
			public Person getInstance() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void eat(String foodType, int quantity) {
			System.out.println("from annonymouns person");
				
			}
		});
		
		speak(new Male());
	}
	
	public static void speak(Person p){
		System.out.println("from speak method taking person as argument");
		p.speak();
	}
	
	public static void speak(Male m ){
		System.out.println("from speak method taking Male as argument");
	}
	
}
