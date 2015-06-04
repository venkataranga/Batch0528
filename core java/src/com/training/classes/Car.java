package com.training.classes;
import java.util.List;


public class Car {

	 
	@Override
	public String toString() {
		return "Car [_model=" + _model + ", $color=" + $color + ", type1="
				+ type1 + ", list=" + list + "]";
	}

	public static String make;
	public String _model;
	public String $color;
	public String type1;
	public List<String> list;
	
	public void moveForward(){
		System.out.println(this.$color+" Color "+this._model+ " Car is moving forward");
	}
	
	public void moveReverse(){
		System.out.println(this.$color+" Color"+this._model+ " Car is moving reverse");
	}	

	

}