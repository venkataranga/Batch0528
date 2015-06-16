package com.training.constructors;

public class ClassWithPrivateConstructor {

	private ClassWithPrivateConstructor(){
		
	}
	
	public static ClassWithPrivateConstructor getInstance(){
		return new ClassWithPrivateConstructor();
	}
}
