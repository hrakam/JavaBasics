package com.coding.bat.warmup1;

/*
 * Return true if the given string contains between 1 and 3 'e' chars. 
 */

public class StringE {

	public static void main(String[] args) {
		System.out.println(stringE("haritha"));
		System.out.println(stringE("shekhar"));
		System.out.println(stringE("e"));
		System.out.println(stringE("Heelele"));
	}
	
	public static boolean stringE(String str) {
		int count = 0;

		  for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == 'e') count++;
//		     alternately: str.substring(i, i+1).equals("e")
		  }

		  return (count >= 1 && count <= 3);
	}

//	public static boolean stringE(String str) {
//		 if(str.length() == 1){
//					char chatAt0 = str.charAt(0);
//					if(chatAt0 == 'e'){
//						return true;
//					}
//				}
//					if(str.length() >= 2){
//					String substring = str.substring(1, 3);
//					if(substring.contains("e")){
//						return true;
//					}
//				}
//				return false;
//		}

	
}
