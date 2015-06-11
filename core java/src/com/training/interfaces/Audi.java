package com.training.interfaces;

import com.training.classes.Car;

public abstract class Audi extends Car implements Navigatable, TechnologyPackage {

	public abstract void audiMethod();
	
	@Override
	public String[] getDirection(Long latitude, long longitude){
		return null;
	}
}
