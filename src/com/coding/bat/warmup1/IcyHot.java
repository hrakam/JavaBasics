package com.coding.bat.warmup1;

public class IcyHot {

	/*
	 * Given two temperatures, return true if one is less than 0 and the other is greater than 100. 
	 */
	
	public static void main(String[] args) {
		System.out.println(icyHot(10,100));
		System.out.println(icyHot(-10,101));
	}
	
	public static boolean icyHot(int temp1, int temp2) {
		if((temp1 < 0 && temp2 > 100) || (temp1 > 0 && temp2 < 100)) {
			return true;
		}
		return false;
	}

}
