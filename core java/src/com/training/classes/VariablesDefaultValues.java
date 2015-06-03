package com.training.classes;

public class VariablesDefaultValues {
	
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bo;
	static char c;
	static MathOp m = null;
	
	@Override
	public String toString() {
		return "VariablesDefaultValues [b=" + b + ", s=" + s + ", i=" + i
				+ ", l=" + l + ", f=" + f + ", d=" + d + ", bo=" + bo + ", c="
				+ c +", m="+m+ "]";
	}
	
	public static void main(String[] args) {
		System.out.println(new VariablesDefaultValues().toString());
		int i=10;
		System.out.println(i);
		m = new MathOp();
		m=null;
	}
	

}
