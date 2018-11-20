package com.basics.exercises;

public class Product1ToN {

	public static void main(String arg[]) {
		productOfNumbers1To10();
		productOfNumbers1To11();
		productOfNumbers1To12();
		productOfNumbers1To13();
		productOfNumbers1To14();
	}

	public static void productOfNumbers1To10() {
		int productOutput = 1;
		int upperBound = 10;
		for (int product = 1; product <= upperBound; product++) {
			productOutput = productOutput * product;
		}
		System.out.println("Product of numbers 1 to 10: " + productOutput);
	}
	
	public static void productOfNumbers1To11() {
		int productOutput = 1;
		int upperBound = 11;
		for (int product = 1; product <= upperBound; product++) {
			productOutput = productOutput * product;
		}
		System.out.println("Product of numbers 1 to 11: " + productOutput);
	}
	
	public static void productOfNumbers1To12() {
		int productOutput = 1;
		int upperBound = 12;
		for (int product = 1; product <= upperBound; product++) {
			productOutput = productOutput * product;
		}
		System.out.println("Product of numbers 1 to 12: " + productOutput);
	}
	
	public static void productOfNumbers1To13() {
		int productOutput = 1;
		int upperBound = 13;
		for (int product = 1; product <= upperBound; product++) {
			productOutput = productOutput * product;
		}
		System.out.println("Product of numbers 1 to 13: " + productOutput);
	}
	
	public static void productOfNumbers1To14() {
		int productOutput = 1;
		int upperBound = 14;
		for (int product = 1; product <= upperBound; product++) {
			productOutput = productOutput * product;
		}
		System.out.println("Product of numbers 1 to 14: " + productOutput);
	}
}
