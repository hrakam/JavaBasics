package com.basics.exercises;

public class SumAndAverageAfterModify1 {

		static double sum;
		static double average;
		double lowerbound = 111;
		static double upperbound = 8899;
		
		public static void main(String[] args) {
			sumOfNumbers();
	}
		
		public static void sumOfNumbers(){
			int count;
			for(count = 0; count <= upperbound; count++){
				sum = sum + count;
				if (count == upperbound){
					System.out.println("Sum is: " + sum);
					average = sum / count;
					System.out.println("Average is: " + average);
				}
			}
			
		}

}
