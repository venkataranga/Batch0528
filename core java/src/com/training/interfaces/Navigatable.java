package com.training.interfaces;

public interface Navigatable {
	public static final String PII="3.14";
	public abstract String[] getDirection(Long latitude, long longitude);
	public abstract String [] getPOI(Long latitude, long longitude);

}
