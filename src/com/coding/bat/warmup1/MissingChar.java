package com.coding.bat.warmup1;

public class MissingChar {
	/*
	 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
	 * The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 
	 */

	public static void main(String[] args) {
		System.out.println(missingChar("rakam", 10));
	}
	
	public static String missingChar(String str, int n) {
		String newString = null;
		if(str.length() > 0){
			if(n <= str.length()-1 && n >= 0){
				newString = new StringBuilder(str).deleteCharAt(n).toString();
			} else {
				System.out.println("Index " + n + " is not valid for the provided string '" + str + "'");
			}
		} 
		return newString;
	}

}
