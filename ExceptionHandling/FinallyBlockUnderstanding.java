package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlockUnderstanding {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first num : ");
	int fnum = sc.nextInt();
	System.out.println("Enter second num : ");
	int snum = sc.nextInt();
	try {
		int result = fnum /snum;
		System.out.println("Output   : " +result);
	}
	catch(ArithmeticException  ae ) {
		System.err.println("Cant be divide zero  ");
	}
	finally {
		System.out.println("Finally block should exucted always either eception is there or not ..");
	}
}
}
