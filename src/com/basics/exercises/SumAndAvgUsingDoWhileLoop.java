package com.basics.exercises;

public class SumAndAvgUsingDoWhileLoop {

	static double sum = 0;
	static double average = 0;
	static double lowerbound = 1;
	static double upperbound = 101;


	public static void main(String[] args) {

			sumAndAverageOfNumbers();
	}

	public static void sumAndAverageOfNumbers() {
		double i = lowerbound;
		do {
			sum = sum + i;
			i++;
			if (i == upperbound){
				System.out.println("Sum of numbers is: " + sum);
				average = sum/i;
				System.out.println("Average of numbers is: " + average);
		  }
		} while (i <= upperbound);
	}
}
