package com.training.accessmodifiers.pk1;

public class StandAloneClass extends DefaultClassExample {

	public void privateMethodInheritanceTest(){
		print();
	}
	
	public static void main(String[] args) {
	
		DefaultClassExample d = new DefaultClassExample();
		d.sayHi();
		d.print();
		
		PublicClass p = new PublicClass();
		
		
	}

}
