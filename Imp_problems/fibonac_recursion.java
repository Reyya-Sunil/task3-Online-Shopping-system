package Imp_problems;
import java.util.*;
public class fibonac_recursion {
	public static int fibo_code(int num) {
		if(num==0 ||num ==1) {
			return 1;
		}
		return fibo_code(num-1)+fibo_code(num-2);
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number to print fibonaci  :");
	int num = sc.nextInt();
	System.out.print("fibonaci digit : "+fibo_code(num));
	
}
}
