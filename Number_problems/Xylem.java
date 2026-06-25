package Number_problems;

	import java.util.*;

	public class Xylem {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int n = num;
	        int extremeSum = 0;
	        int meanSum = 0;

	        // Extract last digit (extreme)
	        int lastDigit = n % 10;
	        extremeSum += lastDigit;
	        n = n / 10;

	        // Process middle digits
	        while (n > 9) {
	            int digit = n % 10;
	            meanSum += digit;
	            n = n / 10;
	        }

	        // Add first digit (extreme)
	        extremeSum += n;

	        // Check condition
	        if (extremeSum == meanSum) {
	            System.out.println(num + " is a Xylem number.");
	        } else {
	            System.out.println(num + " is a Phloem number.");
	        }
	    }
	}

