package decision_making_statement;
import java.util.*;
public class ifelseQs3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Number :");
	int num = sc.nextInt();
	if(num>100) {
		System.out.println("Number is greater then 100");
	}else {
		System.out.println("! Number is not greater then 100");
	}
}
}
