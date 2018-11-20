package com.basics.exercises;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class PrintNumberInWord {

//	int number = 10;
	public static void main(String[] args) {
//		PrintNumberInWord print = new PrintNumberInWord();
		System.out.println("Provided number is: "+ numberInWordFromKeyboard());
//		System.out.println("Number in word is: "+ print.numberInWordFromKeyboard());
	}
		public static String numberInWord(int number){
			switch(number){
			case 1:
			return "ONE";
			case 2: 
			return "TWO";
			case 3: 
			return "THREE";
			case 4: 
			return "FOUR";
			case 5: //System.out.println("FIVE");
			return "FIVE";
			default:
			return "Other";
			}
		}
		
		public static String numberInWordFromKeyboard(){
			
			Scanner enter = new Scanner(System.in);
			System.out.println("Enter a number between 1 and 5");
			int number = enter.nextInt();
			if (number <= 5){
				return numberInWord(number);
			} else
				System.out.println(number + " is not in the range hence priting Other...");
			return null;
		}		
}
