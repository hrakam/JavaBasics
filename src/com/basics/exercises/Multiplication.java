package com.basics.exercises;

public class Multiplication {

	static int multi;
	static int num;

	public static void main(String[] args) {

		Multiplication obj = new Multiplication();
		obj.multiplication();
	}

	void multiplication() {
		num = 2;
		for (int i = 1; i <= 20; i++) {
			multi = num * i;
			System.out.println(num + " * " + i + " = " + multi);
			
			if (multi % 5 == 0) {
				System.out.println(multi + " devided by 5");
			}
		}
	}
	
}
