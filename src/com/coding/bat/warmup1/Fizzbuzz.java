package com.coding.bat.warmup1;

public class Fizzbuzz {

	public static void main(String[] args) {

		System.out.println("false -> " + fizzBuzz("false"));
		System.out.println("blab -> " + fizzBuzz("blab"));
		System.out.println("fblab -> " + fizzBuzz("fblab"));
		System.out.println("another -> " + fizzBuzz("another"));
	}
	
	/*
	 * Given a string str, if the string starts with "f" return "Fizz". 
	 * If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". 
	 * In all other cases, return the string unchanged. (See also: FizzBuzz Code)

	 	fizzString("fig") → "Fizz"
		fizzString("dib") → "Buzz"
		fizzString("fib") → "FizzBuzz"
	 */
	
	public static String fizzBuzz(String str) {
		
		boolean f = str.startsWith("f");
		boolean e = str.endsWith("b");
		
		if (f && e) return "FizzBuzz";
		if (f) return "Fizz";
		if (e) return "Buzz";
		return str;
	}

}
