package com.coding.bat.warmup1;

public class Diff21 {

	/*
	 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21. 
	 */
	
	public static void main(String[] args) {
		System.out.println(diff21(10));
		System.out.println(diff21(11));
		System.out.println(diff21(21));
		System.out.println(diff21(40));
		System.out.println(diff21(-10));
	}
	
	public static int diff21(int n) {
		int diff = 21 - n;
		int more = (n - 21) * 2;
		if(n <= 21){
		return diff;
		}
		return more;
		  
		}

}
