package com.training.Arrays;

import com.training.classes.Car;

public class MultiDArrays {

	public static void main(String[] args) {
		int[] oneD = new int[2];
		oneD[0] = 1;
		oneD[1] = 2;
				
		int[][] mutilDArr = new int[2][2];
		mutilDArr[0] = new int[]{1,2};
		mutilDArr[1] = new int[]{3,4};
		System.out.println(mutilDArr[0][0]);
		System.out.println(mutilDArr[0][1]);
		System.out.println(mutilDArr[1][0]);
		System.out.println(mutilDArr[1][1]);
		
		int[][] muti = new int[3][];
		muti[0] = new int[10];
		muti[1] = new int[1];		
		muti[2] = oneD;
		
		int[][][][][] fiveD = new int[2][][][][];
		fiveD[0] = new int[2][2][2][2];
		
		Car[][] twoDCar = new Car[1][5];
		
	}

}
