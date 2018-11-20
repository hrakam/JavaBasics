package com.basics.exercises;

public class MaxFunction {
	
	public static void main(String[] args) {
		System.out.println("Max from two numbers -> " + findMaxNumber(4,13));
		
		System.out.println("Max from array of numbers -> " + findMaxNumberFromArray(8,26,7,13,20,28));
		
		System.out.println("Max from array of numbers -> " + findMaxNumberFromArray(-1));

	}

	private static int findMaxNumber(int number1, int number2) {
		if(number2 > number1){
		 return number2;
		}
		else {
			return number1;
		}
	}
	
	private static int findMaxNumberFromArray(int... number) {
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if(number[i] > max){
				max = number[i];
			}
		} 
		return max;
	}

}
