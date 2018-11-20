package com.coding.bat.warmup1;

/* Given a string, we'll say that the front is the first 3 chars of the string. 
 * If the string length is less than 3, the front is whatever is there. 
 * Return a new string which is 3 copies of the front.
 */

public class Front3 {

	public static void main(String[] args) {
		System.out.println(frontMethod3("java"));
		System.out.println(frontMethod3("ja"));
		System.out.println(repeat("haritha", 5));
		System.out.println(repeat("ab", 2));
	}

	 public static String frontMethod3(String str) {
	 if(str.length() < 3)
	 return str + str + str;
	
	 String front = str.substring(0, 3);
	 return front + front + front;
	 }

	private static String repeat(String str, int i) {
		String temp = "";
		if (str.length() > 3) {
			str = str.substring(0, 3);
		}

		for (int a = 1; a <= i; a++) {
			temp = temp + str;
		}

		return temp;
	}
}
