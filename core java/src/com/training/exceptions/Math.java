package com.training.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Math {

	static String s; 
	public static void main(String[] args)    {
		
		try {
			if(divide(1, 1))
				return;
			s.charAt(2);
			FileInputStream fi = new FileInputStream(new File("/Volume/Data/sample.txt"));
		} catch (DivideByZeroException e) {
			e.printStackTrace();
		}catch (FileNotFoundException fe){
			fe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("Finally block");
		}
		
		System.out.println("after divide method");
		
		

	}
	
	public static boolean divide(int a, int b) throws DivideByZeroException{
		if(b==0)
			throw new DivideByZeroException("cannot divide by 0");
		System.out.println("result is: "+a/b);
		return true;
	}

}
