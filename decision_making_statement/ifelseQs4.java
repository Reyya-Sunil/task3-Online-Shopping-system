package decision_making_statement;
import java.util.*;
public class ifelseQs4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number :");
	int num = sc.nextInt();
	if(num%10==0) {
		System.out.println("Number is divisible by 10");
	}else {
		System.out.println("! Number is not divisible by 10");
	}
}
}
