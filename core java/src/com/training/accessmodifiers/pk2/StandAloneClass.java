package com.training.accessmodifiers.pk2;

import com.training.accessmodifiers.pk1.ProtectedMembers;

//import com.training.accessmodifiers.pk1.DefaultClassExample;

public class StandAloneClass extends ProtectedMemberClassSubclass{

	
	public void print(){
		print();
	}
	public static void main(String[] args) {
		
		/*DefaultClassExample d = new DefaultClassExample();
		d.sayHi();*/
		
		ProtectedMembers p = new ProtectedMembers();
		//p.
		ProtectedMemberClassSubclass pc = new ProtectedMemberClassSubclass();
		//pc.print(p);
		
	}
	
}
