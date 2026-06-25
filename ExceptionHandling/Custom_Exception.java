package ExceptionHandling;

import java.util.Scanner;

public class Custom_Exception {
static void check(int age ) throws InvalidAgeException{
	if(age< 18) {
		throw new InvalidAgeException("You can't vote ");
	}else {
		System.out.println("Welcome to voting machine...");
	}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Age : ");
	int n = sc.nextInt();
	try {
		check(n);
	}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
}
}
