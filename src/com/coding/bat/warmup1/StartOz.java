package com.coding.bat.warmup1;

public class StartOz {
	
	/*
	 * Given a string, return a string made of the first 2 chars (if present), 
	 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
	 */

	public static void main(String[] args) {
		System.out.println(startOz("ozymandias"));
		System.out.println(startOz("bzoo"));
		System.out.println(startOz("oxx"));
		System.out.println(startOz("o"));
		System.out.println(startOz("abc"));
		System.out.println(startOz(""));
	}
	
	public static String startOz(String str) {
		String resultString = "";
		if (str.length() >= 1 && str.charAt(0) == 'o' ) {
			resultString =  resultString + str.charAt(0);
			}
		if (str.length() >= 2 && str.charAt(1) == 'z') {
			resultString =  resultString + str.charAt(1);
			}
		
		return resultString;
	}
}
