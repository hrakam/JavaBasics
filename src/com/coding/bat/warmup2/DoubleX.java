package com.coding.bat.warmup2;

public class DoubleX {

	public static void main(String[] args) {
		
//		System.out.println(doubleX("axxbb"));
//		System.out.println(doubleX("axaxax"));
//		System.out.println(doubleX("xxxxx"));
		
		System.out.println(doubleXusingIndex("axxbb"));
		System.out.println(doubleXusingIndex("axaxax"));
		System.out.println(doubleXusingIndex("aaaax"));
		
//		Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
//
//       doubleX("axxbb") → true
//		 doubleX("axaxax") → false
//		 doubleX("xxxxx") → true

	}
	
	
	static boolean doubleX(String str) {
		  boolean value = false;
		  for(int i = 0; i < str.length()-1; i++){
		    if (str.charAt(i) == 'x'){
		      if(str.charAt(i+1) == 'x'){
		        return value = true;
		      } else {
		        return value = false;
		      }
		    }
		  } return value;
		} 
	
	
	static boolean doubleXusingIndex(String str) {
		boolean result = false;	
		int i = str.indexOf("x");
			
			if (i == -1){
				 result = false;
			} if (i > -1 && i + 1 == 'x'){
				 result = true;
			} return result;
			 
   }  

}
