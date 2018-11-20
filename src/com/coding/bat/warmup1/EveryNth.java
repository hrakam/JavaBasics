package com.coding.bat.warmup1;

public class EveryNth {

	public static void main(String[] args) {
		
		everyNth("Miracle", 2);
		everyNth("abcdefg", 2);
		everyNth("abcdefg", 3);

	}
	
//	Given a non-empty string and an int N, return the string made starting with char 0, 
//	and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
//
//			everyNth("Miracle", 2) → "Mrce"
//			everyNth("abcdefg", 2) → "aceg"
//			everyNth("abcdefg", 3) → "adg"
	
	public static String everyNth(String str, int n) {
		char desiredChar = 0;
		String finalString = String.valueOf(str.charAt(0));
		  if (str.length()-1 > 1 && (n > 0)){
			  for (int i = n; i < str.length(); i++){
		    	if (i % n == 0){
		    		
		    		desiredChar = str.charAt(i);
				    finalString = finalString + desiredChar;
			         
		      } 
		    } System.out.println(finalString);

		  }   return finalString;
		} 

}
