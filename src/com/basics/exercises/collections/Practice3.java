package com.basics.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.basics.exercises.collections.Practice3.ListTest.LinkedListTest;
import com.basics.exercises.collections.Practice3.ListTest.MapTest;

public class Practice3 {

	public static void main(String[] args) {

//		ListTest.listMethod();
//		LinkedListTest.linkedListMethod();
		MapTest.mapMethod();
	}

	static class SetTest {
		public void setMethod() {
			Set<Double> numbers = new HashSet<Double>();

			numbers.add(1.1);
			numbers.add(2.3);
			numbers.add(3.4);

			double sum = 0;

			for (double num : numbers) {
				sum = sum + num;
			}

			System.out.println(sum);

			System.out.println(Arrays.toString(numbers.toArray()));
		}
	}

	static class ListTest {
		public static void listMethod() {
			List<String> workdays = new ArrayList<String>();

			workdays.add("Monday");
			workdays.add("Tuesday");
			workdays.add("Wednesday");
			workdays.add("Thursday");
			workdays.add("Friday");

			System.out.println("List Output: " + workdays);

		}
		
		
		static class LinkedListTest {
			public static void linkedListMethod() {
				List<String> workdays = new LinkedList<String>();

				workdays.add("Monday");
				workdays.add("Tuesday");
				workdays.add("Wednesday");
				workdays.add("Thursday");
				workdays.add("Friday");

				System.out.println("Linked List Output: " + workdays);

			}
		}

		static class MapTest {
			public static void mapMethod() {
				Map<Number, String> workDays = new HashMap<Number, String>();

				workDays.put(1, "Monday");
				workDays.put(2, "Tuesday");
				workDays.put(3, "Wednesday");
				workDays.put(4, "Thursday");
				workDays.put(5, "Friday");
				workDays.put(6, "Saurday");

				System.out.println("Map before clear " + workDays.containsKey(1));
				
				for (Number key : workDays.keySet()) {
					String values = workDays.get(key);
					System.out.println("Map output before: " + key + " " + values);
				}
				
//				for (String value : workDays.values()) {
//					System.out.println("Map output: " + value);
//				}
				
				workDays.put(1, "Sunday");
				
				for (Number key : workDays.keySet()) {
					String values = workDays.get(key);
					System.out.println("Map output after: " + key + " " + values);
				}
				
				workDays.clear();
				System.out.println("Map after clear " + workDays.containsKey(1));

			}

		}

	}

	}

