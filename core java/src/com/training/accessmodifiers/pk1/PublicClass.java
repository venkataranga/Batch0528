package com.training.accessmodifiers.pk1;

public class PublicClass {

	private void print(Object o){
		System.out.println(o);
	}
	
	public static void main(String[] args){
		PublicClass p = new PublicClass();
		p.print(p);
	}
	
	public void hello(){
		print("Hello World");
	}
	
}
