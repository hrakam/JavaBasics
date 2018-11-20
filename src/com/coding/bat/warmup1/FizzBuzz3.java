package com.coding.bat.warmup1;

import java.util.Arrays;

public class FizzBuzz3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fizzBuzz3(1,16)));
	}
	
	public static String[] fizzBuzz3(int start, int end){
		
		int size = end - start;
		String[] StringValue = new String[size];
		
		for (int i = 0; i <= size-1; i++){
			
			StringValue[i] = String.valueOf(start + i);
			
			 boolean mod3 = Integer.valueOf(StringValue[i]) % 3 == 0;
			 boolean mod5 = Integer.valueOf(StringValue[i]) % 5 == 0;
			 
			 if (mod3) 
				 StringValue[i] = "Fizz";
			 if (mod5) 
				 StringValue[i] = "Buzz";
			 if (mod3 && mod5) 
				 StringValue[i] = "FizzBuz";
			 	
			 StringValue[i] = "\"" + StringValue[i] + "\"";
			
		}
		
		return StringValue;
	}

}
