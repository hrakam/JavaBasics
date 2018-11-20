package com.coding.bat.warmup1;

public class BackAround {
	
	/*
	 * Given a string, take the last char and return a new string with the last char added at the front and back, 
	 * so "cat" yields "tcatt". The original string will be length 1 or more.
	 */

	public static void main(String[] args) {
		System.out.println(returnString("cat"));
		System.out.println(returnString("haritha"));
		System.out.println(returnString("c"));
	}

	private static String returnString(String str) {
		if (str.length() >= 1){
		 char charAtLast = str.charAt(str.length()-1);
		 String newString = charAtLast + str + charAtLast;
		 return newString;
		}
		return null;
	}

}
