package Imp_problems;
import java.util.*;
public class reverse_the_number {
	public static void reversecode(int num) {
		int rev= 0;
		while(num !=0) {
			int d = num%10;
			rev = rev*10+d;
			num /=10;
			if(num == rev) {
				System.out.println("IS PALINDROME: YES");
			}else {
				System.out.println("IS PALINDROME :NO");
			}
			
		}
		System.out.println(rev);
		
		
		
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number to REVERSE IT :");
	int num  = sc.nextInt();
	reversecode(num);


}
}
