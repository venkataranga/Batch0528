package com.training.innerclasses;

import java.io.Serializable;

public class OuterClass {

	private int i;
	public Serializable s1;
	class InnerClass {
		public void print() {
			
			System.out.println(this.getClass().getName());
			System.out.println(OuterClass.this);
			printOuterI(OuterClass.this);
			
		}
		public void printOuterI(OuterClass outter){
			System.out.println(outter.i);
		}
	}
	
	
	public OuterClass(int i){
		this.i = i;
		
	}
	
	public void createOuterClassInstance(){
		//InnerClass in = new InnerClass();
		
	}
	
	public void methodLocalInnerClass(final int j){
		
		int localvariable;
		class MethodLocal implements Serializable {
			int local=0;
			public  void doIHaveAccessToPrivateVraibles(){
				System.out.println(i);
				System.out.println(j);
			}
		}
		
		
		MethodLocal ml = new MethodLocal();
		ml.doIHaveAccessToPrivateVraibles();
		method(ml);
		class MethodLocal2{
			public void some(){
				MethodLocal l = new MethodLocal();
				System.out.println(l.local);
			}
		}
	}
	
	
	public void method(Serializable s){
		this.s1=s;
	}
	
	
	
}
