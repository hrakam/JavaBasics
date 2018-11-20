package com.basics.exercises;

public class CheckPassFail {
	static int mark = 50;
	
	public static void main(String[] args) {
		System.out.println("The marks is: " + mark);
		checkResult();
		startOz("ozymandias");
	}
	
	 public static void checkResult(){
		 if (mark >= 50){
			 System.out.println("PASS");
		 }else{
			 System.out.println("FAIL");
		 }
	 }
	 
	 
	 public static String startOz(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0) == 'o') {
		    result = result + str.charAt(0);
		    System.out.println(result);
		  } 
		  
		  if (str.length() >= 2 && str.charAt(1) == 'z') {
		    result = result + str.charAt(1);
		    System.out.println(result);
		  } return result;
		  
		}

}
