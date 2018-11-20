package com.basics.exercises.collections;

import java.util.Iterator;

public class Practise4 {

	public static void main(String[] args) {
		
	}
	
//	 Consider the MyArray example handed out in class. Is the following code legal? If so, what does it print? If
//	 not, why isn’t it legal?

		public void test1(){
		MyArray a = new MyArray(10);
		a.set(0,"hi");
		a.set(1,"there");
		Iterator i = a.iterator();
		System.out.println(i.next());
		}
		
		public void test2(){
//			5. What about the following rather similar code fragment?
			MyArray a = new MyArray(10);
			a.set(0,"hi");
			a.set(1,"there");
//			MyIterator i = a.iterator();
//			System.out.println(i.next());
		}

		public void test3(){
//			6. What about this one?
			MyArray a = new MyArray(10);
			a.set(0,"hi there");
//			Iterator i = new MyArray.MyIterator();
//			System.out.println(i.next());
		}
}
