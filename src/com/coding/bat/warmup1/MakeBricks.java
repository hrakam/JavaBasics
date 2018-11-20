package com.coding.bat.warmup1;

public class MakeBricks {

	public static void main(String[] args) {
		System.out.println(makeBricks(3, 2, 8));
		System.out.println(makeBricks(3, 1, 8));
		System.out.println(makeBricks(3, 1, 9));
		System.out.println(makeBricks(3, 2, 10));
		System.out.println(makeBricks(3, 2, 9));
		System.out.println(makeBricks(1, 4, 11));
		System.out.println(makeBricks(1, 4, 12));
		System.out.println(makeBricks(2, 1000000, 100003));
		
	}
	
	/*
	 * We want to make a row of bricks that is goal inches long. 
	 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
	 * Return true if it is possible to make the goal by choosing from the given bricks. 
	 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

		makeBricks(3, 1, 8) → true
		makeBricks(3, 1, 9) → false
		makeBricks(3, 2, 10) → true
	 */

	public static boolean makeBricks(int small, int big, int goal){
		
		int smallSum = small * 1;
		int bigSum = big * 5;
		int wholeSum = smallSum + bigSum;
		
		if(wholeSum >= goal) return true;
		
		else return false;
	}
}
