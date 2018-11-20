package com.basics.exercises;

public class FibonacciSequence {

	public static void main(String[] args) {

		FibonacciSequence obj = new FibonacciSequence();
		obj.fibonacciSereies();
	}

	public void fibonacciSereies(){
		int num1 = 0; 
		int num2 = 1;
		int num3 = num1+num2;
		System.out.print(num1 + ", " + num2 + ", ");	

		do {
			System.out.print(num3 + ", ");	
			num1 = num2;
			num2 = num3;
			num3 = num1+num2;
		} while (num3 < 50);
	}
}
