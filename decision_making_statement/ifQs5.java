package decision_making_statement;
import java.util.*;
public class ifQs5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Num :");
	int num =sc.nextInt();
 int sqr = (int)Math.sqrt(num);//type casting sqrt method is helps to find 
	 //find the perfect square
 int check = sqr*sqr;
 if(num==check) {
	 System.out.println("Number is perfect Square");
 }
}
}
