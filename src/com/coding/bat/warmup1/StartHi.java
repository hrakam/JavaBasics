package com.coding.bat.warmup1;

public class StartHi {

	/* 
	 * Given a string, return true if the string starts with "hi" and false otherwise. 
	 */
	
	public static void main(String[] args) {
		System.out.println(startHi("hello"));
		System.out.println(startHi("hi"));
		System.out.println(startHi("hihello"));
		System.out.println(startHi("hellohi"));
	}
	
	public static boolean startHi(String str) {
		if (str.startsWith("hi")){
			return true;
		}
		return false;
	}
}
