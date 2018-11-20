package com.coding.bat.warmup1;

public class Makes10 {
	/*
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10. 
	 */
	public static void main(String[] args) {
		System.out.println(makes10(5, 1));
		System.out.println(makes10(10, 1));
		System.out.println(makes10(10, 10));
		System.out.println(makes10(5, 5));
	}

	public static boolean makes10(int a, int b) {
		int sum = a + b;
		return ((a == 10 || b ==10) || (sum == 10));
	}
}
