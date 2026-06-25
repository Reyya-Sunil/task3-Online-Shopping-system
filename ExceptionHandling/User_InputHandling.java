package ExceptionHandling;

import java.util.Scanner;

public class User_InputHandling {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number to display : ");
	try {
		int num = sc.nextInt();
		/// when exception will come  java skipped the all statements and find the catch block 
		System.out.println("output "+num);
		System.out.println("Output is sussefully display ...");
	}catch(Exception ae) {
		System.err.println("Invalid input, please enter number");
	}
	
	
	
}
}
