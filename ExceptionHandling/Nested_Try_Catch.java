package ExceptionHandling;

import java.util.Scanner;

public class Nested_Try_Catch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age :  ");
	int age  = sc.nextInt();
	try {
		if(age <18) {
			throw new ArithmeticException("You can't vote ");
		}try {
			if(age >=18) {
				throw new ArithmeticException("Welcome to voting machine  ");
			}
		}catch(ArithmeticException b){
			System.out.println(b.getMessage());
		}
	}catch(ArithmeticException ae) {
		System.out.println(ae.getMessage());
	}
}
}
