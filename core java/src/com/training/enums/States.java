package com.training.enums;

public enum States {
	TX(3627863782L){
		@Override
		public float getAvgSalaries(){
			System.out.println("Calculating TX salaries from overriden method");
			System.out.println(isIncomeTaxable());
			return 2500;
			
		}
		public boolean isIncomeTaxable(){
			return false;
		}
	},
	NJ(462343876L),
	NY(3236864332L),
	FL;	
	
	private States(long population){
		this.population=population;
	}
	private States(){
		this.population =1000000L;
	}
	private long population;

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}
	
	public float getAvgSalaries(){
		System.out.println("Calculating salaries");
		return this.population/2500;
	}
}
