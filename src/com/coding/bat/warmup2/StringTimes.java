package com.coding.bat.warmup2;

public class StringTimes {

	public static void main(String[] args) {

		stringTimes("Hi", 10);
	}
	
//	Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//			stringTimes("Hi", 2) → "HiHi"
//			stringTimes("Hi", 3) → "HiHiHi"
//			stringTimes("Hi", 1) → "Hi"
	
	public static String stringTimes(String str, int n) {
		 String str1 = "";
		  if (str.length() > 0 && n >=1 ){
			 
		    for(int i = 1; i <= n; i++){
		    	 str1 = str1 + str;
		    	} 
	    	System.out.println(str1);
		    
			  
		  } return str1;
		}

}
