package com.basics.exercises;

import java.util.Arrays;

public class FibonacciSequenceWithArray {

	static int multi;
	static int num;

	public static void main(String[] args) {

		FibonacciSequenceWithArray obj = new FibonacciSequenceWithArray();
		obj.fibonacciSequence();
	}

	void fibonacciSequence(){
		int[] myIntArray = new int[20]; 
		
		myIntArray[0] = 0;
		myIntArray[1] = 1;
		
		for (int i = 2; i < myIntArray.length; i++){
			
			myIntArray[i] = myIntArray[i-1] + myIntArray[i-2];
			
		}
		
//		for (int i = 0; i < myIntArray.length; i++){
//			
//			System.out.println(myIntArray[i]);
//		}
		
//		for (int i: myIntArray){
//			System.out.println(i);
//		}
		
		System.out.println(Arrays.toString(myIntArray));
		
	}
}
