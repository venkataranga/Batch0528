package com.training.classes;

public class Main {

	public static void main(String[] args) {
	
		Person p1 = new Person();
		p1.name = "Manoj";
		p1.age = 22;

		Person p2 = new Person();
		p2.name = "Harsha";
		p2.age = 22;
		
		Person p3 = new Person();
		p3.name = "Ravi";
		p3.age = 35;
		
		p1.giveMeTheName();
		p2.giveMeTheName();
		p3.giveMeTheName();
		
		System.out.println("_________________________");
		
		Car c1 = new Car();
		c1.make = new String("HONDA");
		c1.model = "ACCORD";
		c1.type = "Sedan";
		c1.color = "White";
		
		Car c2 = new Car();
		c2.make = "BMW";
		c2.model = "X5";
		c2.type = "SUV";
		c2.color = "Grey";
		
		c1.moveForward();
		c1.moveReverse();
		
		c2.moveForward();
		c2.moveReverse();
		
		Integer a = new Integer(10);
		int b = 10;
		a=10;
				
	}

}
