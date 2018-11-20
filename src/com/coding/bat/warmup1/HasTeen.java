package com.coding.bat.warmup1;

public class HasTeen {

	/*
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
	 * Given 3 int values, return true if 1 or more of them are teen. 
	 */
	public static void main(String[] args) {
		System.out.println(hasTeen(12, 11, 10));
		System.out.println(hasTeen(13, 11, 10));
		System.out.println(hasTeen(12, 14, 10));
		System.out.println(hasTeen(12, 11, 19));
		System.out.println(hasTeen(13, 14, 19));
		System.out.println(hasTeen(20, 15, 10));
	}

	public static boolean hasTeen(int a, int b, int c) {
		 return (a >= 13 && a <= 19) || 
		         (b >= 13 && b <= 19) || 
		         (c >= 13 && c <= 19);
	}
}