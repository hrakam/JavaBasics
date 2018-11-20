package com.coding.bat.warmup1;

public class Or35 {

	/*Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 *Use the % "mod" operator -- see Introduction to Mod 
	 */
	
	public static void main(String[] args) {
		System.out.println(returnMultipliedNumber(10));
		System.out.println(returnMultipliedNumber(9));
		System.out.println(returnMultipliedNumber(13));
	}

	private static boolean returnMultipliedNumber(int n) {
		if (n >= 1){
			if(n % 3 == 0 || n % 5 == 0){
				return true;
			} 
		}
		return false;
	}

}
