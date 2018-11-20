package com.basics.exercises;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
//		subStringFromString();
		subStringFromUser();
	}

	private static void subStringFromString() {
		String note = "ABCDEFG";
		
		String keyStart = note.substring(0, 2);
		String keyEnd = note.substring(2);
		
		System.out.println(keyEnd + keyStart);
	}
	
	private static void subStringFromUser(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		 String nextLine = input.nextLine();
		 
		 if(nextLine.length() > 1){
			 String newStr = null;
			 for(int i = nextLine.length()-1; i > nextLine.indexOf(0); i--){
//				 System.out.println(i);
			
			 StringBuilder newString = new StringBuilder();
				newStr = newString.append(nextLine.charAt(i)).toString();
				
			 }
			 System.out.println(newStr);
//			 System.out.println(nextLine.length());
		 }
		
	}

}
