package com.training.innerclasses;

public class Main {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass(5);
		//InnerClass innerr = new InnerClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		OuterClass.InnerClass inner2 = outer.new InnerClass();
		inner.print();
		inner2.print();
		
		//inner.printOuterI(OuterClass.);
		
		OuterClass o = new OuterClass(1000000);
		o.createOuterClassInstance();
		
		o.methodLocalInnerClass(0);
	}	
	
}
