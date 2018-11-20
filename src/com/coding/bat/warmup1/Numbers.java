package com.coding.bat.warmup1;

public class Numbers {

	public static void main(String[] args) {
		numberCheck(40);
	}

	private static void numberCheck(int num) {
		for(int i = 1; i <= num; i++){
			
			if( i % 3 == 0 ){
				System.out.println("foo");
			}else if( i % 5 == 0 ){
					System.out.println("bar");
			} else if( i % 7 == 0 ){
				System.out.println("jaz");
			} else if (i % 3 == 0 && i % 5 == 0){
				System.out.println("fooBar");
			} else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
				System.out.println("fooBarjaz");
			}else {
				System.out.println(i);
			} 
		}
		
	}

}
