package decision_making_statement;
import java.util.*;
public class elseifQs3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number :");
	int num = sc.nextInt();
	if(num<0) {
		System.out.println("Number is negative :"+num);
	}else if(num>0) {
		System.out.println("Number is positive :"+num);
	}else {
		System.out.println("Number is zero :"+num);
	}
}
}
