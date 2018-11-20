package com.coding.bat.warmup1;

public class MonkeyTrouble {
	
	/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
	We are in trouble if they are both smiling or if neither of them is smiling. 
	Return true if we are in trouble. */
	
	public static void main(String[] args){
		System.out.println(monkeyTrouble(true, true));
		System.out.println(monkeyTrouble(false, true));
		System.out.println(monkeyTrouble(true, false));
		System.out.println(monkeyTrouble(false, false));
	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		  return (aSmile && bSmile) || (!aSmile && !bSmile);
		}
}
