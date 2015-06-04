package com.training.Arrays;

import com.training.classes.Car;

public class Arrays {
	
	static double[] intArray;

	public static void main(String[] args) {

		
		
		int[] integerArray;
		integerArray = new int[5];
		integerArray[0] = 0;
		integerArray[1] = 1;
		integerArray[2] = 2;
		integerArray[3] = 3;
		integerArray[4] = 4;

		integerArray[3] = 23;

		System.out.println(integerArray[3]);

		Car[] carArray;
		carArray = new Car[2];
		carArray[0] = new Car();
		carArray[1] = new Car();
		// carArray[3] = new Car(); this statement will result in runtime error
		// as the carArray size is 2, we cannot store the third variable
		System.out.println(carArray.length);
		Car c1 = new Car();
		Car c2 = new Car();
		Car[] shortCutInitialization = {c1, c2, new Car()};
		shortCutInitialization[0].$color ="black";
		shortCutInitialization[0]._model ="Honda";
		System.out.println(shortCutInitialization[0]);
		shortCutInitialization[0].moveForward();
		System.out.println(shortCutInitialization.length);
		
		int[] i = {1,2,3,4,5,6};
		System.out.println(i[4]);
		
		System.out.println(intArray);
		
		
	}

}
