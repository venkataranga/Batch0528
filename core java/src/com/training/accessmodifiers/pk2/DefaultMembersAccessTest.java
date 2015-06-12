package com.training.accessmodifiers.pk2;

import com.training.accessmodifiers.pk1.DefaultClassExample;

public class DefaultMembersAccessTest extends DefaultClassExample {
	
	public boolean isDefaultMemebersAccessableFromDifferentPackage(){
		//super.print();
		return false;
	}

	public static void main(String[] args) {
		
		DefaultClassExample d = new DefaultClassExample();
		//d..print();

	}

}
