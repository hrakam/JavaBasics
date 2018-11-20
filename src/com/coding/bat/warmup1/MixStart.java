package com.coding.bat.warmup1;

public class MixStart {

	/*Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
	 */
	
	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks"));
		System.out.println(mixStart("pix snacks"));
		System.out.println(mixStart("piz snacks"));
		System.out.println(mixStart("p"));
	}
	
	public static boolean mixStart(String str) {
		return (str.startsWith("ix", 1));
	}
}
