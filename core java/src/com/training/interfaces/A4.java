package com.training.interfaces;

public class A4 extends Audi{

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
