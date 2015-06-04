package com.training.operators;

import com.training.classes.Car;

public class Operators {

	public static void main(String[] args) {
		
		int i = 10;
		int j;
		j = i;
		System.out.println(j);
		
		Car c = new Car();
		c.$color="blue";
		
		Car c1;
		c1=c;
		c1.$color="red";
		
		System.out.println(c.$color);
	}
	
	
}
