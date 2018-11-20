package com.basics.exercises.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Practise2 {

	public static void main(String[] args) {

		Set<String> names = new TreeSet<String>();
		
		names.add("3one");
		names.add("1three");
		names.add("2two");
		
		System.out.println(names);
		
		String allNames = "";
		
		for(String name : names){
			allNames = allNames + " " + name;
		}
		
		System.out.println(allNames);
	}

}
