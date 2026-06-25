package Number_problems;
import java.util.*;
public class PalindromePlobrems {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER YOUR NUMBER TO CHECK IT IS PALINDROME :");
	int start = sc.nextInt();
	int end = start;
	int rev = 0;

	while(end !=0) {
		int d = end%10;
		rev= rev*10+d;
		end = end/10;
		
	}
	System.out.println( "REVRESE OF THE NUMBER :" +rev);
	
	System.out.println("ANS IS PALINDROME  :"+(rev==start));
	
}
}
