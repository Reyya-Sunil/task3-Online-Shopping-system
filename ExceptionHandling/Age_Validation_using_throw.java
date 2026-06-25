package ExceptionHandling;

import java.util.Scanner;

public class Age_Validation_using_throw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age  : ");
		int age = sc.nextInt();
		try {
			if(age<18) {
				// creating a new object of the ArithmeticException class
				throw new  ArithmeticException("Not eligible to vote");
			}else {
                System.out.println("Welcome to the voting system.");
            }
		}
		catch(ArithmeticException ae) {
			 // Catching and printing the message
			System.err.println(ae.getMessage());
			
		}
		
	}

}
