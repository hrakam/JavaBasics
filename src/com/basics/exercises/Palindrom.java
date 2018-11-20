package com.basics.exercises;

import java.util.Scanner;

public class Palindrom {

public static void main(String[] args)	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter word: ");
	String word = input.next();
	String reverse = "";
	
	for (int i= word.length()-1; i >= 0 ; i-- ){
		reverse = reverse + word.charAt(i);
	}
	if (word.equals(reverse)){
		System.out.println("Enterted word is palindrom");
	}else {
		System.out.println("not a palindrom");
	}
}
	
}
