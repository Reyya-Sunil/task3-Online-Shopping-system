package ExceptionHandling;

import java.util.Scanner;

public class Array_Index_Safety {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] a = {12, 23, 24, 56, 76};
	System.out.println("Enter arr index to print values : ");
	int n = sc.nextInt();
	try {
	System.out.println("Array values inside index : "+a[n]);
	}
	catch(ArrayIndexOutOfBoundsException ae ) {
		System.err.println("Invalid index");
		throw ae;
	}
}
}
