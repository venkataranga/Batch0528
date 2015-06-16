package com.training.enums;

public class Standalone {

	public enum Countries { IN, US, UK, AU}; 
	public static void main(String[] args) {
		States s;
		s = States.NY;
		Countries c = Countries.AU;
		System.out.println("Setting NY population to 0");
		s.setPopulation(0);
		System.out.println("NY population: "+s.getPopulation());
		System.out.println("NY AVG salaries: "+s.getAvgSalaries());
		System.out.println("NJ AVG salaries: "+States.NJ.getAvgSalaries());
		System.out.println("TX AVG salaries: "+States.TX.getAvgSalaries());
		System.out.println("TX AVG salaries: "+States.TX);
		
		switch(s){
			case NY:
				System.out.println("NY");
			case TX:
				System.out.println("TX");
		}
		
		varArgs("1", "2");
		varArgs();
		varArgs(null);
	}
	
	public static void varArgs( String...strings ){
		if(null != strings){
			for(String s : strings){
				System.out.println(s);
			}
		}
			
	}

}
