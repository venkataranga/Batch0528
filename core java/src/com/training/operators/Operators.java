package com.training.operators;

import com.training.classes.Car;

public class Operators {

	public static void main(String[] args) {
		
		int i = 10;
		int j;
		j = i;
		System.out.println(j);
		
		Car c = new Car();
		c.$color="blue";
		
		Car c1;
		c1=c;
		c1.$color="red";
		
		System.out.println(c.$color);
		
		i++;
		System.out.println(i);
		
		boolean b = true;
		System.out.println(!b);
		System.out.println(11%2);
		
		System.out.println(i==11);
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println(s1==s2);
		
		c1.$color="yellow";
		c1._model="honda";
		c1.type1="Accord";
		
		Car c2 = new Car();
		c2.$color="yellow";
		c2._model="honda";
		c2.type1="Accord";
		c2.make="honda";
		
		System.out.println("c1==c2: "+(c1==c2));
		c2 = c1;
		System.out.println("c1==c2: "+(c1==c2));
		
		if(i==11 && (c2.$color.equals("blue") && c2.make.equals("honda"))){
			System.out.println("i value is 11 and c2 car color is blue");
			
		}
		if(i==11 || (c2.$color.equals("blue") && c2.make.equals("honda"))){
			System.out.println("i value is 11 and c2 car color is blue");
			
		}
		
		
		if(c2.$color.equals("blue") && c2.make.equals("honda")){
			System.out.println("i value is 11 and c2 car color is blue");
			if(c2.$color!=null)
				System.out.println("c2 has some color");
			
			
		}else if (i==11){
			System.out.println("else if is executed, i value is 11");
		}else if(c1==null) 
			System.out.println("c1 is null");
	
		if(c2._model!=null) 
		System.out.println("honda color is not blue or make is not honda");
		
		System.out.println("if blocks are completed ");
	
		i=10;
		switch(i+10){
		
			case 10:
				System.out.println("case 10 is selected");
				System.out.println();
				break;
			case 11:
				System.out.println("case 11 is selected");
			case 12:
			case 13:	
				System.out.println("case 12 is selected");
				break;
			default:
				System.out.println("default case is selected");
		}
		
		switch(c2.$color){
			case "red":
				System.out.println("red color case is selected");
				break;
			case "blue":
				System.out.println("red color case is selected");
				break;
			case "yellow":
				System.out.println("red color case is selected");
				break;
		}
		
		
	}
	//Home work
	public void dsom(int i){
	
		switch(i){
		
		}
		
	}
	
}
