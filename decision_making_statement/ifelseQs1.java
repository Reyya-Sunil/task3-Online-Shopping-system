package decision_making_statement;
import java.util.*;
public class ifelseQs1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number :");
	int num = sc.nextInt();
	if(num%2==0) {
		System.out.println("Even Number :"+num);
	}else {
		System.out.println("Odd Number :"+num);
	}
}
}
