package com.basics.exercises;

public class SumAndAverageAfterModify2 {

	static double sum;
	static double average;
	double lowerbound = 1;
	static double upperbound = 100;

	public static void main(String[] args) {
		sumAndAvgOfOdds();
	}

	public static void sumAndAvgOfOdds() {
		int count;
		for (count = 0; count <= upperbound; count++) {
			if (count % 2 != 0) {
				sum = sum + count;
			}
		}
		System.out.println("Sum is: " + sum);
		average = sum / count;
		System.out.println("Average is: " + average);

	}

}
