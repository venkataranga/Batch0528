package com.training.intiblocks;

public  class IntiBlocksExample extends Parent{

	public final void print(){
		
		System.out.println("hello");
	}

	static{
		
		System.out.println("from static init block 1");
	}
	
	static{
		System.out.println("from static init block 2");
	}
	
	
	{
	
		System.out.println("From instance init block 1");
		
	}
	{
		
		System.out.println("From instance init block 2");
		
	}
	{
		
		System.out.println("From instance init block 3");
		
	}
	
	public IntiBlocksExample(){
		System.out.println("from no-arg constructor");
	}
	
}
