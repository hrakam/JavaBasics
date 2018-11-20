package com.coding.bat.warmup1;

public class FizzString2 {

	public static void main(String[] args) {

		 System.out.println("1 -> " + fizzString2(1));
		 System.out.println("2 -> " + fizzString2(2));
		 System.out.println("3 -> " + fizzString2(3));
		 System.out.println("4 -> " + fizzString2(4));
		 System.out.println("5 -> " + fizzString2(5));
		 System.out.println("6 -> " + fizzString2(6));
		 System.out.println("15 -> " + fizzString2(15));

	}
	
	/*
	 * Given an int n, return the string form of the number followed by "!". 
	 * So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, 
	 * and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". 
	 * Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3. 
	 * What will the remainder be when one number divides evenly into another? (See also: FizzBuzz Code and Introduction to Mod)

		fizzString2(1) → "1!"
		fizzString2(2) → "2!"
		fizzString2(3) → "Fizz!"
	 */

	public static String fizzString2(int n) {
		
		boolean mod3 = n % 3 == 0;
		boolean mod5 = n % 5 == 0;
		
		if (mod3 && mod5) return "FizzBuzz!";
		if (mod3) return "Fizz!";
		if (mod5) return "Buzz!";
		
		return n + "!";
		
	}
	
}
