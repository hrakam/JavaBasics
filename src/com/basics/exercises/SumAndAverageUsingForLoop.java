package com.basics.exercises;

public class SumAndAverageUsingForLoop {

	static double sum;
	static double average;
	static double lowerbound = 1;
	static double upperbound = 100;
	
//	public static double rangeFromKeyboard(){
//		Scanner number = new Scanner(System.in);
//		System.out.println("Enter range: ");
//		double range = number.nextInt();
//		return range;
//		
//	}
	public static void main(String[] args) {
		sumAndAverageOfNumbers();
	}

	public static void sumAndAverageOfNumbers() {
		for (double i = lowerbound; i <= upperbound; i++) {
			sum = sum + i;
			if (i == upperbound) {
				 System.out.println("Sum of numbers is: "+ sum);
				average = sum / i;
				System.out.println("The average is: " + average);
				i++;
			}
		}
	}
}

