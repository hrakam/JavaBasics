package com.coding.bat.warmup2;

public class StringBits {

	public static void main(String[] args) {
		
		System.out.println(stringBits("Hello"));	
		System.out.println(stringBits("Hi"));
		System.out.println(stringBits("Heeololeo"));
		System.out.println(stringBits(""));

	}
	
//	Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
//	stringBits("Hello") → "Hlo"
//	stringBits("Hi") → "H"
//	stringBits("Heeololeo") → "Hello"
	
	public static String stringBits(String str) {
		
		String newString = "";
		char first = 'a';
		
		if(str.length() >= 1){
			 first = str.charAt(0);
			for (int i = 1; i < str.length(); i++){
				if (i % 2 == 0){
					 char next = str.charAt(i);
					 newString = newString + next;
				}  
		}  return first + newString;
		
		} return newString; 
		 
		
	}  

}
