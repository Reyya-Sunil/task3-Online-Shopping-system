package OOPS.INHERITANCE.NonPrimitiveTypeCasting;

import java.util.Scanner;

public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("---Welcome to Ola---");
	System.out.println("1 : Sedan ");
	System.out.println("2 : Mini  ");
	System.out.println("3 : Luxiary");
	System.out.println("---Choose option---");
	int n = sc.nextInt();
	Cab C = null; //upcating referenced
	switch(n) {
	case 1 :{
		C= new Sedan();
		break;
	}
	case 2 :{
		C= new Mini();
		break;
	}
	case 3 :{
		C= new Lux();
		break;
	}
	default :{
		System.err.println("Invalid option has taken !");
	}
	}
	
	
}
}
