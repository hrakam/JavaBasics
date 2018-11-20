package com.basics.exercises.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest<T> {
	public static void main(String[] args) {
		try {
			myMain(args);
		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void myMain(String[] args) throws IOException {

		List<String> workdays = new ArrayList<String>();
		Thread.currentThread().setPriority(1);
		Thread.currentThread().setName("Collections");
		workdays.add("5Monday");
		workdays.add("4Tuesday");
		workdays.add("3Wednesday");
		workdays.add("1Thursday");
		workdays.add("2Friday12");

		System.out.println(Thread.currentThread() + "List Output before: " + workdays);

		Collections.reverse(workdays);

		System.out.println(Thread.currentThread() + "List Output after: " + workdays);

		String min = Collections.min(workdays);

		System.out.println(Thread.currentThread() + "List Output for min: " + min);

		// MyComp comp = new MyComp();

		MyComp comp = new MyComp();
		String min2 = Collections.min(workdays, comp);

		System.out.println(Thread.currentThread() + "List Output for min2: " + min2);
		
		String name = "haritha";
//		String name = new String("haritha");
		MyClass.test(name);
		MyClass.test("haritha");
		
		"test".substring(0, 1);

	}

	static class MyComp implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			int diff = o1.length() - o2.length();
			return diff;
		}

	}
	
	static class MyClass extends  ArrayList {
		
		public static void test(String name) {
			
		}
		
	}

}
