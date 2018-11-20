package com.coding.bat.warmup1;

public class ParrotTrouble {
	/*
	 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
	 */

	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 10));
		System.out.println(parrotTrouble(true, 21));
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(false, 23));
		System.out.println(parrotTrouble(false, 3));
	}
	
	public static boolean parrotTrouble(boolean talking, int hour) {
		return ((talking) && (hour < 7 || hour > 20));
		  
	}

}
