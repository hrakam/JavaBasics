package com.coding.bat.warmup2;

public class CountXX {

	public static void main(String[] args) {

		System.out.println(countXX("abcxx"));
		System.out.println(countXX("abc"));
		System.out.println(countXX(""));
	}
	
//	Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
//
//
//	countXX("abcxx") → 1
//	countXX("xxx") → 2
//	countXX("xxxx") → 3

	static  int countXX(String str) {
		  int count = 0;
		    for (int i = 0; i <= str.length()-1; i++){
		    	
		    	if(str.substring(i, i+1).equalsIgnoreCase("xx")){
		    		count = count + 1;
		    	} 
		    	
		    } return count;
	}       
}
