package com.training.classes;

public class Main {

	public static void main(String[] args) {
		
		int i;
		char c;
	
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
		
		Car c1;
		c1= new Car();
		
		Car.make = new String("HONDA");
		c1._model= "ACCORD";
		c1.type1= "Sedan";
		c1.$color = "White";
		
		Car c2 = new Car();
		Car.make = "BMW";
		c2._model = "X5";
		c2.type1 = "SUV";
		c2.$color = "Grey";
		
		c1.moveForward();
		c1.moveReverse();
		
		c2.moveForward();
		c2.moveReverse();
		//new Car();
		
		System.out.println(c1.make);
		Integer a = new Integer(10);
		int b = 10;
		a=10;
				
	}

}
