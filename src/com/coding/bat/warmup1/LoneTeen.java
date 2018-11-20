package com.coding.bat.warmup1;

public class LoneTeen {

	/*
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, 
	 * return true if one or the other is teen, but not both. 
	 */
	
	public static void main(String[] args) {
		System.out.println(loneTeen(13, 19));
		System.out.println(loneTeen(13, 1));
		System.out.println(loneTeen(1, 19));
		System.out.println(loneTeen(14, 0));
		System.out.println(loneTeen(99, 99));
	}
	
	public static boolean loneTeen(int a, int b) {
//		if ((a >= 13 && a <= 19) && (b < 13 || b > 19) ){
//			return true;
//		} else if ((a < 13 || a > 19) && (b >= 13 && b <= 19)){
//			return true;
//		}
//		return false;
		
		return (a >= 13 && a <= 19) && (b < 13 || b > 19) || (a < 13 || a > 19) && (b >= 13 && b <= 19);	
	}

}
