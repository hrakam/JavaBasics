package com.coding.bat.warmup1;

public class In1020 {

	/*
	 * Given 2 int values, return true if either of them is in the range 10..20 inclusive. 
	 */
	
	public static void main(String[] args) {
		System.out.println(in1020(10, 0));
		System.out.println(in1020(0, 10));
		System.out.println(in1020(20, 0));
		System.out.println(in1020(0, 20));
		System.out.println(in1020(1, 10));
		System.out.println(in1020(10, 1));
		System.out.println(in1020(1, 9));
		System.out.println(in1020(1, 9));
		System.out.println(in1020(20, 10));
		System.out.println(in1020(10, 20));
	}
	
	public static boolean in1020(int a, int b) {
		return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
		  
	}
}
