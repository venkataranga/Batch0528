package com.training.classes;

public class MathOp {

	 int add(int a , int b){
		return a+b;
 	 }
	 public static MathOp getMathOpInstance() {
		 MathOp m1 = new MathOp();
		 MathOp m2 = new MathOp();
		 MathOp m3 = new MathOp();
		 return m2;
	 }
	 public static void main(String[] args) {
	
		 MathOp m = MathOp.getMathOpInstance();
		int c = m.add(123, 2312);
		System.out.println(m.add(123, 2312));
		 
	 }
}
