package com.coding.bat.warmup1;

public class NearHundred {

	/*
	 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
	 */
	public static void main(String[] args) {
		System.out.println(nearHundred(89));
		System.out.println("90" + nearHundred(90));
		System.out.println(nearHundred(93));
		System.out.println(nearHundred(111));
		System.out.println(nearHundred(110));
		System.out.println(nearHundred(210));
		System.out.println("-90" + nearHundred(-90));
	}
	
	public static boolean nearHundred(int n) {
		 int absolute = Math.abs(n);
		 if(n <= 100 || n == 110){
		 return (100 - absolute <= 10);
		 }
		 else if (n <= 200 || n == 210){
		 return (200 - absolute <= 10);
		 }
		 return false;

//		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}
}
		


	

	
