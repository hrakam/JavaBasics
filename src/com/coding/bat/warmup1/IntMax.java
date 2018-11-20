package com.coding.bat.warmup1;

/*Given three int values, a b c, return the largest. */

public class IntMax {

	public static void main(String[] args) {
		System.out.println(maxIntWithMaxFunction(1,2,3));
		System.out.println(maxIntWithMaxFunction(1,3,2));
		System.out.println(maxIntWithOutMaxFunction(1,3,2));
	}
	
	public static int maxIntWithMaxFunction(int a, int b, int c) {
		int max = Math.max(Math.max(a, b),c);
		return max;
	}
	
	public static int maxIntWithOutMaxFunction(int a, int b, int c) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
}
