package decision_making_statement;
import java.util.*;
public class switchQs2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a first Num :");
	int num1 = sc.nextInt();
	System.out.print("Enter a Second Num :");
	int num2 = sc.nextInt();
	System.out.print("Enter a Operator to product (+,-,*,/):");
	String input =sc.next();
	
	switch(input) {
	case "+" :{
		int res = num1+num2;
		System.out.println("Addition :"+res);
		break;
		}
	case "-" :{
		int res = num1-num2;
		System.out.println("Subtraction :"+res);
		break;
	}
	case "*" :{
		int res =num1*num2;
		System.out.println("Multiplication :"+res);
		break;
	}
	case "/" :{
		int res =num1/num2;
		System.out.println("Division : "+res);
	}default :{
		System.out.println("!Not valid operator");
	}
	}
}
}
