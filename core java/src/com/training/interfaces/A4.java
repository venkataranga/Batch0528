package com.training.interfaces;

public class A4 extends Audi{

	
	int numberOfGears;
	int gasCapacity;
	int milage;
	
	public A4(){
		
	}
	
	
	public A4(int numberOfGears, int gasCapacity, int milage) {
		super();
		this.numberOfGears = numberOfGears;
		this.gasCapacity = gasCapacity;
		this.milage = milage;
	}
	
	

	public A4(String $color, String _model,int numberOfGears, int gasCapacity, int milage) {
		//super(_model, $color);
		this(numberOfGears,gasCapacity,milage);
		this.numberOfGears = numberOfGears;
		this.gasCapacity = gasCapacity;
		this.milage = milage;
	}


	@Override
	public String[] getDirection(Long latitude, long longitude) {
		super.getDirection(latitude, longitude);
		return new String []{"go left", "goright"};
	}

	@Override
	public void audiMethod() {
		System.out.println("audiMethod from A4 class");
		
	}

	@Override
	public String[] getPOI(Long latitude, long longitude) {
		return null;
	}

	@Override
	public String watchLane() {
		return "Alert: Watch your lane";
	}

	@Override
	public String blindSpotDetection() {
		return "Alert: Check blind spot";
	}

	
}
