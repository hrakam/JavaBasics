package com.coding.bat.warmup2;

public class StringSplosion {

	public static void main(String[] args) {
		
		System.out.println(stringSplosion("Code"));
		

//Given a non-empty string like "Code" return a string like "CCoCodCode".

//stringSplosion("Code") → "CCoCodCode"
//stringSplosion("abc") → "aababc"
//stringSplosion("ab") → "aab"
		
		  

	}
	
	public static String stringSplosion(String str) {
		  String newString = "";
			  for (int i = 0; i < str.length(); i++){
				  newString = newString + str.substring(0, i+1);
			  }  
			  
		  return newString; 
		 } 

}
