package ExceptionHandling;

import java.util.Scanner;

public class MultipleExceptions {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int fnum = sc.nextInt();
	System.out.println("Enter a second number : ");
	int lnum = sc.nextInt();
	int [] arr = {12, 23, 24, 56};
	System.out.println("Enter a index find the values inside index  : ");
	int n = sc.nextInt();
	try {
		int result = fnum/lnum;
		System.out.println("Output : "+result);
	}
	catch(ArithmeticException ae) {
		System.err.println("Math error");
	}
	try {
		System.out.println("Array value  : "+arr[n]);
	}
	catch(ArrayIndexOutOfBoundsException ae ) {
		System.err.println("Array index out of bound ...");
	}
}
}
