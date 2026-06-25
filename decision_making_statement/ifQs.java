package decision_making_statement;
import java.util.*;
public class ifQs {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num : ");
	int num =sc.nextInt();
	int check =Math.abs(num);
	if(num == check) {
		System.out.println("Your Number is Positive :"+num);
	}
}
}
