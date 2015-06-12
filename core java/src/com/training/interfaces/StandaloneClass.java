package com.training.interfaces;

import com.training.classes.Car;

public class StandaloneClass {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new A4();
		Navigatable navi = new A4();
		TechnologyPackage tp = new A4();
		Audi a = new A4();
		A4 a4 = new A4();
		Object o = new A4();
		for (String s : navi.getDirection(12L, 12)) {
			System.out.println("Step. " + s);
			
			
		}
		
		Navigatable n = new ExampleClassImplementingInterfaceThatExtendsAnotherInterface();
		TechnologyPackage t = new ExampleClassImplementingInterfaceThatExtendsAnotherInterface();
		InterfaceExtendingExample i = new ExampleClassImplementingInterfaceThatExtendsAnotherInterface();
		
		c1.moveForward();
		c2.moveReverse();
		//Long l = new Long(12);
		takePrimitvies(new Long(12));
		getType(a4);
		getType(c1);
		
	}
	
	public static void getType(Object o){
		System.out.println("______________________________");
		if(o instanceof A4)
			((A4)o).getPOI(1L, 1);
		System.out.println(o.getClass().getName());
		System.out.println("______________________________");
	}
	
	public static void takePrimitvies(long p){
		System.out.println(p);
	}
	

}
