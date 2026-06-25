package decision_making_statement;
import java.util.*;
public class ifQs3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num = sc.nextInt();
	if(num%3==0 && num%7==0) {
		System.out.println("Num is multiple of 3 and 7 ");
	}
}
}
