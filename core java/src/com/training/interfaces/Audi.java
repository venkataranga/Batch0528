package com.training.interfaces;

import com.training.classes.Car;

public abstract class Audi extends Car implements Navigatable, TechnologyPackage {

	public static String s ;
			
	public abstract void audiMethod();
	public Audi(){
		super(s);
	}

	public Audi(String _model, String $color) {
		super(_model,$color);
		
	}
	@Override
	public String[] getDirection(Long latitude, long longitude){
		return null;
	}
}
