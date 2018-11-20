package com.coding.bat.warmup2;

public class FrontTimes {

	public static void main(String[] args) {
	
		System.out.println(frontTimes("Ab", 4));
		System.out.println(frontTimes("Chocolate", 5));
	}
	
//	Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
//	or whatever is there if the string is less than length 3. Return n copies of the front;
//
//  frontTimes("Chocolate", 2) → "ChoCho"
//	frontTimes("Chocolate", 3) → "ChoChoCho"
//	frontTimes("Abc", 3) → "AbcAbcAbc"
	
	public static String frontTimes(String str, int n) {
		String newString = "";
		if (str.length() >= 3 && (n > 0)){
			for (int i = 1; i <= n; i++){
				newString = newString + str.substring(0, 3);
			} 
		 return newString; 
		} 
		return str; 
	}
		
	}

