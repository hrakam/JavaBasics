package com.basics.exercises;

public class SumAndAverageAfterModify3 {

	static double sum;
	static double average;
	double lowerbound = 1;
	static double upperbound = 100;

	public static void main(String[] args) {
		sumOfSquares();
	}

	public static void sumOfSquares() {
		int count;
		for (count = 1; count <= upperbound; count++) {
				sum = sum + (count*count);
			}
		
		System.out.println("Sum is: " + sum);
		average = sum / count;
		System.out.println("Average is: " + average);

	}

}
