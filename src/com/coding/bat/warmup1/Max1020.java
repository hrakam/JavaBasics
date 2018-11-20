package com.coding.bat.warmup1;

public class Max1020 {

	/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
	 */
	
	public static void main(String[] args) {
		System.out.println(max1020(11, 21));
		System.out.println(max1020(11, 12));
		System.out.println(max1020(13, 11));
		System.out.println(max1020(9, 11));
		System.out.println(max1020(9, 8));
	}
	
	public static int max1020(int a, int b) {
		int max1 = 0;
		int max2 = 0;
		if (a >= 10 && a <= 20) {
			max1 = a;
		}
		if (b >= 10 && b <= 20) {
			max2 = b;
		}
		if (max1 > max2) {
			return max1;
		}
		if (max1 < max2) {
			return max2;
		}
		return 0;
	}
}
