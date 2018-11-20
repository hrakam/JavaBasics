package com.coding.bat.warmup1;

public class SumDouble {

	/*
	 * Given two int values, return their sum. Unless the two values are the same, then return double their sum
	 */
	
	public static void main(String[] args) {
		System.out.println(sumDouble(1, 3));
		System.out.println(sumDouble(2, 2));
		System.out.println(sumDouble(-1, 3));
		System.out.println(sumDouble(-1, -1));
	}
	
	public static int sumDouble(int a, int b) {
		int sum = a + b;
		  if(a == b){
		  return sum * 2;
		  } 
		  return sum;
		}

}
