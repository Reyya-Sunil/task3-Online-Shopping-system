package Number_problems;
import java.util.*;
public class twistedPrimeNumber 

{
    
    // Recursive function to check prime
    public static boolean isPrime(int n, int i) {
        // Base cases
        if (n <= 2) {
            return (n == 2); // 2 is prime
        }
        if (n % i == 0) {
            return false; // divisible → not prime
        }
        if (i * i > n) {
            return true; // no divisor found → prime
        }
        // Recursive call with next divisor
        return isPrime(n, i + 1);
    }
    public static void revers(int num2) {
    	 int start = num2;
    	 int rev = 0;
    	 while( start != 0) {
    		 int digit = start
    	 }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = sc.nextInt();

        if (isPrime(num, 2)) {
        	revers(num);
        } else {
            System.out.println(num + " is NOT PRIME");
        }
    }
}