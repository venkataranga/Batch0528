package com.training.ifblocksandloops;

import com.training.classes.Car;

public class IfAndSwitchExamples {
	
	public static void main(String[] args) {
		int i=10;
		
		Car c2 = new Car();
		c2.$color="yellow";
		c2._model="honda";
		c2.type1="Accord";
		c2.make="honda";
		
		
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
		}else if(c2==null) 
			System.out.println("c2 is null");
	
		if(c2._model!=null) 
		System.out.println("honda color is not blue or make is not honda");
		
		System.out.println("if blocks are completed ");
	
		
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
