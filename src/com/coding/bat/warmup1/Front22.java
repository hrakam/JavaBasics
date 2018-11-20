package com.coding.bat.warmup1;

public class Front22 {

	/* Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, 
	 * so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there. 
	 */
	
	public static void main(String[] args) {
		System.out.println(front22("Kitten"));
		System.out.println(front22("Ki"));
		System.out.println(front22("K"));
	}
	
	public static String front22(String str) {
		if (str.length() >= 2){
			String subSting = str.substring(0, 2);
			return subSting + str + subSting;
		}
		return str + str + str;
		  
	}

}
