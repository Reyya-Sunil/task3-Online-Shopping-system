package ExceptionHandling;

import java.util.Scanner;

public class Multi_Catch_Block {
public static void main(String[] args) {

	

	try {
		// for ArithmeticException
		int num = 10/0;
		//for NullPointerException 
		String name = null;
		System.out.println(name.length());
		
	
		
	}
	
	
	catch(ArithmeticException  | NullPointerException  e) {
		 System.out.println("Caught an exception: " + e.getClass().getSimpleName());
         System.out.println("Error details: " + e.getMessage());
	}
}
}
