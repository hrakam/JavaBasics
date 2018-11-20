package com.coding.bat.warmup1;

/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
 * Note that Math.abs(n) returns the absolute value of a number. 
 */


public class Close10 {

	public static void main(String[] args) {
		System.out.println(anotherWay(9, 20));
		System.out.println(anotherWay(12, 9));
		System.out.println(anotherWay(13, 14));
		System.out.println(anotherWay(-13, 14));
//		System.out.println(anotherWay(13, 13));
//		System.out.println(anotherWay(13, 7));
//		System.out.println(anotherWay(10, 12));
//		System.out.println(anotherWay(11, 10));
//		System.out.println(anotherWay(10, 10));
	}

	public static int close10(int a, int b) {
		int nearestNumA = 0;
		int nearestNumB = 0;
		 int absA = Math.abs(a);
		 int absB = Math.abs(b);
		 
		 if(absA != 10 && absB == 10 ){
			 return 10;
		 }if(absA == 10 && absB != 10 ){
			 return 10;
		 } if(absA == 10 && absB == 10){
			 return 0;
		 }
		 if(absA > 10 && absB > 10){
			 nearestNumA = absA - 10; 
			 nearestNumB = absB - 10; 
			 if(nearestNumA > nearestNumB){
				 return b;
			 }  if(nearestNumA == nearestNumB){
				 return 0;
			 }
			 return a;
		 }
		 if(absA > 10 && absB < 10){
			 nearestNumA = absA - 10; 
			 nearestNumB = 10 - absB; 
			 if(nearestNumA > nearestNumB){
				 return b;
			 }if(nearestNumA == nearestNumB){
				 return 0;
			 } 
			 return a;
		 }
		 
		 if(absA < 10 && absB < 10){
			 nearestNumA = 10 - absA; 
			 nearestNumB = 10 - absB; 
			 if(nearestNumA > nearestNumB){
				 return a;
			 } if(nearestNumA == nearestNumB){
				 return 0;
			 }return b;
		 }
		 if(absA < 10 && absB > 10){
			 nearestNumA = 10 - absA; 
			 nearestNumB = absB - 10; 
			 if(nearestNumA > nearestNumB){
				 return b;
			 } if(nearestNumA == nearestNumB){
				 return 0;
			 } return a;
		 }
		return 0;
		  
	}
	
	
	public static int anotherWay(int a, int b){
		 int diffA = Math.abs(a - 10);
		 int diffB = Math.abs(b - 10);
		 
		 if (diffA < diffB){
			 return a;
		 } if (diffA > diffB){
			 return b;
		 } return 0;
	}

}
