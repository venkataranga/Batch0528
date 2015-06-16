package com.training.constructors;

import com.training.classes.Car;
import com.training.interfaces.A4;

public class Standalone {

	public Standalone(){
		
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Car c2 = new Car("accord");
		Car c3 = new Car("red", "civic");
		A4 a4 = new A4("blue", "abc", 4, 15, 12);
		
		
		ClassWithPrivateConstructor c = ClassWithPrivateConstructor.getInstance();
		
	}
	
}
