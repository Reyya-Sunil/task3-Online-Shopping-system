package ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class problem1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Program start ..");
	System.out.println("Enter first num : ");
	int fnum =sc.nextInt();
	System.out.println("Enter Second num : ");
	int lnum = sc.nextInt();
	 int result =0;
	 try {
	result = fnum/lnum;}
	 catch(ArithmeticException ae ) {

	System.err.println("Cannot divide by zero");
	throw ae;
	
	 }
	System.out.println("Output : "+result);
 System.out.println("Program stop...");
}
}
