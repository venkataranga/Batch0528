package com.training.accessmodifiers.pk2;

import com.training.accessmodifiers.pk1.ProtectedMembers;

public class ProtectedMemberClassSubclass extends ProtectedMembers {
	
	public void accessProtectedMemeber(){
		print("Protected memebers are accessible through inheritance");
		ProtectedMembers p = new ProtectedMembers();
		//p.print();
		
		ProtectedMemberClassSubclass pc = new ProtectedMemberClassSubclass();
		pc.print("");
	}

}
