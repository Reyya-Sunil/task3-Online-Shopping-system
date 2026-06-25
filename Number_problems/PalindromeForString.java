package Number_problems;
import java.util.*;
public class PalindromeForString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("ENTER YOUR STRING TO CHECK IT IS PALINDROME YES OR NO :");
	String start =sc.next();
	String rev = "";
	int i;
	for(i =start.length()-1;i>=0;i--) {
		rev= rev+start.charAt(i);
		
	}
	

if(start.equals(rev)) {
	System.out.println("YES IT IS PALINDROME");
}else {
	System.out.println("NOT A PALINDROME");
}
}
}
