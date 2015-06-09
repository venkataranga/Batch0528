package com.training.ifblocksandloops;

import com.training.classes.Person;

public class Loops {

	public static void main(String[] args) {
		
		int i =0;
		
		while(i<=10){
			System.out.println("in while loop, "+i+" iteration");
			i++;
		}
		
		System.out.println("___________________________");
		
		do{
			System.out.println("in do while loop");
		}while(i<=10);
		
		System.out.println("___________________________");
		
		for(int j =1, k=5; j<=10 && k>=1; j++){
			//System.out.println("in for loop's "+j+" iteration");
			System.out.println("in for loop, j: "+j+", k:"+k);
		}

		System.out.println("___________________________");
		
		int x;
		for(x=1; x<5; x++){
			System.out.println("x= "+x);
		}
		System.out.println("outside forlopp x: "+x);
		
		System.out.println("___________________________");
		
		int y=0;
		for(;y<=0;y++){
			System.out.println("y="+y);
		}
		System.out.println("___________________________");
		int z=1;
		for(;z==1;){
			System.out.println("z="+z);
			z++;
		}
		/*System.out.println("___________________________");
		for(;;){
			System.out.println("infinite for loop");
		}*/
		
		
		Person[] person = new Person[3];
		person[0] = new Person();
		person[1] = new Person();
		person[2] = new Person();
		person[0].name="Manoj";
		person[0].age=22;
		person[1].name="surendra";
		person[1].age=22;
		person[2].name="dinesh";
		person[2].age=22;
	
		traditionalForLoop(person);
	}
	
	public static void traditionalForLoop(Person[] p){
		
		for(int i=0; i<p.length; i++){
			System.out.println(p[i]);
		}
		
	}
	
}
