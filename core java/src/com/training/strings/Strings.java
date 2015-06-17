package com.training.strings;

public class Strings {

	
	public static void main(String[] args) {
		 
		String s1 = "   hello  ";
		String s2 = "hello";
		int i1=10;
		int i2=10;
		System.out.println(i1==i2);
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println("is s1 and s2 pointing to same object: "+(s1==s3));
		System.out.println(s3==s4);
		StringBuilder sb = new StringBuilder("sample");
		sb.append(36287);
		System.out.println(sb);
		System.out.println(s1.charAt(2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.trim());
		
	}

}
