package com.training.classes;
import java.util.List;


public class Car {

	 
	@Override
	public String toString() {
		return "Car [_model=" + _model + ", $color=" + $color + ", type1="
				+ type1 + ", list=" + list + "]";
	}

	static String make;
	String _model;
	protected String $color;
	String type1;
	List<String> list;
	
	public void moveForward(){
		System.out.println(this.$color+" Color "+this._model+ " Car is moving forward");
	}
	
	public void moveReverse(){
		System.out.println(this.$color+" Color"+this._model+ " Car is moving reverse");
	}	

	

}