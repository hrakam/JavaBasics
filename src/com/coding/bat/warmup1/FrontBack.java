package com.coding.bat.warmup1;

/*Given a string, return a new string where the first and last chars have been exchanged. */

public class FrontBack {

	public static void main(String[] args) {
		stringReplace("abc");
	}

	private static String stringReplace(String str) {
		if (str.length() <= 1)
			return str;

		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length() - 1);
		String midString = str.substring(1, str.length() - 1);
		System.out.println(lastChar + midString + firstChar);
		return lastChar + midString + firstChar;
	}
}
