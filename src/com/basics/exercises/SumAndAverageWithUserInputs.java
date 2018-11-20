package com.basics.exercises;

import java.util.Scanner;

public class SumAndAverageWithUserInputs {

	static double sum;
	static double average;
	static double lowerbound;
	static double upperbound;

	public static void rangeFromKeyboard() {
		Scanner lower = new Scanner(System.in);
		System.out.println("Enter lower limit of numbers: ");
		lowerbound = lower.nextDouble();
		Scanner upper = new Scanner(System.in);
		System.out.println("Enter upper limit of numbers: ");
		upperbound = upper.nextDouble();
	}

	public static void main(String[] args) {
		rangeFromKeyboard();
		if (lowerbound >= upperbound) {
			System.out.println("Lower limit must be less than Upper limit");
		} else {
			sumAndAverageOfNumbers();
		}
	}

	public static void sumAndAverageOfNumbers() {
		for (double i = lowerbound; i <= upperbound; i++) {
			sum = sum + i;
			if (i == upperbound) {
				System.out.println("Sum of numbers is: " + sum);
				// System.out.println(i);
				average = sum / i;
				System.out.println("The average is: " + average);
				i++;
			}
		}
	}

}
