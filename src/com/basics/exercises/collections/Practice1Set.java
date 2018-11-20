package com.basics.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Practice1Set {

	public static void main(String[] args) {

		Set<String> names = new HashSet<String>();

		names.add("haritha");
		names.add("shekhar");
		names.add("siddhu");
		names.add("Siddhu");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
