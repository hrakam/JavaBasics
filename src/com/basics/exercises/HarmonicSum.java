package com.basics.exercises;

public class HarmonicSum {

	static int maxDenominator = 50000;
	static double sumL2R = 0.0;
	static double sumR2L = 0.0;

	public static void main(String[] args) {
		calculateHarmonicSum();
	}

	public static void calculateHarmonicSum() {
		for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
			int number = 1;
			sumL2R = number + number / denominator;
		}
		System.out.println("Sum from left to right is = " + sumL2R);

		for (int denominator = 5000; denominator <= maxDenominator; --denominator) {
			int number = 1;
			if (denominator > 0) {
				sumR2L = number + number / denominator;
			}
		}
		System.out.println("Sum from right to left is = " + sumR2L);

		double difference = sumR2L - sumL2R;

		System.out.println("Difference is = " + difference);
	}

}
