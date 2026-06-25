package Imp_problems;
import java.util.*;
public class check_prime {
	public static boolean isprime(int num) {
		int count = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2?true:false;
	}
public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println("Enter a number to check prime or not: ");
	int num = sc.nextInt();
	
	System.out.println(isprime(num));

	}
}
