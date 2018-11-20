package com.basics.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class CheckOddEven {

	static int num = 15;

	public static void main(String[] args) {
		System.out.println("Provided number is: " + num);
		oddOrEvenCheck();
		
		String name = "Haritha Rakam";
		System.out.println(name);
		name.replace("Rakam", "Korivi");
		System.out.println(name);
		
		Consignment c1 = new Consignment(1, "c1");
		Consignment c10 = new Consignment(10, "c10");
		Consignment c2 = new Consignment(2, "c2");
		
		new Comparator<Consignment>() {
			@Override
			public int compare(Consignment o1, Consignment o2) {
				return  o1.id - o2.id;
			}
		};
		
		new SomeRandonInnerClassGenerated();
	}

	private static Set<String> createSet() {
		// TODO Auto-generated method stub
		return null;
	}

	static void oddOrEvenCheck() {
		if (num % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}
}

class SomeRandonInnerClassGenerated implements Comparator<Consignment> {
	@Override
	public int compare(Consignment o1, Consignment o2) {
		return o1.id - o2.id;
	}
}

class Consignment implements Comparable<Consignment> {
	public int id;
	public String code;

	public Consignment(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Consignment o) {
		return this.id - o.id;
	}

}
